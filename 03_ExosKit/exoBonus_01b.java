import java.time.LocalDate;
import java.util.Scanner;

public class exoBonus_01b {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String answer = "";
        System.out.print("Veuillez saisir un nom : ");
        String name = scan.nextLine();
        System.out.print("Veuillez saisir un prénom : ");
        String firstname = scan.nextLine();
        System.out.print("Veuillez saisir une date de naissance (JJ/MM/AAAA):");
        String birthInput = scan.nextLine();
        int day = Integer.parseInt(birthInput, 0, 2, 10);
        int month = Integer.parseInt(birthInput, 3, 5, 10);
        int year = Integer.parseInt(birthInput, 6, 10, 10);
        int currDay = LocalDate.now().getDayOfMonth();
        int currMonth = LocalDate.now().getMonthValue();
        int currYear = LocalDate.now().getYear();
        int age = currYear - year;
        if (currMonth == month) {
            if (currDay < day)
                age -= 1;
        }
        else if (month > currMonth)
                age -= 1;
        if (age > 17)
            System.out.print("Veuillez saisir votre métier : ");
        else
            System.out.print("Veuillez saisir votre couleur préférée : ");
        answer = scan.nextLine();
        System.out.print(name + " " + firstname + " - " + birthInput + " (" + age + ") - " + answer);
        scan.close();
    }
}