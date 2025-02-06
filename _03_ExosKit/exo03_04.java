import java.util.Scanner;

public class exo03_04 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Veuiller saisir un nombre : ");
        int nb = scan.nextInt();
        int sum = 0;
        for (int i = nb; i > 0; i--)
            sum += i;
        System.out.println("La somme des nombres jusque " + nb + " est : " + sum);
        scan.close();
    }
}
