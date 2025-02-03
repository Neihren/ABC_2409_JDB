//import java.util.Arrays;
//import java.util.Scanner;

public class exo04_06 {
    public static void main(String[] args) throws Exception {
        int[] tab = { 4, 8, 7, 12 };
        int[] tab2 = { 3, 6 };
        int result = 0;
        String display = "";
        for (int i = 0; i < tab2.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                display += tab2[i] + " * " + tab[j];
                result = result + tab[j] * tab2[i];
                if (j != tab.length-1 && i != tab2.length) {
                    display += " + ";
                }
            }
        }
        System.out.println("Le résultat est " + display + " = " + result);
        // System.out.println(Arrays.toString(tab));
    }
}