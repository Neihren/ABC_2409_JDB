import java.util.Scanner;

public class exo02_07 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Veuillez saisir une année : ");
        int year = scan.nextInt();
        System.out.print("Veuillez saisir un mois : ");
        int month = scan.nextInt();
        System.out.print("Veuillez saisir un jour : ");
        int day = scan.nextInt();
        if (month > 12 || (((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && month == 2 && day > 29)) 
                            || (!(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && month == 2 && day > 28)
                            || (((month < 8 && month % 2 != 0)
                                || (month > 7 && month % 2 == 0))
                                && day > 31)
                            || (((month < 8 && month % 2 == 0)
                                || (month > 7 && month % 2 != 0))
                                && day > 30))
            System.out.println("La date entrée est invalide");
        else
            System.out.println("La date entrée est valide");
        scan.close();
    }
}
