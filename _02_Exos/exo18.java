public class exo18 {
    /*
     * EXERCICE 8 (Version original): Créer un algorithme qui convertit n'importe
     * qu'elle valeurs décimal (entier) en binaire
     */

    public static void main(String[] args) throws Exception {
        int dec = 0;
        int[] result = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0 };
        int count = 0;
        int i = 31;
        System.out.print("\n" + dec + " décimal vaut ");
        while (dec > 0) {
            int quotient = dec / 2;
            int reste = dec % 2;
            result[i] = reste;
            dec = quotient;
            i--;
            count++;
        }
        for (i = 32 - count; i <= 31; i++)
            System.out.print(result[i]);
        System.out.print(" en binaire.");
    }

    /* Résultat Attendu : 1 en décimal vaut 0001 en binaire */
}
