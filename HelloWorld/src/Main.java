import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //  Einzeilige Kommentare werden mit zwei Schrägstrichen eingeleitet
        //  Ein Kommentar ist immer nur in der jweiligen Zeile gültig

        /*
            Mehrzeilige Kommentare werden mit einem Schrägstrich und einem Sternchen begonnen ...
            ...
            ...
            ...
            ...
            Und mit einem Sternchen gefolgt von einem Schrägstrich beendet
         */

        // Ausgaben auf der Konsole werden wiefolgt getätigt:
        out.println("Etwas anderes");   // Kommentare können auch hinter Befehle gesetzt werden!

        /*
        Befehle innerhalb eines Kommentars werden nicht ausgeführt!
        System.out.println("Ein Befehl innerhalb eines Kommentars");

        Zur Fehlersuche ist es oft hilfreich, Teile des Programms auszukommentieren!
         */

        System.out.println("");

        // Schreiben Sie eine weitere Ausgabe "Meine erste eigene Ausgabe"
        System.err.println("Meine erste eigene Ausgabe");

        //println() sorgt für einen Umbruch am Zeilenende, print() fügt keinen Zeilenumbruch hinzu
        System.out.print("Meine zweite ");
        System.out.println("eigene Ausgabe");

    }
}
