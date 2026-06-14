package eu.ase.ro.programari_clinica.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notificari")
public class Notificare {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 300)
    private String mesaj;

    @Column(nullable = false)
    private LocalDateTime dataTrimitere;

    @Column(nullable = false)
    private boolean citita;

    @ManyToOne
    @JoinColumn(name = "pacient_id", nullable = false)
    private Pacient pacient;

    @ManyToOne
    @JoinColumn(name = "programare_id", nullable = false)
    private Programare programare;

    public Notificare() {
    }

    public Notificare(String mesaj, LocalDateTime dataTrimitere, boolean citita, Pacient pacient, Programare programare) {
        this.mesaj = mesaj;
        this.dataTrimitere = dataTrimitere;
        this.citita = citita;
        this.pacient = pacient;
        this.programare = programare;
    }

    public Long getId() {
        return id;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public LocalDateTime getDataTrimitere() {
        return dataTrimitere;
    }

    public void setDataTrimitere(LocalDateTime dataTrimitere) {
        this.dataTrimitere = dataTrimitere;
    }

    public boolean isCitita() {
        return citita;
    }

    public void setCitita(boolean citita) {
        this.citita = citita;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public Programare getProgramare() {
        return programare;
    }

    public void setProgramare(Programare programare) {
        this.programare = programare;
    }
}
