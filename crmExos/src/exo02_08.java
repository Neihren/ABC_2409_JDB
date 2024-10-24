import java.util.Scanner;

public class exo02_08 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Veuillez saisir le nombre de voix du 1er candidat : ");
        int first = scan.nextInt();
        System.out.print("Veuillez saisir le nombre de voix du 2nd candidat : ");
        int second = scan.nextInt();
        System.out.print("Veuillez saisir le nombre de voix du 3e candidat : ");
        int third = scan.nextInt();
        System.out.print("Veuillez saisir le nombre de voix du 4e candidat : ");
        int fourth = scan.nextInt();
        int sum = first + second + third + fourth;
        if (first > sum / 2)
            System.out.println("Le 1er candidat est élu au premier tour");
        else if (first <= sum / 8 || second > sum / 2 || third > sum / 2 || fourth > sum / 2)
            System.out.println("Le 1er candidat est battu");
        else if (first > second && first > third && first > fourth)
            System.out.println("Le 1er candidat est en ballottage favorable");
        else
            System.out.println("Le 1er candidat est en ballottage défaborable");
        scan.close();
    }
}
