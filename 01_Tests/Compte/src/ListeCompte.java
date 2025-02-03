import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class ListeCompte {
    private List<Compte> comptesActifs;
    private int nbComptes;
    private Scanner sc = new Scanner(System.in);

    public ListeCompte() {
        this.comptesActifs = new ArrayList<>();
        this.nbComptes = 0;
    }

    public void ajouteCompte(Compte compteAAjouter) {
        this.comptesActifs.add(compteAAjouter);
        this.nbComptes++;
    }

    public void ajouteCompte(String nom, String prenom, String nomUtilisateur, String mdp) {
        Compte compteAAjouter = new Compte(nom, prenom, nomUtilisateur, mdp);
        this.comptesActifs.add(compteAAjouter);
        this.nbComptes++;
    }

    public String toString() {
        String result;

        result = "comptesActifs :\n" + this.comptesActifs.toString();
        result += "\n nbComptes : " + this.nbComptes;

        return result;
    }

    public Compte getCompte(String nomUtilisateur) {
        for (Compte compte : comptesActifs) {
            if (compte.getNomUtilisateur().equals(nomUtilisateur)) {
                return compte;
            }
        }
        return null;
    }

    public boolean inscription() {
        Console console = System.console();
        String nom;
        String prenom;
        String nomUtilisateur;
        String mdp;
        String mdpConfirmation;
        String confirmation;

        System.out.println("Pour vous inscrire, renseigner les éléments suivants :");
        System.out.print("Nom : ");
        nom = sc.nextLine();
        System.out.print("Prenom : ");
        prenom = sc.nextLine();
        do {
            System.out.print("Nom utilisateur : ");
            nomUtilisateur = sc.nextLine();
            for (Compte compte : comptesActifs) {
                if (compte.getNomUtilisateur().equals(nomUtilisateur)) {
                    System.out.println("Nom utilisateur déjà existant, veuillez en rentrer un autre.");
                    nomUtilisateur = "";
                }
            }
        } while (nomUtilisateur.equals(""));
        do {
            do {
                mdp = new String(console.readPassword("Mot de passe ? "));
                if (!mdp.matches(".*[0-9].*")) {
                    System.out.println("Le mot de passe doit contenir minimum un chiffre");
                    mdp = "";
                } else if (!mdp.matches(".*[A-Z].*")) {
                    System.out.println("Le mot de passe doit contenir minimum une majuscule");
                    mdp = "";
                } else if (!mdp.matches(".*[a-z].*")) {
                    System.out.println("Le mot de passe doit contenir minimum une minuscule");
                    mdp = "";
                }
            } while (mdp.equals(""));
            mdpConfirmation = new String(console.readPassword("Confirmation du mot de passe : "));
            if (!mdpConfirmation.equals(mdp)) {
                System.out.println("Votre confirmation doit être identique au mot de passe");
                mdpConfirmation = "";
            }
        } while (mdpConfirmation.equals(""));
        do {
            System.out.println("Confirmez-vous votre inscription ? (Y/N)");
            confirmation = sc.nextLine();
            if (confirmation.equalsIgnoreCase("y")) {
                this.ajouteCompte(nom, prenom, nomUtilisateur, mdp);
                System.out.println("Inscription validé");
                return true;
            } else if (confirmation.equalsIgnoreCase("n")) {
                System.out.println("Inscription annulée");
                return false;
            } else {
                System.out.println("J'ai pas compris");
                confirmation = "";
            }
        } while (confirmation.equals(""));
        return false;
    }
}