import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        List<Vol> vols = new ArrayList<>();
        Vol vol1 = new Vol(244, "New York", 1000.0, 210, 89);
        Vol vol2 = new Vol(365, "Johannesburg", 1200.25, 180, 50);
        Vol vol3 = new Vol(777, "Tokyo", 1500.50, 200, 190);
        Vol vol4 = new Vol(123, "Rio de Janeiro", 1300.75, 210, 210);
        Vol vol5 = new Vol(457, "Istanbul", 900, 210, 3);
        Vol vol6 = new Vol(666, "Enfer", 1000, 210, 10);
        vols.add(vol1);
        vols.add(vol2);
        vols.add(vol3);
        vols.add(vol4);
        vols.add(vol5);
        vols.add(vol6);
        for (Vol vol : vols) {
            System.out.println(vol.toString());
        }
        Reservation reservation1 = new Reservation("Wick", "John", 45, 0, false, 666, "Enfer");
        System.out.println(reservation1.ChoisirUnVolParDestination(vols).toString());
        System.out.println(reservation1.ChoisirUnVolParId(vols).toString());
        System.out.println(reservation1.toString());

        //System.out.println(reservation1.reductionAge(reservation1.ChoisirUnVolParId(vols)));
        System.out.println(reservation1.changePrixPlace(reservation1.ChoisirUnVolParId(vols)));
        System.out.println(reservation1.augmentationBusiness(reservation1.ChoisirUnVolParId(vols)));

        // if (!reservation1.estCeComplet(reservation1.ChoisirUnVolParDestination(vols))) {
        //     System.out.println(reservation1.prixFinale(reservation1.ChoisirUnVolParId(vols)));
        // } else {
        //     System.out.println("Le vol est complet");
        // }

    }
}
