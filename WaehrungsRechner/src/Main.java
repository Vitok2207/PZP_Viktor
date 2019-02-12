public class Main {

    public static void main(String[] args) {
        /*
        Währungsrechner soll Euro in USD und CHF umrechnen können.
        Die Ausgabe soll folgendermaßen aussehen:
        13€ entsprechen 15CHF
        10€ entsprechen 8.5$
         */

        /*
        Dazu benötigen wir Kommazahlen:
        double kommaZahl = 4.3;

        Ganz ähnlich der Ganzzahlen, wir wiederholen:
        int ganzeZahl = 5;
         */

        /*
        Speichern Sie die aktuellen Wechselkurse in einer Variable ab
        Speichern Sie die Anzahl Euro in einer Variable ab
        Rechnen Sie Euro in schweizer Franken und amerikanische Dollar um.
        Geben Sie das ergebnis wie oben beschrieben auf der Konsole aus.
         */


        // Unicode Zeichen
        String usd = "\u0024";
        String eur = "\u20AC";


        // Wechselkurse
        double eurCHF = 1.154;
        double eurUSD = 1.12;

        // Ausgangswerte
        double euro = 105;

        System.out.printf("%.2f" + eur + " entsprechen " + "%.2f" + "CHF" + "\n", euro, euro*eurCHF);
        System.out.printf("%.2f" + eur + " entsprechen " + "%.2f" + usd + "\n", euro, euro*eurUSD);

        // Wenn mehr als 200 Euro: "Es fallen keine Gebühren an"
        // Wenn weniger als 200 Euro: "Es fallen 3,50€ Gebühren an"

        // Verzweigungen: if else
        if(euro > 1000) {
            System.out.println("Danke für Ihre Treue!");
            System.out.println("Es fallen keine Gebühren an!");
        }
        else if( // Bedingung
               euro > 200
        ) {
            // Wird ausgeführt, wenn die Bedingung erfüllt ist
            System.out.println("Es fallen keine Gebühren an!");
        }
        else {
            System.out.println("Es fallen Gebühren in Höhe von 3,50" + eur + " an!");
        }


    }
}
