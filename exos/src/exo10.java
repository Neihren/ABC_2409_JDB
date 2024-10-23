import java.lang.Math;

public class exo10 {
        /*
         * EXERCICE 10 : Créer un algorithme qui convertit n'importe qu'elle valeurs
         * binaire en Hexadécimal
         */
        public static void main(String[] args) throws Exception {
                int bin = 11101;
                int length = String.valueOf(bin).length() - 1;
                int dec = 0;

                System.out.println("\nLa valeur : " + bin);
                for (int i = length; i >= 0; i--) {
                        int puiss = (int) Math.pow(10, i);
                        int valeur = (bin / puiss);
                        bin = bin - puiss * valeur;
                        dec = dec + valeur * (int) Math.pow(2, i);
                }
                System.out.println("Vaut " + dec + " en décimal et " + Integer.toHexString(dec) + " en Hexadécimal.");
        }
}
