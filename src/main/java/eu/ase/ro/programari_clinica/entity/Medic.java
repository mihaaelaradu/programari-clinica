package eu.ase.ro.programari_clinica.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "medici")
public class Medic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nume;

    @Column(nullable = false)
    private String specializare;

    public Medic() {
    }

    public Medic(String nume, String specializare) {
        this.nume = nume;
        this.specializare = specializare;
    }

    public Long getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }
}
