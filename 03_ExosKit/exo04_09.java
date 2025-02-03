//import java.util.Arrays;
import java.util.Scanner;

public class exo04_09 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Combien de notes souhaitez vous entrer ? ");
        int valueNumber = scan.nextInt();
        System.out.println("");
        double[] tab = new double[valueNumber];
        double sum = 0;
        int greater = 0;
        double average = 0;
        for (int i = 0; i < tab.length; i++) {
            System.out.print("Veuillez saisir la note " + (i + 1) + " : ");
            tab[i] = scan.nextInt();
            sum += tab[i];
        }
        average = sum / valueNumber;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > average) {
                greater++;
            }
        }
        //System.out.println(Arrays.toString(tab));
        System.out.println("\nIl y a " + greater + " notes au dessus de la moyenne de la classe.");
        scan.close();
    }
}