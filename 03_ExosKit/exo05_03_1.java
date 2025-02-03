import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class exo05_03_1 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        decimalFormat.setDecimalFormatSymbols(symbols);
        String userInput = "";
        float value = -460f;
        String unit = "";
        float result = 0;
        while (value < -459.68 || value > 5000000) {
            System.out.print("Entrer une valeur entre -459.67 et 5 000 000 ° : ");
            userInput = scan.nextLine();
            if (userInput.equalsIgnoreCase("q"))
                System.exit(0);
            else if (userInput.contains("C"))
                unit = "C";
            else
                unit = "F";
            value = decimalFormat.parse(userInput).floatValue();
        }
        if (unit.equals("C")) {
            result = ((value * (9f / 5f)) + 32f);
            System.out.println(value + "°C correspondent à " + (float) Math.round(result * 100f) / 100f + "°F");
        } else {
            result = ((value - 32f) * (5f / 9f));
            System.out.println(value + "°F correspondent à " + (float) Math.round(result * 100f) / 100f + "°C");
        }
        scan.close();
    }
}
