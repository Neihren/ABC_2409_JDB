import java.util.Scanner;

public class exo02_05 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Veuillez saisir le nombre de photocopie voulue : ");
        int prints = scan.nextInt();
        int leftPrints = prints;
        double price = 0;
        while (leftPrints > 30) {
            price += 0.08;
            leftPrints--;
        }
        while (leftPrints > 10) {
            price += 0.09;
            leftPrints--;
        }
        while (leftPrints > 0) {
            price += 0.10;
            leftPrints--;
        }
        System.out.println(
                "Pour " + prints + " photocopies, le prix sera de " + String.format("%.2f", price) + " euros.");
        scan.close();
    }
}
