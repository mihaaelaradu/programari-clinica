package eu.ase.ro.programari_clinica.repository;

import eu.ase.ro.programari_clinica.entity.Notificare;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificareRepository extends JpaRepository<Notificare, Long> {

    List<Notificare> findByPacientId(Long pacientId);

    List<Notificare> findByProgramareId(Long programareId);

    List<Notificare> findByPacientIdOrderByDataTrimitereDesc(Long pacientId);
}