import com.crm.Vol;

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
        this.nbPlacesTotale = 0;
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
        String result ="";
        result += "| " + id;
        for (int i = String.valueOf(id).length(); i < 6; i++) {
            result += " ";
        }
        result += "|  " + destination;
        for (int i = destination.length(); i < 17; i++) {
            result += " ";
        }
        result += "|";
        for (int i = String.valueOf(String.format("%.2f", tarif)).length(); i < 11; i++) {
            result += " ";
        }
        result += String.format("%.2f", tarif) + "  ";
        result += "|";
        for (int i = String.valueOf(nbPlacesTotale).length(); i < 14; i++) {
            result += " ";
        }
        result += nbPlacesTotale + "  ";
        result += "|";
        for (int i = String.valueOf(nbPlacesOccupee).length(); i < 15; i++) {
            result += " ";
        }
        result += nbPlacesOccupee + "  ";
        result += "|";
        return result;
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
