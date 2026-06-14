package eu.ase.ro.programari_clinica.repository;

import eu.ase.ro.programari_clinica.entity.Medic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicRepository extends JpaRepository<Medic, Long> {

    List<Medic> findByNumeContainingIgnoreCase(String nume);

    List<Medic> findBySpecializareContainingIgnoreCase(String specializare);
}