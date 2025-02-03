import java.util.Scanner;

public class exo03_02 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int nb = 0;
        System.out.print("Veuiller saisir un nombre entre 10 et 20 : ");
        while (nb > 20 || nb < 10) {
            nb = scan.nextInt();
            if (nb > 20)
                System.out.println("Plus petit !");
            else if (nb < 10)
                System.out.println("Plus grand !");
            else
                System.out.println("Yes, you dit it !");
        }
        scan.close();
    }
}
