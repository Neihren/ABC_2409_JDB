import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class exo05_03_2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        decimalFormat.setDecimalFormatSymbols(symbols);
        String userInput = "";
        float min = 0;
        float max = 0;
        String unit = "";
        while (!userInput.equalsIgnoreCase("quit")) {
            System.out.print("Saisir une unité de mesure ( C / F ) : ");
            userInput = scan.nextLine();
            if (userInput.equalsIgnoreCase("quit")) {
                System.exit(0);
            }
            unit = userInput;
            System.out.print("Saisir une valeur minimum : ");
            userInput = scan.nextLine();
            min = decimalFormat.parse(userInput).floatValue();
            System.out.print("Saisir une valeur maximum : ");
            userInput = scan.nextLine();
            max = decimalFormat.parse(userInput).floatValue();
            if (unit.equalsIgnoreCase("C")) {
                System.out.print(min + "°C vaut " + (float) Math.round(((min * (9f / 5f)) + 32f) * 100f) / 100f + "°F et ");
                System.out.println(max + "°C vaut " + (float) Math.round(((max * (9f / 5f)) + 32f) * 100f) / 100f + "°F");
            } 
            else {
                System.out.print(min + "°F vaut " + (float) Math.round(((min - 32f) * (5f / 9f)) * 100f) / 100f + "°C et ");
                System.out.println(max + "°F vaut " + (float) Math.round(((max - 32f) * (5f / 9f)) * 100f) / 100f + "°C");
            }
        }
        scan.close();
    }
}
