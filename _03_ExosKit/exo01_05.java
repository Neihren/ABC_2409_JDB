import java.util.Scanner;

public class exo01_05 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Veuillez saisir un rayon : ");
        double radius = scan.nextInt();
        System.out.print("Veuillez saisir un angle : ");
        double angle = scan.nextInt();
        double area = (Math.PI * Math.pow(radius, 2) * angle);
        System.out.println("L'aire du secteur circulaire : " + area);
        scan.close();
    }
}
