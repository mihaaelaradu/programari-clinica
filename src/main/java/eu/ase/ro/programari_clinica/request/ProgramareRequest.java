package eu.ase.ro.programari_clinica.request;

public class ProgramareRequest {

    private Long pacientId;
    private Long medicId;
    private String dataOra;
    private String motiv;

    public ProgramareRequest() {
    }

    public ProgramareRequest(Long pacientId, Long medicId, String dataOra, String motiv) {
        this.pacientId = pacientId;
        this.medicId = medicId;
        this.dataOra = dataOra;
        this.motiv = motiv;
    }

    public Long getPacientId() {
        return pacientId;
    }

    public void setPacientId(Long pacientId) {
        this.pacientId = pacientId;
    }

    public Long getMedicId() {
        return medicId;
    }

    public void setMedicId(Long medicId) {
        this.medicId = medicId;
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
}