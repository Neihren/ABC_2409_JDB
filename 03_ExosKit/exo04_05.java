import java.util.Arrays;
//import java.util.Scanner;

public class exo04_05 {
    public static void main(String[] args) throws Exception {
        int[] tab = { 10, 1, 15, -14, -2 };
        int[] tab2 = { 23, -6, 52, 12, -8 };
        int[] sumtab = new int[5];
        for (int i = 0; i < tab.length; i++)
            sumtab[i] = tab[i] + tab2[i];
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(tab2));
        System.out.println(Arrays.toString(sumtab));
    }
}