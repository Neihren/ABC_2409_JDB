package _02_POOrendu;

public class Vol {
    
    private int id;
    private String destination;
    private double tarif;
    private int nbPlacesTotale;
    private int nbPlacesOccupee;

    public Vol() {
        this.id = 0;
        this.destination = "";
        this.tarif = 0;
        this.nbPlacesTotale = 80;
        this.nbPlacesOccupee = 0;
    }
    
    public Vol(int id, String destination, double tarif, int nbPlacesTotale, int nbPlacesOccupee) {
        this.id = id;
        this.destination = destination;
        this.tarif = tarif;
        this.nbPlacesTotale = nbPlacesTotale;
        if (this.nbPlacesTotale < 80) {
            this.nbPlacesTotale = 80;
        }
        this.nbPlacesOccupee = nbPlacesOccupee;
    }   
    
    public Vol(Vol volACloner) {
        this.id = volACloner.id;
        this.destination = volACloner.destination;
        this.tarif = volACloner.tarif;
        this.nbPlacesTotale = volACloner.nbPlacesTotale;
        this.nbPlacesOccupee = volACloner.nbPlacesOccupee;
    }

    public String toString() {
        return "Vol [id=" + id + ", destination=" + destination + ", tarif=" + tarif + ", nbPlacesTotale=" + nbPlacesTotale + ", nbPlacesOccupee=" + nbPlacesOccupee + "]";
    }

    public int getNbPlacesTotale() {
        return this.nbPlacesTotale;
    }

    public int getNbPlacesOccupee() {
        return this.nbPlacesOccupee;
    }

    public double getTarif() {
        return this.tarif;
    }

    public int getId() {
        return this.id;
    }

    public String getDestination() {
        return this.destination;
    }
}
