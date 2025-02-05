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

    public boolean estCeComplet(Vol vol) {
        if (vol.getNbPlacesOccupee() == vol.getNbPlacesTotale()) {
            return true;
        } else {
            return false;
        }
    }

    public double reductionAge(Vol vol) {
        double prixReduit = vol.getTarif();
        if (this.age < 66) {
            prixReduit -= vol.getTarif() / (this.age * 0.1);
        } else {
            prixReduit -= vol.getTarif() / (this.age * 0.05)    ;
        }
        if (prixReduit <= 400) {
            return 400;
        } else {
            return prixReduit;
        }
    }

    public double changePrixPlace(Vol vol) {
        if (vol.getNbPlacesOccupee() * 100 / vol.getNbPlacesTotale() >= 80) {
            return vol.getTarif() * 1.2;
        } else if (vol.getNbPlacesOccupee() * 100 / vol.getNbPlacesTotale() <= 20) {
            return vol.getTarif() * 0.8;
        } else {
            return vol.getTarif();
        }
    }

    public double augmentationBusiness(Vol vol) {
        if (this.business) {
            return vol.getTarif() * 1.7;
        } else {
            return vol.getTarif();
        }
    }

    public double minimumPrixFinale(Vol vol) {
        if (this.prixFinale <= 500) {
            return 500;
        } else {
            return this.prixFinale;
        }
    }

    public double prixFinale(Vol vol) {
        double prix = vol.getTarif();
        prix = changePrixPlace(prix);
        prix = reductionAge(prix);
        return vol.getTarif() - this.reductionAge(vol) - this.augmentationBusiness(vol) - this.changePrixPlace(vol);
    }

    public Vol ChoisirUnVolParId(List<Vol> vols) {
        for (Vol vol : vols) {
            if (vol.getId() == this.numeroVol) {
                return vol;
            }
        }
        return null;
    }

    public Vol ChoisirUnVolParDestination(List<Vol> vols) {
        for (Vol vol : vols) {
            if (vol.getDestination().equals(this.destination)) {
                return vol;
            }
        }
        return null;
    }
}
