import java.util.Scanner;

public class exo03_06 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int nb = 0;
        int greater = 0;
        int counter = 0;
        for (int i = 1; i < 20; i++) {
            System.out.println("Entrez le nombre numéro " + i + " : ");
            nb = scan.nextInt();
            if (nb > greater) {
                greater = nb;
                counter = i;
            }
        }
        System.out.println("Résultat : \nLe plus grand des nombres saisis est : " + greater + ".\n" + greater + " était le nombre numéro " + counter + ".");
        scan.close();
    }
}
