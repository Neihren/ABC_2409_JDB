public class exo20_2 {
    /*
     * EXERCICE 11 (Version original) : Créer un algorithme qui affiche un X avec un
     * des symboles "*" (étoiles) de 10 de longueur
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
          System.out.println("*");
      }
      for (int i = 0; i <= 8; i++) {
        for (int j = 8 - i; j > 0; j--)
          System.out.print(" ");
        System.out.print("*");
        for (int j = 0; j < i*2; j++)
          System.out.print(" ");
        System.out.print(" ");
        System.out.println("*");
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
                        *   *
                    *         *
                *               *
            *                     *
        *                            *
    *                                   * */
}
