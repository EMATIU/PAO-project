import java.time.LocalDate;

public abstract class Aliment {
    private double pret;
    private LocalDate data_exp;
    private String ingrediente;
    private double calorii;
    private String tipAliment;

    public Aliment(String ingrediente, Double pret, Double calorii, LocalDate data_exp, String tipAliment) {
        this.ingrediente = ingrediente;
        this.pret = pret;
        this.calorii = calorii;
        this.data_exp = data_exp;
        this.tipAliment = tipAliment;
    }

    public double getPret() {
        return pret;
    }

    public LocalDate getData_exp() {
        return data_exp;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public double getCalorii() {
        return calorii;
    }

    public String getTipAliment() {
        return tipAliment;
    }
}
