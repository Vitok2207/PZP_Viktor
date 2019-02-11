
import java.util.Scanner;
public class Main {
    //Deklaration
    static Scanner Eingabe = new Scanner(System.in);
    static int form;
    static int hoehe;
    static int breite;
    static int kantenlaenge;
    static char ausrichtung;
    static int inhalt = 1;

    public static void main(String[] args) {

        System.out.println("Rechteck = 1 oder Dreieck = 2?");
        form = Eingabe.nextInt();

        if(form == 1){
            zeichneRechteck();
        }else if(form == 2){
            System.out.println("Ausrichtung - L/M/R");
            ausrichtung = Eingabe.next().charAt(0);
       //     if(ausrichtung == 'M' || ausrichtung == 'm') {
        //        zeichneDreieck_mittig();
         //   }else {
                zeichneDreieck();
          //  }
        }
    }
    static void zeichneRechteck(){
        System.out.println("Breite Rechteck?");
        breite = Eingabe.nextInt();
        System.out.println("Höhe Rechteck?");
        hoehe = Eingabe.nextInt();

        for(int h = 0; h < hoehe; h++){
            //Breite
            for(int b=0; b < breite; b++){
                System.out.print(inhalt);
            }
            System.out.println();
            inhalt++;
            if(inhalt == 10){
                inhalt = 0;
            }
        }
    }
    static void zeichneDreieck(){
        System.out.println("Kantenlänge?");
        kantenlaenge = Eingabe.nextInt();

        int abstand = 0;
        int reihenlaenge = 1;
        for(int d = 0; d < kantenlaenge; d++){


            if(ausrichtung == 'R' || ausrichtung == 'r') {
                //Leerzeichen einfügen für rechtsausrichtung
                //for (int abstand = kantenlaenge - reihenlaenge; abstand > 0; abstand--) {
                abstand = kantenlaenge-reihenlaenge;
            }
            if(ausrichtung == 'M' || ausrichtung == 'm') {
                //Leerzeichen einfügen für rechtsausrichtung
                //for (int abstand = kantenlaenge - reihenlaenge; abstand > 0; abstand--) {
                abstand = (kantenlaenge-reihenlaenge)/2;
            }
                for(int a = abstand; a > 0; a--){
                    System.out.print(" ");
                }



            for(int i = 0; i < reihenlaenge; i++ ) {
                System.out.print(inhalt);
            }
            System.out.println();
            reihenlaenge++;
            inhalt++;
            if(inhalt > 9){
                inhalt = 0;
            }

        }
    }

    static void zeichneDreieck_rechts(){
        System.out.println("Kantenlänge?");
        kantenlaenge = Eingabe.nextInt();

        int reihenlaenge = 1;
        //int abstandshalter = 0;
        //Höhe des Dreiecks
        for(int d = 0; d < kantenlaenge; d++){

            //Leerzeichen einfügen für rechtsausrichtung
           int abstand = kantenlaenge-reihenlaenge;
            for(int a = abstand; a > 0; a--){
                System.out.print(" ");
            }
            //Reihenlänge der auszugebenden Zahlen
            for(int i = 0; i < reihenlaenge; i++ ) {
                System.out.print(inhalt);
            }
            System.out.println();
            reihenlaenge++;
            inhalt++;
            if(inhalt > 9){
                inhalt = 0;
            }

        }
    }

    static void zeichneDreieck_mittig(){
        System.out.println("Kantenlänge?");
        kantenlaenge = Eingabe.nextInt();

        int reihenlaenge = 1;
        int abstand ;

        //int abstandshalter = 0;
        //Anzahl Zeilen des Dreiecks
        for(int d = 0; d < kantenlaenge; d++){

            abstand = ((kantenlaenge-reihenlaenge)/2);
            /*
            if(((kantenlaenge-reihenlaenge) % 2) == 1){
                //System.out.print("ungerade");
                abstand = ((kantenlaenge-reihenlaenge)/2);
            }else{
                abstand = ((kantenlaenge-reihenlaenge)/2);

            }
            */

            for(int a = abstand; a > 0; a--){
                System.out.print(" ");
            }
            //Reihenlänge der auszugebenden Zahlen
            for(int i = 0; i < reihenlaenge; i++ ) {
                System.out.print(inhalt);
            }
            System.out.print("    abstand: " + abstand);
            System.out.println();
            reihenlaenge++;
            inhalt++;
            if(inhalt > 9){
                inhalt = 0;
            }

        }
    }

}
