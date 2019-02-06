public class Main {

    public static void main(String[] args) {
        // Variablen definieren
        //String name = "Mario";
        //System.out.println(name);
        String euroZeichen = "\u20ac";
        System.out.println(euroZeichen);
        String copyrightZeichen = "\u00A9";
        System.out.println(copyrightZeichen);
        String atZeichen = "\u0040";
        System.out.println(atZeichen);




        // Titel des Bildes: "Mario vor einer Treppe"
        System.out.print("Titel des Bildes:\t\"Mario vor einer Treppe\"\n");
        // \n innerhalb eines print oder println Ausdrucks führt zu einem zusätzlichen Zeilenumbruch.
        System.out.print("Copyright by\t\t" + "\u00A9" + "Vitok2207\n");
        System.out.print("Preis:\t\t\t\t" + "199\u20ac\n");
        System.out.print("Kontakt:\t\t\t" + "viktorstoppel\u0040gmail.com\n\n\n");
        System.out.println("                              ##");
        System.out.println("                            ####");
        // Mehrere Strings können innerhalb einer Ausgabe mit einem Pluszeichen (+) verbunden werden.
        // Das nennt sich String Konkatenation
        System.out.println("                          ######");
        System.out.println("                  O     ########");
        System.out.println("                <||>  ##########");
        System.out.println("                //  ############");
        System.out.println("                  ##############");
        System.out.println("                ################");
        System.out.println("       ___    ##################");
        System.out.println("       | |  ####################");
        System.out.println("       | |######################");
        System.out.println("--------------------------------");


    }
}
