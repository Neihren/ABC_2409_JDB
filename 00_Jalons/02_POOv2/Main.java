import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vol> vols = new ArrayList<>();
        int id;
        String nom;
        String prenom;
        int age;
        String business;
        boolean businessBoolean;
        int occupation;
        boolean prixTropBas;

        occupation = 0;
        businessBoolean = false;
        prixTropBas = false;
        Reservation reservation = new Reservation();

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

        // Demande des informations du client :
        System.out.println("\nBienvenue dans notre agence de voyage !\n");
        System.out.print("Veuillez entrez votre nom : ");
        nom = scanner.nextLine();
        System.out.print("Veuillez entrez votre prénom : ");
        prenom = scanner.nextLine();
        do {
            try {
                System.out.print("Veuillez entrez votre âge : ");
                age = scanner.nextInt();

                if (age <= 0) {
                    age = 0;
                }
            } catch (Exception e) {
                System.out.println("\n\033[1;31mErreur: Veuillez entrer un âge valide.\033[0m\n");
                scanner.nextLine();
                age = 0;
            }
        } while (age <= 0);

        // Affichage de la liste de vols :

        System.out.println("\nBienvenue " + prenom + " " + nom + " !");
        System.out.println("\nVoici la liste des vol planifiés\n");
        System.out.println("------------------------------------ VOLS ------------------------------------");
        System.out.println("| Id    | Destination       | Tarif       | NbPlacesTotale | NbPlacesOccupee |");
        System.out.println("------------------------------------------------------------------------------");
        for (Vol vol : vols) {
            System.out.println(vol.toString());
        }
        System.out.println("------------------------------------------------------------------------------");

        // Demande de choix de vol et création de la réservation :
        do {
            System.out.print("\nVeuillez choisir un vol par son id : ");
            id = scanner.nextInt();
            for (Vol vol : vols) {
                if (vol.getId() == id) {
                    System.out.println(
                            "\nVous avez choisi le vol " + vol.getId() + " à destination de " + vol.getDestination()
                                    + ".");
                    if (vol.getNbPlacesOccupee() == vol.getNbPlacesTotale()) {
                        System.out.println("\n\033[1;31mCe vol est complet, veuillez choisir un autre vol.\033[0m\n");
                        id = 0;
                    } else {
                        System.out.println("  ->  Le prix initial du billet est de " + vol.getTarif() + " euros.");
                        System.out.print("\nVoulez-vous un billet en classe affaire ? (Oui/Non) : ");
                        business = scanner.next();
                        businessBoolean = false;
                        if (business.equalsIgnoreCase("Oui")) {
                            businessBoolean = true;
                        } else {
                            businessBoolean = false;
                        }
                        reservation = new Reservation(nom, prenom, age, vol.getTarif(), businessBoolean,
                                vol.getId(), vol.getDestination());
                        occupation = vol.getNbPlacesOccupee() * 100 / vol.getNbPlacesTotale();
                    }
                }
            }
        } while (id == 0);

        // Application de la réduction en fonction de l'age :
        System.out.println("\n\033[1;34mVous avez " + age + " an(s)." + " Vous avez droit à une réduction de "
                + String.valueOf(String.format("%.2f", reservation.reductionAge())) + " euros.\033[0m\n");
        System.out.println("  ->  Le prix mis à jour du billet est de "
                + String.valueOf(String.format("%.2f", reservation.getPrixFinal())) + " euros.\n");

        // Application de la majoration ou réduction en fonction de l'occupation :
        System.out.println("Le taux d'occupation du vol est de " + occupation + "%.\n");
        if (occupation >= 80) {
            System.out.println("\033[1;31mLe vol étant presque plein nous avons augmenté le prix de votre billet de "
                    + String.valueOf(String.format("%.2f", reservation.changePrixPlace(occupation) * -1))
                    + " euros.\n\033[0m");
        } else if (occupation <= 20) {
            System.out.println("\033[1;34mLe vol est presque vide ! Vous avez le droit à une réduction de "
                    + String.valueOf(String.format("%.2f", reservation.changePrixPlace(occupation)))
                    + " euros\n\033[0m");
        }
        System.out.println("  ->  Le prix mis à jour du billet est de "
                + String.valueOf(String.format("%.2f", reservation.getPrixFinal())) + " euros.\n");

        // Application de la majoration pour la classe affaire :
        if (businessBoolean) {
            System.out.println(
                    "\033[1;31mVous avez choisi un billet en classe affaire. Le prix de votre billet a été majoré de "
                            + String.valueOf(String.format("%.2f", reservation.augmentationBusiness() * -1))
                            + " euros.\n\033[0m");
        } else {
            System.out.println("\033[1;34mVous avez choisi un billet en classe économique.\n\033[0m");
        }
        System.out.println("  ->  Le prix mis à jour du billet est de "
                + String.valueOf(String.format("%.2f", reservation.getPrixFinal())) + " euros.\n");

        // Application du prix minimal :
        prixTropBas = reservation.minimumPrixFinale();
        if (prixTropBas) {
            System.out.println(
                    "\033[1;34mLe prix de votre billet était inférieur à 500 euros. Nous avons appliqué le prix minimal de 500 euros.\n\033[0m");
        }

        // Affichage du prix final :
        System.out.println("\033[1;32mLe prix de votre billet pour " + reservation.getDestination() + " est de "
                + String.valueOf(String.format("%.2f", reservation.getPrixFinal())) + " euros.\n\033[0m");
        System.out.println("Merci de votre confiance Monsieur " + nom + " et bon voyage !\n");
        scanner.close();
    }
}
