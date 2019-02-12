public class Main {

    public static void main(String[] args) {
        // Variablen definieren
        // Wir definieren die Unicode Zeichen in eigenen Variablen,
        // damit wir unseren Programmcode besser lesen können
        String euroZeichen = "\u20ac";
        String copyrightZeichen = "\u00A9";
        String atZeichen = "\u0040";
        // Alle Regeln für Print Ausdrücke gelten genau so für String Variablen
        String preisZeile = "Preis: \t\t\t\t239" + euroZeichen + "\n";

        // Titel des Bildes: "Mario vor einer Treppe"
        System.out.print("Titel des Bildes:\t\"Mario vor einer Treppe\"\n");
        System.out.print("Copyright: \t\t\t" + copyrightZeichen + " PZP0219\n");
        System.out.print(preisZeile);
        System.out.print("Kontakt: \t\t\tmario" + atZeichen + "kunst.de\n\n");

        // \n innerhalb eines print oder println Ausdrucks führt zu einem zusätzlichen Zeilenumbruch
        System.out.println("                        ##\n                       ###\n     ( )              ####");

        // Mehrere Strings können innerhalb einer Ausgabe mit einem Pluszeichen (+) verbunden werden.
        // Das nennt sich String Konkatenation
        System.out.println("      |              #####" + "\n" + "    -----           ######" + "\n" + "      |            #######");

        System.out.print("      |   ");
        System.out.print("_____" );
        System.out.println("   ########");
        System.out.print("     / \\  ");
        System.out.print(" | |   ");
        System.out.println("#########");
        System.out.println("--------------------------");

        System.out.println("");
        System.out.print("Erste Zeichnung auf der Konsole\nNachmittag Tag 1");


    }
}


