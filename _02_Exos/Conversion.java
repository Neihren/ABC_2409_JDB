import java.util.Scanner;

public class Conversion {
    // public static boolean checkBinary(String number) {
    //     int value = Integer.parseInt(number);
    //     while (value != 0) {
    //         if (value % 10 > 1)
    //             return false;
    //         value = value / 10;
    //     }
    //     return true;
    // }

    public static int toDec(int base, String number) {
        int length = String.valueOf(number).length() - 1;
        int dec = 0;
        int valeur = 0;
        for (int i = length; i >= 0; i--) {
                if (number.charAt(length-i) == 'A' || number.charAt(length-i) == 'a')
                    valeur = 10;
                else if (number.charAt(length-i) == 'B' || number.charAt(length-i) == 'b')
                    valeur = 11;
                else if (number.charAt(length-i) == 'C' || number.charAt(length-i) == 'c')
                    valeur = 12;
                else if (number.charAt(length-i) == 'D' || number.charAt(length-i) == 'd')
                    valeur = 13;
                else if (number.charAt(length-i) == 'E' || number.charAt(length-i) == 'e')
                    valeur = 14;
                else if (number.charAt(length-i) == 'F' || number.charAt(length-i) == 'f')
                    valeur = 15;
                else
                    valeur = Character.getNumericValue(number.charAt(length-i));
                dec = dec + valeur * (int) Math.pow(base, i);
        }
        return (dec);
    }

    public static String decToEnd(int dec, int base) {
        String result = "";
        while (dec > 0) {
            int quotient = dec / base;
            int reste = dec % base;
            String valeur = "";
            if (reste == 10)
                valeur = "A";
            else if (reste == 11)
                valeur = "B";
            else if (reste == 12)
                valeur = "C";
            else if (reste == 13)
                valeur = "D";
            else if (reste == 14)
                valeur = "E";
            else if (reste == 15)
                valeur = "F";
            else
                valeur = String.valueOf(reste);
            result = valeur + result;
            dec = quotient;
        }
        return result;
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int startBase = 0;
        int endBase = 0;
        System.out.println("\n>>> Définir la base de départ - (2 | 10 | 16) <<<");
        while (startBase == 0) {
            startBase = myObj.nextInt();
            if (!(startBase == 2 || startBase == 10 || startBase == 16)) {
                System.out.println(">>> Vous n'avez pas définir une base de départ correcte (2 | 10 | 16) <<<");
                startBase = 0;
            } else
                System.out.println(">>> Vous avez choisi la base de départ " + startBase + " <<<");
        }
        System.out.println("\n>>> Choisir la base de conversion voulu - (2 | 10 | 16) <<<");
        while (endBase == 0) {
            endBase = myObj.nextInt();
            if (!(endBase == 2 || endBase == 10 || endBase == 16)) {
                System.out.println(">>> Vous n'avez pas définir une base de conversion correcte (2 | 10 | 16) <<<");
                endBase = 0;
            } else if (endBase == startBase) {
                System.out.println(">>> Vous avez choisi la même base que celle de départ, choisir autre chose <<<");
                endBase = 0;
            } else
                System.out.println(">>> Vous avez choisi la base de conversion " + endBase + " <<<");
        }
        System.err.println(">>> Entrer une valeur à convertir <<<");
        String number = myObj.next();
        int valeurDec = toDec(startBase, number);
        String result = decToEnd(valeurDec, endBase);
        System.out.println(">>> " + number + " en base " + startBase + " vaut " + result + " en base " + endBase + "<<<");
    }
}
