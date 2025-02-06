public class exo19 {
    /*
     * EXERCICE 9 : Convertir des jours au format année | mois | jours , à partir de
     * la date du 1er Janvier 2024 , en prendra en compte les années bissextiles et
     * les mois finissant le 31
     */
    public static void main(String[] args) throws Exception {
        int nbDays = 1461;
        int curYear = 2024;
        boolean moreThanAMonth = true;
        int monthCtr = 0;
        int yearCtr = 0;
        int daysThisMonth = 0;
        int daysCtr = nbDays;
        while (moreThanAMonth) {
            if (monthCtr + 1 == 2) {
                if ((curYear % 4 == 0 && curYear % 100 != 0) || (curYear % 400 == 0))
                    daysThisMonth = 29;
                else
                    daysThisMonth = 28;
            }
            else if ((((monthCtr + 1) % 2 == 0) && (monthCtr + 1) <= 7) || ((monthCtr + 1) % 2 != 0 && (monthCtr + 1) > 7))
                daysThisMonth = 30;
            else
                daysThisMonth = 31;
            if (daysCtr >= daysThisMonth) {
                daysCtr = daysCtr - daysThisMonth;
                monthCtr++;
                if ((monthCtr + 1) > 12) {
                    yearCtr++;
                    curYear++;
                    monthCtr = 0;
                }
            }
            else
                moreThanAMonth = false;
        }
        System.out.println("\n\n" + nbDays + " jours après le 1er Janvier 2024 équivaut à " + yearCtr + " an, "
                + monthCtr + " mois et " + daysCtr + " jours");
    }
    /*
     * Résultat Attendu : 365 jour après le 1er Janvier 2024 équivaut à 1 an , 0
     * mois et 0 jour
     */
}
