import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Creăm câteva exemple de apartamente
        Apartament apartament1 = new Apartament(1, 100000, 80, 2023-02-10,new HashMap<>(), Apartament.TipCamera.CAMERA_DUBLA, 1, 2, true);
        Apartament apartament2 = new Apartament(2, 150000, 120, new Date(), Apartament.TipCamera.CAMERA_TRIPLA, 2, 3, true, new HashMap<>());
        Apartament apartament3 = new Apartament(3, 80000, 60, new Date(), Apartament.TipCamera.OPEN_SPACE, 1, 1, false, new HashMap<>());

        // Adăugăm apartamentele într-o listă
        ArrayList<Apartament> apartamente = new ArrayList<>();
        apartamente.add(apartament1);
        apartamente.add(apartament2);
        apartamente.add(apartament3);

        // Sortăm apartamentele după numărul de camere
        apartamente.sort(Comparator.comparingInt(apartament -> apartament.getTipCamera().ordinal()));

        // Afisam apartamentele sortate
        for (Apartament apartament : apartamente) {
            System.out.println(apartament.getNumar() + ": " + apartament.getTipCamera());
        }
    }
}
