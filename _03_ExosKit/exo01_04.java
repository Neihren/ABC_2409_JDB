import java.util.Scanner;

public class exo01_04 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Veuillez saisir un rayon : ");
        double radius = scan.nextInt();
        double area = (4.0 * Math.PI * Math.pow(radius, 2));
        double volume = ((4.0 * Math.PI * Math.pow(radius, 3)) / 3.0);
        System.out.println("L'aire de la sphère est : " + area);
        System.out.println("Le volume de la sphère est : " + volume);
        scan.close();
    }
}
