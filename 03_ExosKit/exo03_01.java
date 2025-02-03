import java.util.Scanner;

public class exo03_01 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        boolean isOK = false;
        while (!isOK) {
            System.out.print("Veuillez saisir un chiffre entre 1 et 3 : ");
            int nb = scan.nextInt();
            if (nb > 0 && nb < 4) {
                System.out.println("Le chiffre saisi est : " + nb + "\nBravo, vous avez réussi !");
                isOK = true;
            }
        }
        scan.close();
    }
}
