package eu.ase.ro.programari_clinica.response;

public class ProgramareResponse {

    private Long id;
    private String numePacient;
    private String numeMedic;
    private String dataOra;
    private String motiv;
    private String stare;

    public ProgramareResponse() {
    }

    public ProgramareResponse(Long id, String numePacient, String numeMedic, String dataOra, String motiv, String stare) {
        this.id = id;
        this.numePacient = numePacient;
        this.numeMedic = numeMedic;
        this.dataOra = dataOra;
        this.motiv = motiv;
        this.stare = stare;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public String getNumeMedic() {
        return numeMedic;
    }

    public void setNumeMedic(String numeMedic) {
        this.numeMedic = numeMedic;
    }

    public String getDataOra() {
        return dataOra;
    }

    public void setDataOra(String dataOra) {
        this.dataOra = dataOra;
    }

    public String getMotiv() {
        return motiv;
    }

    public void setMotiv(String motiv) {
        this.motiv = motiv;
    }

    public String getStare() {
        return stare;
    }

    public void setStare(String stare) {
        this.stare = stare;
    }
}