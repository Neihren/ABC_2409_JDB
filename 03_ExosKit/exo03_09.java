import java.util.Scanner;

public class exo03_09 {
    public static int fact(int factor){
        int result = 1;
        for (int i = 1; i < factor; i++)
            result *= i;
        return result;
    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Combien de chevaux participent à la course ? ");
        int horses = scan.nextInt();
        System.out.print("Combien de chevaux ont été jouées ? ");
        int played = scan.nextInt();
        int order = 0;
        int disorder = 0;
        order = fact(horses) / fact(horses - played);
        disorder = fact(horses) / (fact(played) * fact(horses-played));
        System.out.println("Dans l'ordre : une chance sur " + order + " de gagner");
        System.out.println("Dans le désordre : une chance sur " + disorder + " de gagner");
        scan.close();
    }
}
