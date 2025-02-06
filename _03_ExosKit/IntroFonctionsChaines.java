public class IntroFonctionsChaines {
    public static void main(String[] args) throws Exception {
        System.out.println(getMC2());
        System.out.println(getUserName("mickaël", "devoldère"));
        System.out.println(getFullName("devoldère", "mickaël"));
        System.out.println(askUser("devoldère", "mickaël"));
    }

    public static String getMC2() {
        return ("Albert EINSTEIN");
    }

    public static String getUserName(String prenom, String nom) {
        return (prenom + nom);
    }

    public static String getFullName(String nom, String prenom) {
        return (prenom.substring(0, 1).toUpperCase() + prenom.substring(1) + " " + nom.toUpperCase());
    }

    public static String askUser(String nom, String prenom) {
        return ("Bonjour " + getFullName(nom, prenom) + ", connaissez-vous " + getMC2() + " ?");
    }
}