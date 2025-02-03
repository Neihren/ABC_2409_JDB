import java.util.Scanner;

public class exo01_02 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Veuillez saisir votre prénom : ");
        String name = scan.nextLine();
        System.out.println("Bonjour " + name);
        scan.close();
    }
}
