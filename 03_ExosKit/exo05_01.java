public class exo05_01 {
    public static void main(String[] args) throws Exception {
        int count = 0;
        int nb = 0;
        int sum = 0;
        System.out.println("Affichage des 4 premiers nombres parfaits :");
        while (count < 4) {
            nb = nb + 1;
            sum = 0;
            for (int i = nb - 1; i > 0; i--) {
                if (nb % i == 0)
                    sum += i;
            }
            if (sum == nb) {
                System.out.println(nb + " est un nombre parfait.");
                count++;
            }
        }
    }
}