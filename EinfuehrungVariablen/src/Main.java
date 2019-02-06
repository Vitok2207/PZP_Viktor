public class Main {

    public static void main(String[] args) {
        // String Variablen
        // können Strings (Zeichenketten) aufnehmen.
        String meinName = "Alexander";  // Initialisierung
        System.out.println("Mein Name lautet " + meinName);

        // int Variablen
        // können Ganzzahlen aufnehmen. Ganze Zahlen können positiv und negativ sein,
        // aber keinen Kommaanteil enthalten.
        // 6    => Ganze Zahl
        // -10  => Ganze Zahl
        // 3.5  => keine ganze Zahl
        int zahl = 80;      // Initialisierung
        int zahl0 = zahl;
        System.out.println("Meine Zahl lautet " + zahl);

        // Wert verdoppeln: Wert * 2
        // 10 * 2 = 20
        zahl = 2 * zahl;    // Neue Wertzuweisung, KEINE erneute Initialisierung
        System.out.println("Meine Zahl lautet " + zahl);

        zahl = 50;
        System.out.println("Meine Zahl lautet " + zahl);

        zahl = zahl - 45;
        System.out.println("Meine Zahl lautet " + zahl);

        System.out.println("Der Ausgangswert war " + zahl0);

    }
}
