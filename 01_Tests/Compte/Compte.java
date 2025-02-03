public class Compte {
    private String nom;
    private String prenom;
    private String nomUtilisateur;
    private String mdp;

    public Compte() {
        this.nom = "";
        this.prenom = "";
        this.nomUtilisateur = "";
        this.mdp = "";
    }

    public Compte(String nom, String prenom, String nomUtilisateur, String mdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.nomUtilisateur = nomUtilisateur;
        this.mdp = mdp;
    }

    public String toString() {
        String result;

        result = "\n####################################";
        result += "\n# name = " + nom;
        result += "\n# surname = " + prenom;
        result += "\n# username = " + nomUtilisateur;
        result += "\n# password = " + mdp;
        result += "\n####################################";
        return result;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getNomUtilisateur() {
        return this.nomUtilisateur;
    }

    public String getMdp() {
        return this.mdp;
    }
}


