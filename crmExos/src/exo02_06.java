import java.util.Scanner;

public class exo02_06 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Veuillez saisir une année : ");
        int year = scan.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println("L'année " + year + " est bissextile");
        else
            System.out.println("L'année " + year + " n'est pas bissextile");
        scan.close();
    }
}
