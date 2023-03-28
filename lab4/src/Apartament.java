import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Apartament {

    private Integer numar;
    private Double pret;
    private Double dimensiune;
    private Date dataCumpararii;
    private TipApartament tipApartament;
    private List<Camera> camere;

    public Apartament(Integer numar, Double pret, Double dimensiune, Date dataCumpararii, TipApartament tipApartament, List<Camera> camere) {
        this.numar = numar;
        this.pret = pret;
        this.dimensiune = dimensiune;
        this.dataCumpararii = dataCumpararii;
        this.tipApartament = tipApartament;
        this.camere = camere;
    }

    public Integer getNumar() {
        return numar;
    }

    public void setNumar(Integer numar) {
        this.numar = numar;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public Double getDimensiune() {
        return dimensiune;
    }

    public void setDimensiune(Double dimensiune) {
        this.dimensiune = dimensiune;
    }

    public Date getDataCumpararii() {
        return dataCumpararii;
    }

    public void setDataCumpararii(Date dataCumpararii) {
        this.dataCumpararii = dataCumpararii;
    }

    public TipApartament getTipApartament() {
        return tipApartament;
    }

    public void setTipApartament(TipApartament tipApartament) {
        this.tipApartament = tipApartament;
    }

    public List<Camera> getCamere() {
        return camere;
    }

    public void setCamere(List<Camera> camere) {
        this.camere = camere;
    }

    public Integer getNrCamere() {
        return camere.size();
    }

    public Integer getNrDormitoare() {
        return camere.stream().filter(dormitor ->
                dormitor.getTipCamera() == TipCamera.DORMITOR).toArray().length;
    }
    public Integer getNrBai() {
        return camere.stream().filter(baie ->
                baie.getTipCamera() == TipCamera.BAIE).toArray().length;
    }
    @Override
    public String toString() {
        return "Apartament{" +
                "numar=" + numar +
                ", pret=" + pret +
                ", dimensiune=" + dimensiune +
                ", dataCumpararii=" + dataCumpararii +
                ", tipApartament=" + tipApartament +
                ", camere=" + camere +
                '}';
    }
}
