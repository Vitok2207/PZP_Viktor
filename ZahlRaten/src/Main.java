import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Eingabe = new Scanner(System.in);

        System.out.println("Zahl Raten!");
        System.out.println("Das Programm generiert eine Zufallszahl im eingegebenen Bereich welche du erraten musst");

        //Bereich der zu generierenden Zahl abfragen
        System.out.println("Bereich der Zufallszahl Minimum:");
        int minimum = Eingabe.nextInt();
        System.out.println("Bereich der Zufallszahl maximum:");
        int maximum = Eingabe.nextInt();

        //Anzahl der möglichen Versuche anhand des definierten min und max festlegen
        int rundenzaehler = 0;
        int maxRunden = (maximum - minimum) / 10;
        int minRunden = 10;
        if(maxRunden < minRunden){
            maxRunden = minRunden;
        }
        System.out.println("Maximale Versuche : " + maxRunden);

        //Zufallszahl erzeugen
        int zufallszahl = Zufallszahl(minimum, maximum);
        System.out.println("Die Zufallszahl zwischen "+ minimum + " und " + maximum + " wurde generiert.\nDu kannst anfangen zu raten");
        int benutzereingabe = Eingabe.nextInt();

        //Solange eingabe ungleich Zufallszahl und Rundenzaähler nicht überschritten
        //Frage immer wieder nach einer neuen Zahl , gib einen Tip und Zähle den Rundenzähler eins hoch
        while(benutzereingabe != zufallszahl && rundenzaehler < maxRunden){
            if(benutzereingabe > zufallszahl){
                System.out.println("Pech gehabt! Versuch es nochmal etwas niedriger");
            }else{
                System.out.println("Pech gehabt! Versuch es nochmal etwas höher");
            }
            benutzereingabe = Eingabe.nextInt();
            rundenzaehler++;
        }
        //Ergebnis auswerten
        if(benutzereingabe == zufallszahl) {
            System.out.println("Glückwunsch du hast die Zahl " + zufallszahl + " Erfolgreich erraten");
        }else{
            System.out.println("Sorry du hast es in " + rundenzaehler + " Runden nicht geschafft die Zahl zu erraten!");
        }
    }

    private static int Zufallszahl(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("Maximum muss größer als Minimum sein");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
