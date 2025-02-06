import java.lang.Math;

public class exo10bis {
    /*
     * EXERCICE 10 : Créer un algorithme qui convertit n'importe qu'elle valeurs
     * binaire en Hexadécimal
     */
    public static void decToHexa(int dec) {
        String[] result = { "0", "0", "0", "0", "0", "0", "0", "0" };
        int count = 0;
        int i = 7;
        while (dec > 0) {
            int quotient = dec / 16;
            int reste = dec % 16;
            String valeur;
            if (reste == 10)
                valeur = "A";
            else if (reste == 11)
                valeur = "B";
            else if (reste == 12)
                valeur = "C";
            else if (reste == 13)
                valeur = "D";
            else if (reste == 14)
                valeur = "E";
            else if (reste == 15)
                valeur = "F";
            else
                valeur = String.valueOf(reste);
            result[i] = valeur;
            dec = quotient;
            i--;
            count++;
        }
        for (i = 8 - count; i <= 7; i++) {
            System.out.print(result[i]);
        }
        System.out.print(" en Hexadécimal.");
    }

    public static void main(String[] args) throws Exception {
        int bin = 1010;
        int length = String.valueOf(bin).length();
        int dec = 0;
        System.out.println("La valeur : " + bin);
        for (int i = length - 1; i >= 0; i--) {
            int puiss = (int) Math.pow(10, i);
            int valeur = (bin / puiss);
            bin = bin - puiss * valeur;
            dec = dec + valeur * (int) Math.pow(2, i);
        }
        System.out.println("Vaut " + dec + " en décimal.");
        decToHexa(dec);
    }

}
