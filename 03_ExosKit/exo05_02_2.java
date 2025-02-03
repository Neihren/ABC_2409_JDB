import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class exo05_02_2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        decimalFormat.setDecimalFormatSymbols(symbols);
        String userInput = "";
        float value = 0.01f;
        String unit = "";
        float result = 0;
        while (value < 0.01 || value > 1000000) {
            System.out.print("Entrer une valeur entre 0,01 et 1 000 000 km : ");
            userInput = scan.nextLine();
            if (userInput.equalsIgnoreCase("q"))
                System.exit(0);
            else if (userInput.contains("mi"))
                unit = "mi";
            else
                unit = "km";
            value = decimalFormat.parse(userInput).floatValue();
        }
        if (unit.equals("mi")) {
            result = value * 1.609f;
            System.out.println(value + "mi correspondent à " + (float) Math.round(result * 100f) / 100f + "km");
        }
        else {
            result = value / 1.609f;
            System.out.println(value + "km correspondent à " + (float) Math.round(result * 100f) / 100f + "mi");
        }
        scan.close();
    }
}
