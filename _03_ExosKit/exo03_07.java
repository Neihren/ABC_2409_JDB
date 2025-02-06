import java.util.Scanner;

public class exo03_07 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int nb = -1;
        int greater = -1;
        int counter = 1;
        int index = 0;
        while (nb != 0) {
            System.out.print("Entrez le nombre numéro " + counter + " : ");
            nb = scan.nextInt();
            if (nb > greater) {
                greater = nb;
                index = counter;
            }
            counter++;
        }
        System.out.println("Résultat : \nLe plus grand des nombres saisis est : " + greater + ".\n" + greater + " était le nombre numéro " + index + ".");
        scan.close();
    }
}
