public class Main {

    public static void main(String[] args) {
        //  Folgender Text soll ausgegeben werden:
        //  Eine Ausgabe wird mit jedem Punkt oder Komma beendet.
        /*
            Lorem ipsum dolor sit amet, consetetur sadipscing elitr,
            sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat,
            sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum.

            Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.
            Lorem ipsum dolor sit amet, consetetur sadipscing elitr,
            sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat,
            sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum.


            Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.



            Ende
         */
        // Zeile 1
        System.out.print("Lorem ipsum dolor sit amet,");
        System.out.println(" consetetur sadipscing elitr, ");
        // Zeile 2
        System.out.println("sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, ");
        // Zeile 3
        System.out.print("sed diam voluptua.");
        System.out.println(" At vero eos et accusam et justo duo dolores et ea rebum. ");
        // Zeile 4 - Leerzeile
        System.out.println("");
        // Zeile 5
        System.out.print("Stet clita kasd gubergren,");
        System.out.println(" no sea takimata sanctus est Lorem ipsum dolor sit amet.");
        // Zeile 6
        System.out.print("Lorem ipsum dolor sit amet,");
        System.out.println(" consetetur sadipscing elitr, ");
        // Zeile 7
        System.out.print("sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, ");
        // Zeile 8
        System.out.print("sed diam voluptua.");
        System.out.println(" At vero eos et accusam et justo duo dolores et ea rebum. ");
        // Zeile 9
        System.out.println();
        // Zeile 10
        System.out.println();
        // Zeile 11
        System.out.print("Stet clita kasd gubergren,");
        System.out.println("no sea takimata sanctus est Lorem ipsum dolor sit amet.");
        // Zeile 12
        System.out.println();
        // Zeile 13
        System.out.println();
        // Zeile 14
        System.out.println();
        // Zeile 15
        System.err.println("Ende");
        // Fehlermeldungen können mit System.err.print() oder System.err.println() ausgegben werden.
        // Diese werden in der Konsole rot dargestellt.

    }
}
