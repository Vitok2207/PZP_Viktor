public class Main {

    public static void main(String[] args) {
        // Aufgabenstellung
        /*
        Währungsrechner soll Euro in USD und CHF umrechnen können.
        Die Ausgabe soll folgendermaßen aussehen:
        13€ entsprechen 15CHF
        10€ entsprechen 8.50$
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
        Geben Sie das Ergebnis wie oben beschrieben auf der Konsole aus.
         */

        // Programm Code für einen Währungsrechner
        System.out.println("Währungsrecher v2019.0.1\n");
        /*
        Wechselkurse
        1€ = 1.14$
        1€ = 1.14CHF
         */
        // Variable für den Wechselkurs
        double dollarCHF = 1.14;
        // Variable für die Menge an Euro
        double zahl0 = 13;
        double zahl1 = 10;

        // Umrechnung
        zahl0 = dollarCHF * zahl0;
        System.out.println("13€ sind " + zahl0 + " jeweils in Dollar und schweizer Franken");

        zahl1 = dollarCHF * zahl1;
        System.out.println("10€ sind " + zahl1 + " jeweils in Dollar und schweizer Franken");







    }
}
