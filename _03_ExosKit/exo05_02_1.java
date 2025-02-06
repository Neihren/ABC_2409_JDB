import java.text.DecimalFormat;
import java.util.Scanner;

public class exo05_02_1 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String userInput = "";
        float km = 0.01f;
        float miles = 0;
        while (km < 0.01 || km > 1000000) {
            System.out.print("Entrer une valeur entre 0.01 et 1 000 000 km : ");
            userInput = scan.nextLine();
            if (userInput.equalsIgnoreCase("q"))
                System.exit(0);
            km = decimalFormat.parse(userInput).floatValue();
        }
        miles = km / 1.609f;
        System.out.println((float) Math.round(miles * 100f) / 100f);
        scan.close();
    }
}
