import java.util.Scanner;

public class exo01_06 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Veuillez saisir un premier nombre : ");
        int nb1 = scan.nextInt();
        System.out.print("Veuillez saisir un deuxième nombre : ");
        int nb2 = scan.nextInt();
        System.out.println("La valeur de A est " + nb1 + " et la valeur de B est " + nb2);
        int storeValue = nb1;
        nb1 = nb2;
        nb2 = storeValue;
        System.out.println("La valeur de A est " + nb1 + " et la valeur de B est " + nb2);
        scan.close();
    }
}
