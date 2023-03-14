import java.time.LocalDate;

public class Carne extends Aliment{

    public Carne(String ingrediente, Double pret, Double calorii, LocalDate data_exp, String tipAliment) {
        super(ingrediente, pret, 1.05, data_exp, tipAliment);
    }
}

