package eu.ase.ro.programari_clinica.config;

import eu.ase.ro.programari_clinica.entity.Medic;
import eu.ase.ro.programari_clinica.entity.Notificare;
import eu.ase.ro.programari_clinica.entity.Pacient;
import eu.ase.ro.programari_clinica.entity.Programare;
import eu.ase.ro.programari_clinica.enums.StareProgramare;
import eu.ase.ro.programari_clinica.repository.MedicRepository;
import eu.ase.ro.programari_clinica.repository.NotificareRepository;
import eu.ase.ro.programari_clinica.repository.PacientRepository;
import eu.ase.ro.programari_clinica.repository.ProgramareRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

@Component
public class DataLoader implements CommandLineRunner {

    private final MedicRepository medicRepository;
    private final PacientRepository pacientRepository;
    private final ProgramareRepository programareRepository;
    private final NotificareRepository notificareRepository;

    public DataLoader(MedicRepository medicRepository,
                      PacientRepository pacientRepository,
                      ProgramareRepository programareRepository,
                      NotificareRepository notificareRepository) {
        this.medicRepository = medicRepository;
        this.pacientRepository = pacientRepository;
        this.programareRepository = programareRepository;
        this.notificareRepository = notificareRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (medicRepository.count() > 0 || pacientRepository.count() > 0
                || programareRepository.count() > 0 || notificareRepository.count() > 0) {
            return;
        }

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new ClassPathResource("seed.txt").getInputStream()))) {

            String line;
            String section = "";

            while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (line.isEmpty()) {
                    continue;
                }

                if (line.startsWith("[")) {
                    section = line;
                    continue;
                }

                String[] parts = line.split(";");

                switch (section) {
                    case "[MEDICI]" -> {
                        Medic medic = new Medic(
                                parts[0],
                                parts[1]
                        );
                        medicRepository.save(medic);
                    }

                    case "[PACIENTI]" -> {
                        Pacient pacient = new Pacient(
                                parts[0],
                                parts[1],
                                parts[2]
                        );
                        pacientRepository.save(pacient);
                    }

                    case "[PROGRAMARI]" -> {
                        Pacient pacient = pacientRepository.findById(Long.parseLong(parts[3]))
                                .orElseThrow(() -> new RuntimeException("Pacient inexistent pentru programare"));

                        Medic medic = medicRepository.findById(Long.parseLong(parts[4]))
                                .orElseThrow(() -> new RuntimeException("Medic inexistent pentru programare"));

                        Programare programare = new Programare(
                                LocalDateTime.parse(parts[0]),
                                parts[1],
                                StareProgramare.valueOf(parts[2]),
                                pacient,
                                medic
                        );
                        programareRepository.save(programare);
                    }

                    case "[NOTIFICARI]" -> {
                        Pacient pacient = pacientRepository.findById(Long.parseLong(parts[3]))
                                .orElseThrow(() -> new RuntimeException("Pacient inexistent pentru notificare"));

                        Programare programare = programareRepository.findById(Long.parseLong(parts[4]))
                                .orElseThrow(() -> new RuntimeException("Programare inexistenta pentru notificare"));

                        Notificare notificare = new Notificare(
                                parts[0],
                                LocalDateTime.parse(parts[1]),
                                Boolean.parseBoolean(parts[2]),
                                pacient,
                                programare
                        );
                        notificareRepository.save(notificare);
                    }
                }
            }
        }
    }
}