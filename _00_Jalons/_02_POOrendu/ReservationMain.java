package _02_POOrendu;

import java.util.List;
import java.util.ArrayList;

public class ReservationMain {

    public static void main(String[] args) {

        List<Vol> vols = new ArrayList<>();
        Vol vol1 = new Vol(244, "New York", 1000.0, 210, 89);
        Vol vol2 = new Vol(365, "Johannesburg", 1200.25, 180, 50);
        Vol vol3 = new Vol(777, "Tokyo", 1500.50, 200, 190);
        Vol vol4 = new Vol(123, "Rio de Janeiro", 1300.75, 210, 210);
        Vol vol5 = new Vol(457, "Istanbul", 900, 210, 3);
        Vol vol6 = new Vol(666, "Enfer", 999, 300, 1);
        vols.add(vol1);
        vols.add(vol2);
        vols.add(vol3);
        vols.add(vol4);
        vols.add(vol5);
        vols.add(vol6);
        // Affichage de la liste de vols :
        System.out.println();
        for (Vol vol : vols) {
            System.out.println(vol.toString());
        }
        
        // Création de l'objet réservation :
        Reservation reservation1 = new Reservation("Wick", "John", 0, 0, true, 666, "Enfer");

        // Test de la méthode choisirUnVolParDestination :

        System.out.println("\nAffichage vol choix par Destination : ");
        System.out.println(reservation1.choisirUnVolParDestination(vols).toString());
        System.out.println("\nAffichage vol choix par ID");
        System.out.println(reservation1.choisirUnVolParId(vols).toString());

        
        System.out.println(reservation1.toString());
        

        // Prix total :
        System.out.println("\nTotal avec toutes réductions :");
        if (!reservation1.estCeComplet(reservation1.choisirUnVolParDestination(vols))) {
            System.out.println(reservation1.prixFinal(reservation1.choisirUnVolParId(vols)));
        } else {
            System.out.println("Le vol est complet");
        }
        System.out.println(reservation1.toString());
    }
}
