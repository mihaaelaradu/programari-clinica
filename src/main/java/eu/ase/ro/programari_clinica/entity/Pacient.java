package eu.ase.ro.programari_clinica.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pacienti")
public class Pacient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nume;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String telefon;

    public Pacient() {
    }

    public Pacient(String nume, String email, String telefon) {
        this.nume = nume;
        this.email = email;
        this.telefon = telefon;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}

