/* ----CERINTE LAB4----
Firma imobiliare:

2 camere, 3 camere, duplex, open space.

Ap: nr apartamentului, pretul, dimensiunea, data cumpararii/inchirierii.

Utilitati: 1 baie/doua, cate dormitoare, balcon/nu, in functie de camera: canaprea, masa, aragaz , etc.

1) Scris cod
2) Sortati dupa numarul de camere toate apartamentele.
3) Afisati toate utilitatile fiecarui apartament.
4) Clasament nr vanzari
5) Afisati cate apartamente sunt in functie de nr de camere.
 */


import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // crearea unui set de utilitati pentru o camera
        HashMap<String, Boolean> utilitatiBaie = new HashMap<>();
        utilitatiBaie.put("curent", true);
        utilitatiBaie.put("apa calda", true);
        utilitatiBaie.put("apa rece", true);

        HashMap<String, Boolean> utilitatiDormitor = new HashMap<>();
        utilitatiDormitor.put("curent", true);
        utilitatiDormitor.put("televizor", true);
        utilitatiDormitor.put("aer conditionat", true);

        HashMap<String, Boolean> utilitatiBucatarie = new HashMap<>();
        utilitatiBucatarie.put("curent", true);
        utilitatiBucatarie.put("apa calda", true);
        utilitatiBucatarie.put("apa rece", true);
        utilitatiBucatarie.put("frigider", true);
        utilitatiBucatarie.put("aragaz", true);
        utilitatiBucatarie.put("chiuveta", true);

        HashMap<String, Boolean> utilitatiBalcon = new HashMap<>();
        utilitatiBalcon.put("curent", true);
        utilitatiBalcon.put("masuta de cafea", true);
        utilitatiBalcon.put("scaune", true);

        // crearea unui obiect Camera
        Camera camera1 = new Camera(utilitatiBaie, TipCamera.BAIE);
        Camera camera2 = new Camera(utilitatiDormitor, TipCamera.DORMITOR);
        Camera camera3 = new Camera(utilitatiDormitor, TipCamera.DORMITOR);
        Camera camera4 = new Camera(utilitatiDormitor, TipCamera.DORMITOR);
        Camera camera5 = new Camera(utilitatiBucatarie, TipCamera.BUCATARIE);
        Camera camera6 = new Camera(utilitatiBalcon, TipCamera.BALCON);

        // crearea unei liste de camere pentru apartament
        List<Camera> camereApartament1 = new ArrayList<>();
        camereApartament1.add(camera1);
        camereApartament1.add(camera2);
        camereApartament1.add(camera3);
        camereApartament1.add(camera5);

        List<Camera> camereApartament2 = new ArrayList<>();
        camereApartament2.add(camera1);
        camereApartament2.add(camera2);
        camereApartament2.add(camera3);
        camereApartament2.add(camera4);
        camereApartament2.add(camera5);

        List<Camera> camereApartament3 = new ArrayList<>();
        camereApartament2.add(camera1);
        camereApartament2.add(camera2);
        camereApartament2.add(camera5);
        camereApartament2.add(camera6);

        // crearea si initializarea unui obiect de tip Apartament
        Apartament apartament1 = new Apartament(1, 20000.0, 80.0, new Date(), TipApartament.CAMERA_DUBLA, camereApartament1);
        Apartament apartament2 = new Apartament(2, 40000.0, 100.0, new Date(), TipApartament.CAMERA_TRIPLA, camereApartament2);
        Apartament apartament3 = new Apartament(3, 15000.0, 60.0, new Date(), TipApartament.OPEN_SPACE, camereApartament3);

        // Adăugăm apartamentele într-o listă
        ArrayList<Apartament> apartamente = new ArrayList<>();
        apartamente.add(apartament1);
        apartamente.add(apartament2);
        apartamente.add(apartament3);

        // Sortăm apartamentele după numărul de camere
        Collections.sort(apartamente, Comparator.comparingInt(Apartament::getNrCamere));

        // Afisam apartamentele sortate
        System.out.println("Apartamentele sortate in functie de numarul de camere:");
        for (Apartament apartament : apartamente) {
            System.out.println("Apartament " + apartament.getNumar());
        }

        // Afisati utilitatile fiecarui apartament
        System.out.println("====UTILITATILE APARTAMENTELOR====");
        for (Apartament apartament : apartamente) {
            System.out.println("Utilitatile pentru apartamentul cu numarul " + apartament.getNumar() + " sunt:");
            for (Camera camera : apartament.getCamere()) {
                System.out.print(camera.getTipCamera() + ": ");
                HashMap<String, Boolean> utilitati = camera.getUtilitati();
                for (String cheie : utilitati.keySet()) {
                    System.out.print(cheie + "=" + utilitati.get(cheie) + ", ");
                }
                System.out.println();
            }
        }
        /*aici nu inteleg de ce imi afiseaza consecutiv
        Utilitatile pentru apartamentul cu numarul 3 sunt:
        Utilitatile pentru apartamentul cu numarul 1 sunt:

         si apoi utilitati*/


    }

}
