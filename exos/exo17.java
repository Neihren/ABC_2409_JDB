import java.util.Scanner;

public class exo17 {
    /*
     * EXERCICE 7 : Créer un algorithme qui simule des opérations bancaires, dont
     * vous effectuer un paiement en 3 fois par carte d'un montant donner à votre
     * guise. Donner le solde restant à chaque opération.
     * Sachant que vous avez au choix 3 types de cartes qui n'ont pas les mêmes
     * règles de découvert. Votre solde bancaire de départ sera de 1000€
     * 
     * A noter vous avez 3 types de cartes :
     * 
     * Carte Classique (id:1): minimum -500€ de découvert
     * Carte Gold (id:2): minmium -1000€ de découvert
     * Carte Electron (id:0) : minimum 0€ de découvert
     */
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner myObj = new Scanner(System.in);
        double solde = 1000;
        System.out.println("Entrer le type de carte : (Election : 0 | Classique : 1 | Gold : 2)");
        double cardID = myObj.nextInt();
        System.out.println("Combien souhaitez vous dépenser ?");
        double price = myObj.nextDouble();

        System.out.println("\nVotre solde : " + String.format("%.2f", solde) + " euros");
        System.out.print("Votre carte : ");
        if (cardID == 0)
            System.out.println("Carte Electron");
        else if (cardID == 1)
            System.out.println("Carte Classique");
        else
            System.out.println("Carte Gold");
        System.out.println("Paiement en 3 fois de " + String.format("%.2f", price) + " euros");
        double rest = price / 3;
        for (int i = 1; i < 4; i++) {
            System.out.println("\nPaiement n°" + i + " : " + String.format("%.2f", rest) + " euros");
            if ((cardID == 0 && rest > solde) || (cardID == 1 && rest > solde + 500)
                    || (cardID == 2 && rest > solde + 1000)) {
                System.out.println("Opération refusé\nSolde insuffisant");
                return;
            } else {
                System.out.println("Opération approuvé");
                solde = solde - rest;
                System.out.println("Solde restant : " + String.format("%.2f", solde) + " euros");
            }
            price = price - rest;
        }

    }
}

/*
 * Résultat Attendu :
 * 
 * 
 * Votre solde : 1000.00€
 * Votre carte : carte electron
 * paiement en 3 fois de 1500€
 * 
 * 
 * paiement n°1 : 500.00€
 * Opération approuvé
 * solde restant : 500.00€
 * 
 * paiement n°2 : 500.00€
 * Operation approuvé
 * solde restant : 0€
 * 
 * 
 * paiement n°3 : 500.00€
 * Operation refusé
 * solde insufissant
 * 
 * 
 */
