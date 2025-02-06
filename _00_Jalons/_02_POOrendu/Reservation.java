package _02_POOrendu;
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
        this.prixFinale = vol.getTarif();
        try {
            if (age <= 0) {
                throw new IllegalArgumentException("L'age ne peut pas être négatif ou nul - Réduction liée à l'age non appliquée");
            } else if (this.age < 66) {
                this.prixFinale -= vol.getTarif() / (this.age * 0.1);
            } else {
                this.prixFinale -= vol.getTarif() / (this.age * 0.05)    ;
            }
            if (this.prixFinale <= vol.getTarif() - 600) {
                this.prixFinale = vol.getTarif() - 600;
                return this.prixFinale;
            } else {
                return this.prixFinale;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return this.prixFinale;
        }   
    }

    public double changePrixPlace(Vol vol) {
        if (vol.getNbPlacesOccupee() * 100 / vol.getNbPlacesTotale() >= 80) {
            this.prixFinale *= 1.2;
            return this.prixFinale;
        } else if (vol.getNbPlacesOccupee() * 100 / vol.getNbPlacesTotale() <= 20) {
            this.prixFinale *= 0.8;
            return this.prixFinale;
        } else {
            return this.prixFinale;
        }
    }

    public double augmentationBusiness() {
        if (this.business) {
            this.prixFinale *= 1.7;
            return this.prixFinale;
        } else {
            return this.prixFinale;
        }
    }

    public double minimumPrixFinale() {
        if (this.prixFinale <= 500) {
            this.prixFinale = 500;
            return this.prixFinale;
        } else {
            return this.prixFinale;
        }
    }

    public double prixFinal(Vol vol) {
        reductionAge(vol);
        changePrixPlace(vol);
        augmentationBusiness();
        minimumPrixFinale();
        return this.prixFinale;
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
