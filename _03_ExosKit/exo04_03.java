//import java.util.Arrays;
import java.util.Scanner;

public class exo04_03 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Combien de valeurs souhaitez vous entrer ? ");
        int valueNumber = scan.nextInt();
        System.out.println("");
        int[] tab = new int[valueNumber];
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < tab.length; i++) {
            System.out.print("Veuillez saisir la valeur " + (i+1) + " :"); 
            tab[i] = scan.nextInt();
            if (tab[i] >= 0)
                positive++;
            else
                negative++;
        }
        System.out.println("\nIl y a " + positive + " valeurs positive et " + negative + " valeurs négative.");
        scan.close();
        //System.out.println(Arrays.toString(tab));
    }
}
