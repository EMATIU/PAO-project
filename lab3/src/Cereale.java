import java.time.LocalDate;

public class Cereale extends Aliment{
    public Cereale(String ingrediente, Double pret, Double calorii, LocalDate data_exp, String tipAliment) {
        super(ingrediente, pret, 2.56, data_exp, tipAliment);
    }
}
