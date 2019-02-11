import java.util.Scanner;

public class Main {
    //Variablen deklarieren
    static Scanner Eingabe = new Scanner(System.in);
    static int laenge;
    static int breite;
    static int rahmen;
    static int fill;
    static char filler;
    static int form;
    static char ausrichtung;
    static int kantenlaenge;
    static int zahl;


    public static void main(String[] args) {
        boolean keep_running = true;
        Scanner Eingabe = new Scanner(System.in);
        willkommen();
        //Schleife um Programm mehrfach ausführen zu können
        while(keep_running == true) {
            //benutzereingaben
             form_abfragen();
            //Rechteck
            if(form == 1){
                laengeAbfragen();
                breiteAbfragen();
                rahmenAbfragen();
                fuellung_abfragen();
                //Zusammenfassung der eingegebenen Daten
                //System.out.println("Erzeuge Rechteck mit \nBreite: " + breite + "\nLänge: " + laenge + "\nRahmen: " + rahmen + "\n" );
                zeichneRechteck();
             //Dreieck
            }else if(form == 2){

                ausrichtungAbfragen();
                kantenlaengeAbfragen();
                fuellung_abfragen();
                zeichneDreieck();
            }

            keep_running = nochmalAusfuehren();
        }
        wiedersehen();
    }

    static void willkommen(){
        System.out.println("Willkommen");
    }

    static void form_abfragen(){
        System.out.println("Rechteck = 1 oder Dreieck = 2?");
        while (!Eingabe.hasNextInt()) Eingabe.next();
        form = Eingabe.nextInt();
    }

    static void laengeAbfragen(){
        //Länge abfragen,
        System.out.println("Bitte Gesamthöhe des Rechtecks eingeben");

        //Sicherstellen das ein Integer Wert eingegeben wurde. wird etwas anderes eingegeben wird erneut gefragt
        while (!Eingabe.hasNextInt()) Eingabe.next();
        laenge = Eingabe.nextInt();

        //Muss mind. 2 betragen. Solange erneut abfragen bis gültiger Wert eingegeben wurde
        while(laenge < 2) {
            System.out.println("Fehler! Die Höhe muss mindestens 2 betragen\n");
            while (!Eingabe.hasNextInt()) Eingabe.next();
            laenge = Eingabe.nextInt();
        }
    }

    static void breiteAbfragen(){
        //Breite abfragen,
        System.out.println("Bitte Gesamtbreite des Rechtecks eingeben");

        //Sicherstellen das ein Integer Wert eingegeben wurde. wird etwas anderes eingegeben wird erneut gefragt
        while (!Eingabe.hasNextInt()) Eingabe.next();
        breite = Eingabe.nextInt();

        //Solange erneut abfragen bis gültiger Wert eingegeben wurde
        while(breite < 2) {
            System.out.println("Die Breite muss mindestens 2 betragen\n");
            while (!Eingabe.hasNextInt()) Eingabe.next();
            breite = Eingabe.nextInt();
        }
    }

    static void fuellung_abfragen(){
        if(laenge > 2 && breite > 2 && breite > rahmen*2 && laenge > rahmen*2 || form == 2) {
            //Abfrage ob Rechteck gefüllt werden soll

            if(form == 1 ) { //Rechteck
                if(rahmen > 1) {
                    System.out.println("Rechteck nicht ausgeüllt = 0 - Rechteck mit Zeichen ausgefüllt = 1 - Rechteck aus Zahlen = 2");
                }else{
                    System.out.println("Rechteck mit Zeichen ausgefüllt = 1 - Rechteck aus Zahlen = 2");
                }

            }
            if(form == 2) { //Dreieck
                System.out.println("Dreieck mit Zeichen ausgefüllt = 1 - Dreieck aus Zahlen = 2");
            }

            //Sicherstellen das ein Integer Wert eingegeben wurde. wird etwas anderes eingegeben wird erneut gefragt
            while (!Eingabe.hasNextInt()) Eingabe.next();
            fill = Eingabe.nextInt();

            if(form == 1 && fill == 0 && rahmen > 0){
                System.out.println("Das Rechteck wird nicht gefüllt\n");
                filler = ' ';
            }
            if (fill == 1) {
                //Zeichen zum füllen des Rechtecks abfragen
                System.out.println("Welches Zeichen soll zur Füllung genutzt werden");
                //Nur das erste eingegebene Zeichen wird als Füller verwendet
                filler = Eingabe.next().charAt(0);
            }
            if(fill == 2){
                System.out.println("Form wird aus Zahlen erzeugt");
            }

        }else{
            System.out.println("Kein Platz im Rechteck um mit einem anderen Zeichen gefüllt zu werden");
        }
    }

