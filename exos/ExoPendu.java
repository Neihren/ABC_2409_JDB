import java.util.Scanner;
import java.util.Random;

public class ExoPendu {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static String display(int i) {
        String drawing = "";    
        if (i == 10) {
            drawing =   "\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\r\n" + //
                        "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\r\n" + //
                        "| |                   | |\r\n" + //
                        ": :                   : :\r\n" + //
                        ". .                   . .";
        }
        else if (i == 9) {
            drawing =   " _\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\r\n" + //
                        "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\r\n" + //
                        "| |                   | |\r\n" + //
                        ": :                   : :\r\n" + //
                        ". .                   . .";
        }
        else if (i == 8) {
            drawing =   " ____________________\r\n" + //
                        "| .__________________|\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\r\n" + //
                        "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\r\n" + //
                        "| |                   | |\r\n" + //
                        ": :                   : :\r\n" + //
                        ". .                   . .";
        }
        else if (i == 7) {
            drawing =   " ____________________\r\n" + //
                        "| .__________________|\r\n" + //
                        "| | / /\r\n" + //
                        "| |/ /\r\n" + //
                        "| | /\r\n" + //
                        "| |/\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\r\n" + //
                        "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\r\n" + //
                        "| |                   | |\r\n" + //
                        ": :                   : :\r\n" + //
                        ". .                   . .";
        }
        else if (i == 6) {
            drawing =   " ___________.._______\r\n" + //
                        "| .__________))______|\r\n" + //
                        "| | / /      ||\r\n" + //
                        "| |/ /       ||\r\n" + //
                        "| | /        ||\r\n" + //
                        "| |/         ||\r\n" + //
                        "| |          ||\r\n" + //
                        "| |          (\\\\)\r\n" + //
                        "| |          `--'\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\r\n" + //
                        "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\r\n" + //
                        "| |                   | |\r\n" + //
                        ": :                   : :\r\n" + //
                        ". .                   . .";
        }
        else if (i == 5) {
            drawing =   " ___________.._______\r\n" + //
                        "| .__________))______|\r\n" + //
                        "| | / /      ||\r\n" + //
                        "| |/ /       ||\r\n" + //
                        "| | /        ||.-''.\r\n" + //
                        "| |/         |/  _  \\\r\n" + //
                        "| |          ||  `/,|\r\n" + //
                        "| |          (\\\\`_.'\r\n" + //
                        "| |           `--'\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\r\n" + //
                        "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\r\n" + //
                        "| |                   | |\r\n" + //
                        ": :                   : :\r\n" + //
                        ". .                   . .";
        }
        else if (i == 4) {
            drawing =   " ___________.._______\r\n" + //
                        "| .__________))______|\r\n" + //
                        "| | / /      ||\r\n" + //
                        "| |/ /       ||\r\n" + //
                        "| | /        ||.-''.\r\n" + //
                        "| |/         |/  _  \\\r\n" + //
                        "| |          ||  `/,|\r\n" + //
                        "| |          (\\\\`_.'\r\n" + //
                        "| |           `--'\r\n" + //
                        "| |          |. .|\r\n" + //
                        "| |          |   |\r\n" + //
                        "| |          | . |\r\n" + //
                        "| |          |   |\r\n" + //
                        "| |           ---\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\r\n" + //
                        "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\r\n" + //
                        "| |                   | |\r\n" + //
                        ": :                   : :\r\n" + //
                        ". .                   . .";
        }
        else if (i == 3) {
            drawing =   " ___________.._______\r\n" + //
                        "| .__________))______|\r\n" + //
                        "| | / /      ||\r\n" + //
                        "| |/ /       ||\r\n" + //
                        "| | /        ||.-''.\r\n" + //
                        "| |/         |/  _  \\\r\n" + //
                        "| |          ||  `/,|\r\n" + //
                        "| |          (\\\\`_.'\r\n" + //
                        "| |         .-`--'\r\n" + //
                        "| |        /Y . .|\r\n" + //
                        "| |       // |   |\r\n" + //
                        "| |      //  | . |\r\n" + //
                        "| |     ')   |   |\r\n" + //
                        "| |           ---\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\r\n" + //
                        "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\r\n" + //
                        "| |                   | |\r\n" + //
                        ": :                   : :\r\n" + //
                        ". .                   . .";
        }
        else if (i == 2) {
            drawing =   " ___________.._______\r\n" + //
                        "| .__________))______|\r\n" + //
                        "| | / /      ||\r\n" + //
                        "| |/ /       ||\r\n" + //
                        "| | /        ||.-''.\r\n" + //
                        "| |/         |/  _  \\\r\n" + //
                        "| |          ||  `/,|\r\n" + //
                        "| |          (\\\\`_.'\r\n" + //
                        "| |         .-`--'.\r\n" + //
                        "| |        /Y . . Y\\\r\n" + //
                        "| |       // |   | \\\\\r\n" + //
                        "| |      //  | . |  \\\\\r\n" + //
                        "| |     ')   |   |   (`\r\n" + //
                        "| |           ---\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "| |\r\n" + //
                        "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\r\n" + //
                        "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\r\n" + //
                        "| |                   | |\r\n" + //
                        ": :                   : :\r\n" + //
                        ". .                   . .";
        }
        else if(i == 1) {
            drawing =   " ___________.._______\r\n" + //
                        "| .__________))______|\r\n" + //
                        "| | / /      ||\r\n" + //
                        "| |/ /       ||\r\n" + //
                        "| | /        ||.-''.\r\n" + //
                        "| |/         |/  _  \\\r\n" + //
                        "| |          ||  `/,|\r\n" + //
                        "| |          (\\\\`_.'\r\n" + //
                        "| |         .-`--'.\r\n" + //
                        "| |        /Y . . Y\\\r\n" + //
                        "| |       // |   | \\\\\r\n" + //
                        "| |      //  | . |  \\\\\r\n" + //
                        "| |     ')   |   |   (`\r\n" + //
                        "| |          ||'\r\n" + //
                        "| |          || \r\n" + //
                        "| |          || \r\n" + //
                        "| |          || \r\n" + //
                        "| |         / | \r\n" + //
                        "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\r\n" + //
                        "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\r\n" + //
                        "| |                   | |\r\n" + //
                        ": :                   : :\r\n" + //
                        ". .                   . .";
        }
        else {
            drawing =   " ___________.._______\r\n" + //
                        "| .__________))______|\r\n" + //
                        "| | / /      ||\r\n" + //
                        "| |/ /       ||\r\n" + //
                        "| | /        ||.-''.\r\n" + //
                        "| |/         |/  _  \\\r\n" + //
                        "| |          ||  `/,|\r\n" + //
                        "| |          (\\\\`_.'\r\n" + //
                        "| |         .-`--'.\r\n" + //
                        "| |        /Y . . Y\\\r\n" + //
                        "| |       // |   | \\\\\r\n" + //
                        "| |      //  | . |  \\\\\r\n" + //
                        "| |     ')   |   |   (`\r\n" + //
                        "| |          ||'||\r\n" + //
                        "| |          || ||\r\n" + //
                        "| |          || ||\r\n" + //
                        "| |          || ||\r\n" + //
                        "| |         / | | \\\r\n" + //
                        "\"\"\"\"\"\"\"\"\"\"|_`-' `-' |\"\"\"|\r\n" + //
                        "|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|\r\n" + //
                        "| |        \\ \\        | |\r\n" + //
                        ": :         \\ \\       : :\r\n" + //
                        ". .          `'       . .";
        }
        return(drawing);
    }
    public static void main(String[] args) {
        clearScreen();
        @SuppressWarnings("resource")
        Scanner reader = new Scanner(System.in);
        String rejouer = "O";
        while (rejouer.equalsIgnoreCase("o")) {
            String[] words = { "chemin", "gouvernement", "nuit", "histoire", "fait", "ligne", "membre",
                    "niveau", "aimer", "entendre", "tourner", "dire", "vouloir", "venir", "voudrait",
                    "obtenir", "avoir", "air", "apporter", "suivre", "permettre", "ouvrir", "couper",
                    "haut", "petit", "public", "politique", "historique", "culturel", "standard", "seul", "capable",
                    "mauvais", "commercial", "bon", "puissance", "grand", "divers", "personnel", "vrai", "Algorithme",
                    "Angular",
                    "API", "Application", "Backend", "Boucle", "Conteneur", "client", "serveur",
                    "Docker", "Fonction", "Github", "Hackaton", "Identifiant", "JavaScript", "jQuery", "Langage",
                    "MySQL",
                    "Navigateur", "Page", "Parser", "PDF", "PHP", "Proxy", "React", "Responsive", "Serveur", "SQL",
                    "SSH", "SSL",
                    "Variable", "Wordpess", "Workspace" };
            Random r = new Random();
            int rand = r.nextInt(words.length);
            String word = words[rand];
            String[] wordLetters = word.split("");
            String[] clues = wordLetters.clone();
            for (int i = 0; i < wordLetters.length; i++)
                clues[i] = "-";
            int life = 10;
            String playedChars = "";
            while (life > 0) {
                boolean isGood = false;
                clearScreen();
                System.out.println("Lettres déjà jouées : " + playedChars);
                System.out.println(display(life));
                System.out.print("\nMot à trouver : ");
                for (int i = 0; i < clues.length; i++)
                    System.out.print(clues[i]);
                System.out.print("\nEntrer une lettre : ");
                String currLetter = reader.nextLine();
                
                playedChars = playedChars + currLetter + " ";
                for (int i = 0; i < wordLetters.length; i++) {
                    if (wordLetters[i].equalsIgnoreCase(currLetter)) {
                        isGood = true;
                        clues[i] = currLetter;
                    }
                }
                if (!isGood)
                    life--;
                
                System.out.println("Nombre de vie restantes : " + (life));
                String compare = "";
                for (String element : clues)
                    compare += element;
                if (compare.equalsIgnoreCase(word)) {
                    System.out.println("\u001B[47m\u001B[31m" + "Vous Avez Gagné !" + "\u001B[37m\u001B[40m");
                    break;
                }
            }
            System.out.println(display(life));
            System.out.println("Le mot à deviner était : " + word);
            System.out.println("Souhaitez vous rejouer ? O/N");
            rejouer = reader.nextLine();
        }
    }
}