package eu.ase.ro.programari_clinica.service;

import eu.ase.ro.programari_clinica.entity.Medic;
import eu.ase.ro.programari_clinica.entity.Pacient;
import eu.ase.ro.programari_clinica.entity.Programare;
import eu.ase.ro.programari_clinica.enums.StareProgramare;
import eu.ase.ro.programari_clinica.repository.MedicRepository;
import eu.ase.ro.programari_clinica.repository.PacientRepository;
import eu.ase.ro.programari_clinica.repository.ProgramareRepository;
import eu.ase.ro.programari_clinica.request.ProgramareRequest;
import eu.ase.ro.programari_clinica.response.ProgramareResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProgramareService {

    private final ProgramareRepository programareRepository;
    private final PacientRepository pacientRepository;
    private final MedicRepository medicRepository;

    public ProgramareService(ProgramareRepository programareRepository,
                             PacientRepository pacientRepository,
                             MedicRepository medicRepository) {
        this.programareRepository = programareRepository;
        this.pacientRepository = pacientRepository;
        this.medicRepository = medicRepository;
    }

    public ProgramareResponse creeazaProgramare(ProgramareRequest request) {
        Pacient pacient = pacientRepository.findById(request.getPacientId())
                .orElseThrow(() -> new RuntimeException("Pacientul nu a fost gasit"));

        Medic medic = medicRepository.findById(request.getMedicId())
                .orElseThrow(() -> new RuntimeException("Medicul nu a fost gasit"));

        Programare programare = new Programare(
                LocalDateTime.parse(request.getDataOra()),
                request.getMotiv(),
                StareProgramare.SOLICITATA,
                pacient,
                medic
        );

        Programare programareSalvata = programareRepository.save(programare);

        return mapToResponse(programareSalvata);
    }

    public List<ProgramareResponse> getAllProgramari() {
        return programareRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    private ProgramareResponse mapToResponse(Programare programare) {
        return new ProgramareResponse(
                programare.getId(),
                programare.getPacient().getNume(),
                programare.getMedic().getNume(),
                programare.getDataOra().toString(),
                programare.getMotiv(),
                programare.getStare().name()
        );
    }
}