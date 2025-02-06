public class exo15 {
    /*
     * EXERCICE 5 : Créer un algo qui vérifié entre chaque nombres de 1 à 20 , si
     * ils sont paires ou impaires
     */
    public static void main(String[] args) throws Exception {
        /* Afficher le résultat */
        for (int a = 20; a > 0; a--) {
            if (a % 2 == 1)
                System.out.println("le nombre " + a + " est impaire");
            else
                System.out.println("le nombre " + a + " est pair");
        }
    }
}
