//import java.util.Arrays;
//import java.util.Scanner;

public class exo04_04 {
    public static void main(String[] args) throws Exception {
        float[] tab = { 10.30f, 1.50f, 15, -14.12f, -2f };
        float sum = 0;
        for (int i = 0; i < tab.length; i++)
            sum += tab[i];
        System.out.println("La somme des valeurs du tableau vaut " + sum);
        // System.out.println(Arrays.toString(tab));
    }
}
