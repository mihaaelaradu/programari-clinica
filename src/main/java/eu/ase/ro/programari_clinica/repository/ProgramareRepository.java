package eu.ase.ro.programari_clinica.repository;

import eu.ase.ro.programari_clinica.entity.Programare;
import eu.ase.ro.programari_clinica.enums.StareProgramare;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ProgramareRepository extends JpaRepository<Programare, Long> {

    List<Programare> findByPacientId(Long pacientId);

    List<Programare> findByMedicId(Long medicId);

    List<Programare> findByStare(StareProgramare stare);

    List<Programare> findByDataOraBetween(LocalDateTime start, LocalDateTime end);

    List<Programare> findByPacientNumeContainingIgnoreCase(String numePacient);

    List<Programare> findByMedicNumeContainingIgnoreCase(String numeMedic);

    List<Programare> findByMedicIdAndStare(Long medicId, StareProgramare stare);
}