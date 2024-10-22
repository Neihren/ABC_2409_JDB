//import java.util.Arrays;
//import java.util.Scanner;

public class exo04_06 {
    public static void main(String[] args) throws Exception {
        int[] tab = { 4, 8, 7, 12 };
        int[] tab2 = { 3, 6 };
        int result = 0;
        for (int i = 0; i < tab2.length; i++)
            for (int j = 0; j < tab.length; j++)
                result = result + tab[j] * tab2[i];
        System.out.println("Le résultat est : " + result);
        // System.out.println(Arrays.toString(tab));
    }
}