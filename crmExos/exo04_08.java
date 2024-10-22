import java.util.Arrays;
import java.util.Scanner;

public class exo04_08 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Combien de valeurs souhaitez vous entrer ? ");
        int valueNumber = scan.nextInt();
        System.out.println("");
        int[] tab = new int[valueNumber];
        int maxValue = 0;
        int position = 0;
        for (int i = 0; i < tab.length; i++) {
            System.out.print("Veuillez saisir la valeur " + (i + 1) + " :");
            tab[i] = scan.nextInt();
        }
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > maxValue) {
                maxValue = tab[i];
                position = i + 1;
            }
        }
        System.out.println(Arrays.toString(tab));
        System.out.println("\nLa valeur maximale du tableau est " + maxValue + " et elle se trouve à la position " + position +".");
        scan.close();
    }
}