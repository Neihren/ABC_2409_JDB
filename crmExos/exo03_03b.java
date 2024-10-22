import java.util.Scanner;

public class exo03_03b {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Veuiller saisir un nombre : ");
        int nb = scan.nextInt();
        int limit = nb + 10;
        System.out.print("Les 10 nombres après " + nb + " sont : ");
        for( int i = nb + 1 ; i < limit + 1 ; i++) {
            System.out.print(i);
            if (i < limit)
                System.out.print(", ");
        }
        scan.close();
    }
}
