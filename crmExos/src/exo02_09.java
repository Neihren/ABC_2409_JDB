import java.util.Scanner;

public class exo02_09 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Veuillez saisir l'age du conducteur : ");
        int age = scan.nextInt();
        System.out.print("Veuillez saisir le nombre d'années de permis du conducteur : ");
        int permit = scan.nextInt();
        System.out.print("De combien d'accidents le conducteur a été responsable ? ");
        int accident = scan.nextInt();
        System.out.print("Depuis combien d'année le conducteur est il assuré ? ");
        int years = scan.nextInt();
        int insurance = 3;
        String color[] = { "refusée.", "rouge.", "orange.", "vert.", "bleu." };
        if (age < 25)
            insurance -= 1;
        if (permit < 2)
            insurance -= 1;
        while (accident > 0) {
            insurance -= 1;
            accident--;
        }
        if (insurance > 0 && years >= 5)
            insurance++;
        if (insurance < 0)
            insurance = 0;
        if (insurance > 0)
            System.out.println("La demande d'assurance est acceptée et le tarif est " + color[insurance]);
        else
            System.out.println("La demande d'assurance est " + color[insurance]);
        scan.close();
    }
}
