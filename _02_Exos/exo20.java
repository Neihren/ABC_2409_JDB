public class exo20 {
    /*
     * EXERCICE 10 (Version original) : Créer un algorithme qui affiche un V avec un
     * des symboles "*" (étoiles) , la longueur est de 10 case
     */
    public static void main(String[] args) throws Exception {
        for (int i = 8; i >= 0; i--) {
            System.out.print("*");
            for (int j = i * 2; j > 0; j--)
                System.out.print(" ");
            System.out.print(" ");
            System.out.println("*");
            for (int j = 8 - i; j >= 0; j--)
                System.out.print(" ");
            if (i == 0)
                System.out.print("*");
        }
    }
                  /*  Résultat Attendu : 

                  *                     *
                   *                   *
                    *                 *
                     *               *
                      *            *
                        *        *
                          *    *
                            *

                  */
}