    static void rahmenAbfragen(){
        //Rahmenrahmen abfragen wenn laenge und breite größer 2
        if(laenge > 2 && breite > 2){
            System.out.println("Bitte Rahmendicke des Rechtecks eingeben");

            //Sicherstellen das ein Integer Wert eingegeben wurde. wird etwas anderes eingegeben wird erneut gefragt
            while (!Eingabe.hasNextInt()) Eingabe.next();
            rahmen = Eingabe.nextInt();

            //Solange erneut abfragen bis gültiger Wert eingegeben wurde
            // Rahmenrahmen mind. 1 und maximal hälfte von höhe und breite
            while(rahmen*2 > laenge || rahmen*2 > breite || rahmen < 0){
                System.out.println("Fehlerhafte Eingabe!!!\n");
                if(rahmen < 0){
                    System.out.println("Rahmendicke darf nicht negativ sein");
                }

                if(rahmen*2 > laenge){
                    System.out.println("Rahmenrahmen " + rahmen + "*2  > Höhe " + laenge + "\nRahmenrahmen kann max. die hälfte der Rechteckhöhe betragen");
                }
                if(rahmen*2 > breite){
                    System.out.println("Rahmenrahmen " + rahmen + "*2  > Breite " + breite + "\nRahmenrahmen kann max. die hälfte der Rechteckbreite betragen");
                }
                System.out.println("Bitte Rahmendicke des Rechtecks eingeben");

                //Sicherstellen das ein Integer Wert eingegeben wurde. wird etwas anderes eingegeben wird erneut gefragt
                while (!Eingabe.hasNextInt()) Eingabe.next();
                rahmen = Eingabe.nextInt();
            }
        }
    }

    static void ausrichtungAbfragen(){
        System.out.println("Ausrichtung - L/M/R");
        ausrichtung = Eingabe.next().charAt(0);
        boolean gueltig = false;
        while( gueltig == false ){
            if(ausrichtung == 'l' || ausrichtung == 'L' || ausrichtung == 'm' || ausrichtung == 'M' || ausrichtung == 'r' || ausrichtung == 'R'){
                gueltig = true;
            }else {
                System.out.println("Ausrichtung - L/M/R");
                ausrichtung = Eingabe.next().charAt(0);
            }
        }
    }

    static void kantenlaengeAbfragen(){
        System.out.println("Kantenlänge?");
        while (!Eingabe.hasNextInt()) Eingabe.next();
        kantenlaenge = Eingabe.nextInt();
        while(kantenlaenge < 3){
            System.out.println("Kantenlänge zu klein, bitte größer wählen");
            kantenlaenge = Eingabe.nextInt();
        }
    }


    static void zeichneRechteck(){
        //Ausgabe des Rechtecks
        zahl = 1;
        //Oberer Rand
        //Erste For Schleife für Rand rahmen
        for(int d = 0 ; d < rahmen; d++) {
            //Zweite Schleife für breite
            for (int b = 0; b < breite; b++) {
                System.out.print("#");
                if (b == breite - 1) {
                    System.out.print("\n");
                }
            }
        }
        //Alle zeilen zwischen erster und letzter
        for (int l = 0; l < laenge - rahmen*2; l++) {

            //links
            //For Schleife für Rand rahmen links
            for(int dl = 0; dl < rahmen; dl++) {
                System.out.print("#");
            }
            //For Schleife für Füllung
            for (int bb = 0; bb < breite - rahmen*2; bb++) {
                //Füllung ausgeben
                if(fill == 0 || fill == 1 ) {
                    System.out.print(filler);
                }
                if(fill == 2){
                    System.out.print(zahl);
                }
            }
            //Rechts
            //For Schleife für Rahmen rechts
            for(int dr= 0; dr < rahmen; dr++) {
                System.out.print("#");
            }
            System.out.print("\n");
            zahl++;
            if(zahl == 10){
                zahl = 0;
            }
        }
        //letzte Zeile ausgeben
        for(int d = 0 ; d < rahmen; d++) {
            for (int b = 0; b < breite; b++) {
                System.out.print("#");
                if (b == breite - 1) {
                    System.out.print("\n");
                }
            }
        }
    }

    static void zeichneDreieck(){
        System.out.println("Dreieck");
        zahl = 1;
        int abstand = 0;
        int reihenlaenge = 1;
        for(int d = 0; d < kantenlaenge; d++){


            if(ausrichtung == 'R' || ausrichtung == 'r') {
                //Leerzeichen einfügen für rechtsausrichtung
                //for (int abstand = kantenlaenge - reihenlaenge; abstand > 0; abstand--) {
                abstand = kantenlaenge*2-reihenlaenge*2;
            }
            if(ausrichtung == 'M' || ausrichtung == 'm') {
                //Leerzeichen einfügen für rechtsausrichtung
                //for (int abstand = kantenlaenge - reihenlaenge; abstand > 0; abstand--) {
                abstand = (kantenlaenge-reihenlaenge);
            }
            for(int a = abstand; a > 0; a--){
                System.out.print(" ");
            }

            for(int i = 0; i < reihenlaenge; i++ ) {
                //Abhängig von ausgewählter Füllung, entsprechende Zeichen ausgeben
                if(fill == 1) {
                    System.out.print(filler + " ");
                }
                if(fill == 2) {
                    System.out.print(zahl + " ");
                }
            }
            System.out.println();
            reihenlaenge++;
            zahl++;
            if(zahl > 9){
                zahl = 0;
            }

        }
    }

    static boolean nochmalAusfuehren(){
        Scanner Eingabe = new Scanner(System.in);
        //Abfrage ob Programm erneut ausgeführt werden soll
        System.out.println("\nMöchtest du noch etwas zeichnen? (1 = Ja / 0 = Nein)");

        //Sicherstellen das ein Integer Wert eingegeben wurde. wird etwas anderes eingegeben wird erneut gefragt
        while (!Eingabe.hasNextInt()) Eingabe.next();
        int again = Eingabe.nextInt();

        if(again == 1){
            System.out.println("Und gleich nochmal ...");
            return true;
        }
        return false;
    }
    static void wiedersehen(){
        System.out.println("Auf Wiedersehen!!!");
    }
}