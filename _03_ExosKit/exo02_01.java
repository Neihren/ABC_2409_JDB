import java.util.Scanner;

public class exo02_01 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre entier : ");
        int nb = scan.nextInt();
        String ans = "";
        if (nb >= 0)
            ans = "positif.";
        else
            ans = "négatif.";
        System.out.println("Le nombre " + nb + " est " + ans);
        scan.close();
    }
}
