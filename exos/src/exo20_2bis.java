public class exo20_2bis {
    public static void main(String[] args) {
        int nbEtoiles = 10;
        int midSpaces = nbEtoiles*2+1;
        while (nbEtoiles > 0) {
            int frontSpaces = midSpaces/2-1;
            System.out.println("*");
            while (midSpaces > 0) {
                System.out.println(" ");
                midSpaces--;
            }
            while (frontSpaces > 0) {
                System.out.println(" ");
            }
            
            nbEtoiles--;
        }
    }
}
