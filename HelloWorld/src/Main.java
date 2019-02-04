public class Main {
    public static void main(String[] args) {
        //Einzeilige Kommentare werden mit zwei Schrägstrichen eingeleitet
        //Ein Kommentar ist immer nur in der jeweiligen Zeile gültig
        System.out.println("Hello World");

        /*
        Mehrzeilige Kommentare werden mit einem Schrägstrich un einem Sternchen begonnen...
        ....
        ....
        ....
        ....
        Und mit einem Sternchen gefolgt von einem Schrägstrich beendet
         */

        // Ausgaben auf der Konsole werden wiefolgt getätigt:
        System.out.println("Etwas anderes!");   // Kommentare können auch hinter Befehle gesetzt werden!
        System.out.println();

        /*
        Befehle innerhalb eines Kommentars werden nicht ausgeführt:
        System.out.println("Ein Befehl innerhalb eines Kommentars");

        Zur Fehlersuche ist es oft hilfreich, Teile des Programms auszukommentieren!
         */

        // Schreiben Sie eine weitere Ausgabe "Meine erste eigene Ausgabe"
        System.out.println("Meine erste eigene Ausgabe");

        // println() sorgt für einen Umbruch am Zeilenende, print() fügt keinen Zeilenumbruch hinzu
        System.out.println("Meine zweite");
        System.out.println("eigene Ausgabe");
    }
}
