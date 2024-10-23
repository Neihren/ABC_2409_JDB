import java.util.Scanner;

public class exo03_03 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Veuiller saisir un nombre : ");
        int nb = scan.nextInt();
        int limit = nb + 10;
        System.out.print("Les 10 nombres après " + nb + " sont : ");
        while (nb != limit) {
            nb++;
            System.out.print(nb);
            if (nb < limit)
                System.out.print(", ");
        }
        scan.close();
    }
}
