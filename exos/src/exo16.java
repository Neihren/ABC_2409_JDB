import java.util.Scanner;
public class exo16 {
    /*
     * EXERCICE 6 :
     * Créer un algo qui calcule le coût en kilomêtrage d'un déplacement en voiture
     * selon le type de carburant ( diesel : 0 ; sans plomb 95 : 1 ; sans plomb 98 :
     * 2)
     * 
     * NOTE : Comme les prix des carburant varient chaque jours, veuillez-vous
     * référer à ce site et prendre en compte que la valeur d'aujourd'hui :
     * https://www.automobile-club.org/tourisme-et-voyages/prix-des-carburants/
     * tendances
     * 
     * En France une voiture consomme en moyenne 6L/100 km
     * 
     */

    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner myObj = new Scanner(System.in);
        System.out.println("Indiquez une distance");
        double distance = myObj.nextInt();
        System.out.println("Indiquez un carburant - ( diesel : 0 ; sans plomb 95 : 1 ; sans plomb 98 : 2)");
        int gaz = myObj.nextInt();
        double prices = 0;
        //double[] prices = {1.640,1.749,1.826};
        if (gaz == 0)
            prices = 1.661;
        else if (gaz == 1)
            prices = 1.740;
        else
            prices = 1.846;
        String cost = String.format("%.2f",(distance/100*6*prices));
        System.out.println("le trajet coutera : " + cost + " euros");
    }

    /*
     * Résultat attendu 200km pour une voiture en diesel coûtent 19.68€ (Testez sur
     * les 3 types de carburants)
     */
}
