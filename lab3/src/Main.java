import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Aliment> alimente = new ArrayList<>();
        alimente.add(new Cereale("ovaz, ciocolata, banana", 10.0, 2.56, LocalDate.of(2024, 10, 20), "Cereale Musli"));
        alimente.add(new Carne("pui", 15.0, 1.05, LocalDate.of(2023, 3, 18), "Aripioare"));
        alimente.add(new Lapte("lapte de cocos", 18.5, 3.05, LocalDate.of(2023, 10, 12), "Lactate"));

        List<Aliment> alimenteSortate = alimente.stream()
                .sorted(Comparator.comparingDouble(Aliment::getCalorii))
                .collect(Collectors.toList());

        for (Aliment aliment : alimenteSortate) {
            System.out.println(aliment.getTipAliment() + " - " + aliment.getCalorii() + " calorii");
        }
    }
}