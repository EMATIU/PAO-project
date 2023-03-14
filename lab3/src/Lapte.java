import java.time.LocalDate;

public class Lapte extends Aliment{
    public Lapte(String ingrediente, Double pret, Double calorii, LocalDate data_exp, String tipAliment) {
        super(ingrediente, pret, 3.05, data_exp, tipAliment);
    }
}
