package eu.ase.ro.programari_clinica;

import eu.ase.ro.programari_clinica.entity.Medic;
import eu.ase.ro.programari_clinica.entity.Pacient;
import eu.ase.ro.programari_clinica.entity.Programare;
import eu.ase.ro.programari_clinica.enums.StareProgramare;
import eu.ase.ro.programari_clinica.repository.MedicRepository;
import eu.ase.ro.programari_clinica.repository.PacientRepository;
import eu.ase.ro.programari_clinica.repository.ProgramareRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class ProgramariClinicaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProgramariClinicaApplication.class, args);
    }

//    //afisare de test
//    @Bean
//    CommandLineRunner testData(
//            PacientRepository pacientRepository,
//            MedicRepository medicRepository,
//            ProgramareRepository programareRepository
//    ) {
//        return args -> {
//            Pacient pacient = new Pacient("Popescu Ion", "ion.popescu@gmail.com", "0711111111");
//            pacientRepository.save(pacient);
//
//            Medic medic = new Medic("Dr. Ionescu", "Cardiologie");
//            medicRepository.save(medic);
//
//            Programare programare = new Programare(
//                    LocalDateTime.now().plusDays(1),
//                    "Consultatie initiala",
//                    StareProgramare.SOLICITATA,
//                    pacient,
//                    medic
//            );
//            programareRepository.save(programare);
//
//            System.out.println("Pacienti: " + pacientRepository.findAll().size());
//            System.out.println("Medici: " + medicRepository.findAll().size());
//            System.out.println("Programari: " + programareRepository.findAll().size());
//        };
//    }
}