public class algob {
    public static String[] jobOffers(String soughtJob) {
        String offers[][] = {  {"ID", "Title", "Contract", "Exp", "Wage"},
                                {"001", "Developpeur Logiciel", "CDI", "5", "3200"},
                                {"002", "Developpeur Web", "Interim", "2", "2800"},
                                {"003", "Lead Developpeur", "CDD", "10", "5000"},
                                {"004", "Developpeur FullStack", "Freelance", "4", "3500"}}; 
        return(offers[i]);
    }
    
    public static String contractTypes(String soughtContract) {
        String contracts[][] = {{"ID", "Type", "", "", ""},
                                {"001", "CDI", "CDD", "Interim", "Freelance"},
                                {"002", "CDD", "CDI", "Interim", "Freelance"},
                                {"003", "Interim", "CDD", "Freelance", "CDI"},
                                {"004", "Freelance", "CDD", "Interim", "CDI"}}; 
        return(contracts[i]);
    }

    public static void main(String[] args) {
        
    }
}
