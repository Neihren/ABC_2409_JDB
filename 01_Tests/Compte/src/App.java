public class App {
    public static void main(String[] args) throws Exception {
        Compte toto = new Compte("Toto", "Tata", "Titi", "abc123");
        ListeCompte gmail = new ListeCompte();
        gmail.ajouteCompte(toto);
        gmail.ajouteCompte("Humery", "Ludovic", "LHumery", "Abc123");
        System.out.println(gmail.toString());
        gmail.inscription();
        System.out.println(gmail.toString());
        
    }
}
