public class IntroFonctionsMaths {
    public static void main(String[] args) throws Exception {
        System.out.println(getSum(5, 3));
        System.out.println(getSub(5, 3));
        System.out.println(getSub(3, 5));
        System.out.println(getMulti(5.6f, 3f));
        System.out.println(getMulti(5.6f, -3.7f));
        System.out.println(getDiv(20, 3));
        System.out.println(getDiv(20, 0));
    }

    public static int getSum(int nb1, int nb2) {
        return (nb1 + nb2);
    }

    public static int getSub(int nb1, int nb2) {
        return (nb1 - nb2);
    }

    public static float getMulti(float nb1, float nb2) {
        return ((float) Math.round(nb1 * nb2 * 100f) / 100f);
    }

    public static float getDiv(int nb1, int nb2) {
        if (nb2 == 0)
            return (0);
        return ((float) Math.round(nb1 / nb2 * 100f) / 100f);
    }
}