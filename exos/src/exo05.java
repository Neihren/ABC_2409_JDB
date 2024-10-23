import java.util.Scanner;

public class exo05 {
    public static void main(String[] args) throws Exception {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Quel est le prix de l'objet ?");
            Double startPrice = myObj.nextDouble();
            System.out.println("De combien est la remise (en %)");
            Double remise = myObj.nextDouble();
            System.out.println("L'objet coûte " + (startPrice * (1 - remise * 0.01)) + " euros");
            System.out.println("Sa remise appliquée est de " + (startPrice * (remise / 100))+ " euros");
        }
    }
}
