import java.time.LocalDate;
import java.util.HashMap;

public class Apartament {
    public enum TipCamera {
        CAMERA_DUBLA,
        CAMERA_TRIPLA,
        OPEN_SPACE,
        DUPLEX
    }

    private Integer numar;
    private Double pret;
    private Double dimensiune;
    private LocalDate dataCumpararii;
    private HashMap<String, Boolean> utilitati;
    private Integer numarBai;
    private Integer numarDormitoare;
    private Boolean areBalcon;

    public Apartament(Integer numar, Double pret, Double dimensiune, LocalDate dataCumpararii, HashMap<String, Boolean> utilitati, Integer numarBai, Integer numarDormitoare, Boolean areBalcon) {
        this.numar = numar;
        this.pret = pret;
        this.dimensiune = dimensiune;
        this.dataCumpararii = dataCumpararii;
        this.utilitati = utilitati;
        this.numarBai = numarBai;
        this.numarDormitoare = numarDormitoare;
        this.areBalcon = areBalcon;
    }

    public Integer getNumar() {
        return numar;
    }

    public Double getPret() {
        return pret;
    }

    public Double getDimensiune() {
        return dimensiune;
    }

    public LocalDate getDataCumpararii() {
        return dataCumpararii;
    }

    public HashMap<String, Boolean> getUtilitati() {
        return utilitati;
    }

    public Integer getNumarBai() {
        return numarBai;
    }

    public Integer getNumarDormitoare() {
        return numarDormitoare;
    }

    public Boolean getAreBalcon() {
        return areBalcon;
    }

    public void setNumar(Integer numar) {
        this.numar = numar;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public void setDimensiune(Double dimensiune) {
        this.dimensiune = dimensiune;
    }

    public void setDataCumpararii(LocalDate dataCumpararii) {
        this.dataCumpararii = dataCumpararii;
    }

    public void setUtilitati(HashMap<String, Boolean> utilitati) {
        this.utilitati = utilitati;
    }

    public void setNumarBai(Integer numarBai) {
        this.numarBai = numarBai;
    }

    public void setNumarDormitoare(Integer numarDormitoare) {
        this.numarDormitoare = numarDormitoare;
    }

    public void setAreBalcon(Boolean areBalcon) {
        this.areBalcon = areBalcon;
    }
}
