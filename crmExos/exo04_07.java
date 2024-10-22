import java.util.Arrays;
import java.util.Scanner;

public class exo04_07 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Combien de valeurs souhaitez vous entrer ? ");
        int valueNumber = scan.nextInt();
        System.out.println("");
        int[] tab = new int[valueNumber];
        for (int i = 0; i < tab.length; i++) {
            System.out.print("Veuillez saisir la valeur " + (i + 1) + " :");
            tab[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(tab));
        for (int i = 0; i < tab.length; i++)
            tab[i] = tab[i] + 1 ;
        System.out.println(Arrays.toString(tab));
        scan.close();
    }
}