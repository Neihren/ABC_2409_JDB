import java.util.Scanner;

public class exo03_05 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Veuiller saisir un nombre : ");
        int nb = scan.nextInt();
        int factorial = 1;
        for (int i = nb; i > 0; i--)
            factorial *= i;
        System.out.println("La factorielle de " + nb + " est : " + factorial);
        scan.close();
    }
}
