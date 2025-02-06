import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class exoBonus_01 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dateFormat = dateFormat.withLocale(Locale.FRANCE);
        String answer = "";
        System.out.print("Veuillez saisir un nom : ");
        String name = scan.nextLine();
        System.out.print("Veuillez saisir un prénom : ");
        String firstname = scan.nextLine();
        System.out.print("Veuillez saisir une date de naissance (JJ/MM/AAAA):");
        String birthInput = scan.nextLine();
        LocalDate birthDate = LocalDate.parse(birthInput, dateFormat);
        int age = Period.between(birthDate, LocalDate.now()).getYears();
        if (age > 17)
            System.out.print("Veuillez saisir votre métier : ");
        else
            System.out.print("Veuillez saisir votre couleur préférée : ");
        answer = scan.nextLine();
        System.out.print(name + " " + firstname + " - " + birthInput + " (" + age + ") - " + answer );
        scan.close();
    }
}