import java.util.Scanner;

public class exo05_ex03 {
    public static void main(String[] args) throws Exception {
        String result;
        result = exo05_ex03.askFirstName();
        exo05_ex03.showResult(result);
    }

    public static String askFirstName() {
        String firstname;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bonjour, saisissez votre prénom : ");
        firstname = scan.nextLine();
        scan.close();
        return firstname;
    }

    public static void showResult(String name){
        System.out.println("Bonjour " + name);
    }
}