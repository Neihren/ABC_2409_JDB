import java.util.Scanner;

public class exo02_02 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Veuillez saisir un premier nombre entier : ");
        int nb1 = scan.nextInt();
        System.out.print("Veuillez saisir un second nombre entier : ");
        int nb2 = scan.nextInt();
        String ans = "";
        int product = nb1 * nb2;
        if (product >= 0)
            ans = "positif.";
        else
            ans = "négatif.";
        System.out.println("Le produit de " + nb1 + " et " + nb2 + " est " + ans);
        scan.close();
    }
}
