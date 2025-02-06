public class exo07 {
    /* EXERCICE 7 : Convertir des jours au format année | mois | jours */
    public static void main(String[] args) throws Exception {
        int jours = 364;
        int années = jours / 360;
        int mois = (jours - années * 360) / 30;
        int resteJours = jours - (années * 360 + mois * 30);
        System.out.println(jours + " correspond à " + années + " années, " + mois + " mois et " + resteJours + " jours.");
    }
}
