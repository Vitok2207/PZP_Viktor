import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner einbinden
        // Zwei Zahlen einlesen und als Laenge und breite abspeichern

        Scanner derScanner = new Scanner(System.in);
        System.out.print("Geben Sie die Länge ein:");
        int Laenge = derScanner.nextInt();
        System.out.print("Geben Sie Breite ein: ");
        int breite = derScanner.nextInt();


        // Gefülltes Rechteck
        for (int i = 1; i <= Laenge; i++) {
            for (int j = 1; j <= breite; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.print("Geben Sie die Rahmenstärke an: ");
        int rahmen = derScanner.nextInt();
        // Ungefülltes Rechteck
        // Erste Zeile
        for (int i = 1; i <= rahmen; i++) {
            for (int j = 1; j <= breite; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        // 2. - vorletzte Zeile
        for (int i = 1; i <= Laenge - rahmen * 2; i++) {
            System.out.print("#");
            for (int j = 1; j <= breite - rahmen * 2; j++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }
        // Letzte Zeile
        for (int i = 1; i <= rahmen; i++) {
            for (int j = 1; j <= breite; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
    }
}


