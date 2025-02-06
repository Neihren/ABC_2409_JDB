import java.util.List;

public class Reservation {
    private String nom;
    private String prenom;
    private int age;
    private double prixFinale;
    private boolean business;
    private int numeroVol;
    private String destination;

    public Reservation() {
        this.nom = "";
        this.prenom = "";
        this.age = 0;
        this.prixFinale = 0;
        this.business = false;
        this.numeroVol = 0;
        this.destination = "";
    }

    public Reservation(String nom, String prenom, int age, double prixFinale, boolean business, int numeroVol, String destination) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.prixFinale = prixFinale;
        this.business = business;
        this.numeroVol = numeroVol;
        this.destination = destination;
    }

    public Reservation(Reservation reservationACloner) {
        this.nom = reservationACloner.nom;
        this.prenom = reservationACloner.prenom;
        this.age = reservationACloner.age;
        this.prixFinale = reservationACloner.prixFinale;
        this.business = reservationACloner.business;
        this.numeroVol = reservationACloner.numeroVol;
        this.destination = reservationACloner.destination;
    }

    public String toString() {
        return "Reservation [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", prixFinale=" + prixFinale + ", business=" + business + ", numeroVol=" + numeroVol + ", destination=" + destination + "]";
    }

    public String getDestination() {
        return this.destination;
    }

    public double getPrixFinal() {
        return this.prixFinale;
    }

    // Applique la réduction et renvoi le montant de la réduction :
    public double reductionAge() {
        double prixInitial = this.prixFinale;
        if (this.age < 66) {
                this.prixFinale -= this.prixFinale / (this.age * 0.1);
            } else {
                this.prixFinale -= this.prixFinale / (this.age * 0.05)    ;
            }
            if (this.prixFinale <= prixInitial - 600) {
                this.prixFinale = prixInitial - 600;
                return prixInitial - this.prixFinale;
            } else {
                return prixInitial - this.prixFinale;
            }
    }

    // Applique la réduction ou majoration et renvoi le montant de celle-ci :
    public double changePrixPlace(int occupation) {
        double prixInitial = this.prixFinale;
        if (occupation >= 80) {
            this.prixFinale *= 1.2;
            return prixInitial - this.prixFinale;
        } else if (occupation <= 20) {
            this.prixFinale *= 0.8;
            return prixInitial - this.prixFinale;
        } else {
            return prixInitial - this.prixFinale;
        }
    }

    public double augmentationBusiness() {
        double prixInitial = this.prixFinale;
        if (this.business) {
            this.prixFinale *= 1.7;
            return prixInitial - this.prixFinale;
        } else {
            return prixInitial - this.prixFinale;
        }
    }

    public boolean minimumPrixFinale() {
        if (this.prixFinale <= 500) {
            this.prixFinale = 500;
            return true;
        } else {
            return false;
        }
    }

    public Vol choisirUnVolParId(List<Vol> vols) {
        for (Vol vol : vols) {
            if (vol.getId() == this.numeroVol) {
                return vol;
            }
        }
        return null;
    }

    public Vol choisirUnVolParDestination(List<Vol> vols) {
        for (Vol vol : vols) {
            if (vol.getDestination().equals(this.destination)) {
                return vol;
            }
        }
        return null;
    }
}
