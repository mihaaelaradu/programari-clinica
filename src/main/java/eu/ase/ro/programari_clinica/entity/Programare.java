package eu.ase.ro.programari_clinica.entity;

import eu.ase.ro.programari_clinica.enums.StareProgramare;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "programari")
public class Programare {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;

    private LocalDateTime dataOra;

    @Column(length = 200)
    private String motiv;

    @Enumerated(EnumType.STRING)
    private StareProgramare stare;

    @ManyToOne
    @JoinColumn(name = "pacient_id", nullable = false)
    private Pacient pacient;
    @ManyToOne
    @JoinColumn( name = "medic_id", nullable = false)
    private Medic medic;


    public Programare() {
    }

    public Programare(LocalDateTime dataOra, String motiv, StareProgramare stare, Pacient pacient, Medic medic) {
        this.dataOra = dataOra;
        this.motiv = motiv;
        this.stare = stare;
        this.pacient = pacient;
        this.medic = medic;
    }


    public Long getId() {
        return id;
    }

    public LocalDateTime getDataOra() {
        return dataOra;
    }

    public String getMotiv() {
        return motiv;
    }

    public StareProgramare getStare() {
        return stare;
    }


    public void setDataOra(LocalDateTime dataOra) {
        this.dataOra = dataOra;
    }

    public void setMotiv(String motiv) {
        this.motiv = motiv;
    }

    public void setStare(StareProgramare stare) {
        this.stare = stare;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public Medic getMedic() {
        return medic;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public void setMedic(Medic medic) {
        this.medic = medic;
    }
}
