import java.util.Scanner;

public class exo02_03 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Veuillez saisir un age : ");
        int age = scan.nextInt();
        String category = "";
        if (age >= 0 && age < 5)
            category = "Trop jeune";
        else if (age <= 6)
            category = "Débutant";
        else if (age <= 8)
            category = "Poussin";
        else if (age <= 10)
            category = "Benjamin";
        else if (age <= 12)
            category = "Pupille";
        else if (age <= 14)
            category = "Minime";
        else if (age <= 16)
            category = "Cadet";
        else if (age <= 18)
            category = "Junior";
        else if (age <= 34)
            category = "Sénoir";
        else
            category = "Vétéran";
        System.out.println("A " + age + " ans, vous faites partie de la catégorie " + category);
        scan.close();
    }
}
