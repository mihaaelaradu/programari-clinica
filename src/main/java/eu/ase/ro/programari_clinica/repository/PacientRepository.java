package eu.ase.ro.programari_clinica.repository;

import eu.ase.ro.programari_clinica.entity.Pacient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PacientRepository extends JpaRepository<Pacient, Long> {
    List<Pacient> findByNumeContainingIgnoreCase(String nume);

    Optional<Pacient> findByEmail(String email);
}
