import java.math.BigDecimal;
import java.util.Scanner;

public class exo03_08 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        BigDecimal price = BigDecimal.valueOf(-1);
        BigDecimal sum = BigDecimal.valueOf(0);
        int nb = 0;
        BigDecimal change = BigDecimal.valueOf(0);
        int nbTwo = 0;
        int nbOne = 0;
        int nbFifty = 0;
        int nbTwenty = 0;
        int nbTen = 0;
        while (price.doubleValue() != 0) {
            System.out.print("Saisir un prix  : ");
            price = new BigDecimal(scan.nextLine());
            sum = sum.add(price);
        }
        System.out.println("\nLe client doit payer : " + String.format("%.2f", sum) + " Euros.");
        if (sum.doubleValue() % 5 == 0)
            nb = (int) sum.doubleValue() / 5;
        else
            nb = (int) sum.doubleValue() / 5 + 1;
        change = (BigDecimal.valueOf(nb * 5)).subtract(sum);
        System.out.println("Le client doit donner " + nb + " billets de 5 Euros soit " + (nb * 5) + " Euros.");
        System.out.println("Rendu monnaie : " + String.format("%.2f", change) + " Euros.");
        if (change.doubleValue() > 0) {
            while (change.doubleValue() != 0) {
                if (change.doubleValue() >= 2) {
                    change = change.subtract(BigDecimal.valueOf(2));
                    nbTwo++;
                } else if (change.doubleValue() >= 1) {
                    change = change.subtract(BigDecimal.valueOf(1));
                    nbOne++;
                } else if (change.doubleValue() >= 0.5) {
                    change = change.subtract(BigDecimal.valueOf(0.5));
                    nbFifty++;
                } else if (change.doubleValue() >= 0.2) {
                    change = change.subtract(BigDecimal.valueOf(0.2));
                    nbTwenty++;
                } else if (change.doubleValue() >= 0.1) {
                    change = change.subtract(BigDecimal.valueOf(0.1));
                    nbTen++;
                }
            }
            System.out.println("Répartition de la monnaie à restituer au client :");
            if (nbTwo > 0)
                System.out.println("- " + nbTwo + " pièce(s) de 2 Euros");
            if (nbOne > 0)
                System.out.println("- " + nbOne + " pièce(s) de 1 Euros");
            if (nbFifty > 0)
                System.out.println("- " + nbFifty + " pièce(s) de 0.50 Euros");
            if (nbTwenty > 0)
                System.out.println("- " + nbTwenty + " pièce(s) de 0.20 Euros");
            if (nbTen > 0)
                System.out.println("- " + nbTen + " pièce(s) de 0.10 Euros");
        }
        scan.close();
    }
}
