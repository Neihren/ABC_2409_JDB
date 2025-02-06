import java.util.Scanner;

public class exo02_04 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Veuillez saisir l'heure : ");
        int hour = scan.nextInt();
        System.out.print("Veuillez saisir les minutes : ");
        int minute = scan.nextInt();
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59)
            System.out.println("Les données saisies sont invalides");
        minute += 3;
        if (minute >= 60) {
            minute -= 60;
            hour++;
            if (hour > 23)
                hour = 0;
        }
        System.out.println(
                "Dans 3 minutes, il sera " + String.format("%02d", hour) + "h" + String.format("%02d", minute) + ".");
        scan.close();
    }
}
