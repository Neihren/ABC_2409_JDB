public class exo06 {
    /*  EXERCICE 6 : Créer un convertisseur de secondes au format Heures : Minutes : secondes */
    public static void main(String[] args) throws Exception {
        int secondes = 9999;
        int heures = secondes / (60 * 60);
        int minutes = (secondes - heures * (60 * 60)) / 60;
        System.out.println("Dans " + secondes + " secondes, il y a  " + heures + " heures " + minutes + " minutes et " + (secondes - heures * 60 * 60 - minutes * 60) + " secondes.");
    }
}
