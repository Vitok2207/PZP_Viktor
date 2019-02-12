import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Eingabe = new Scanner(System.in);
        System.out.println("Das Programm errechnet die geringste Anzahl an Scheinen und Münzen die für einen Geldbetrag nötig sind");
        System.out.println("Nenne einen Geldbetrag (€)");
        while (!Eingabe.hasNextDouble()) { System.out.println("Bitte gib einen gültigen Geldbetrag in Euro ein"); Eingabe.next(); }
        //BigDecimal Betrag = Eingabe.nextBigDecimal();
        double Betrag = Eingabe.nextDouble();
        if(Betrag > 9999999){
            System.out.println("Das ist mir zu viel!!!! Ich muss mich erst was über BigDecimal lernen");
            System.out.println("Bitte gib einen gültigen Geldbetrag in Euro ein");
            Betrag = Eingabe.nextDouble();
        }
        System.out.println("Betrag: " + Betrag + " €");

        //Runden
        Betrag = round(Betrag, 2);
        System.out.println("Gerundet auf maximal zwei Stellen: " + Betrag + " €");

        //In Cent umrechnen
        double centBetrag = Betrag * 100;
        //int centBetrag = (int)Betrag;
        // System.out.println("Cent-Betrag: " + Betrag + " Cent");

        int teiler = 50000;
        double rest = centBetrag;
        String teilerString = "";

        //Solange Rest der Modulo Rechnung != 0 wird weiter gemacht
        while(rest != 0) {

            //Alle geldscheine bzw. Münzen hier in cent definiert
            if (centBetrag >= 50000) {
                teiler = 50000;
                teilerString = "500 €";
            } else if (centBetrag >= 20000) {
                teiler = 20000;
                teilerString = "200 €";
            } else if (centBetrag >= 10000) {
                teiler = 10000;
                teilerString = "100 €";
            } else if (centBetrag >= 5000) {
                teiler = 5000;
                teilerString = "50 €";
            } else if (centBetrag >= 2000) {
                teiler = 2000;
                teilerString = "20 €";
            } else if (centBetrag >= 1000) {
                teiler = 1000;
               teilerString = "10 €";
            } else if (centBetrag >= 500) {
                teiler = 500;
                teilerString = "5 €";
            } else if (centBetrag >= 200) {
                teiler = 200;
                teilerString = "2 €";
            } else if (centBetrag >= 100) {
                teiler = 100;
                teilerString = "1 €";
            } else if (centBetrag >= 50) {
                teiler = 50;
                teilerString = "50 Cent";
            } else if (centBetrag >= 20) {
                teiler = 20;
                teilerString = "20 Cent";
            } else if (centBetrag >= 10) {
                teiler = 10;
                teilerString = "10 Cent";
            } else if (centBetrag >= 5) {
                teiler = 5;
                teilerString = "5 Cent";
            } else if (centBetrag >= 2) {
                teiler = 2;
                teilerString = "2 Cent";
            } else if (centBetrag >= 1) {
                teiler = 1;
                teilerString = "1 Cent";
            }
            // Per Modulo wird geprüft ob bei Teilung durch momentanten Teiler ein Rest bestehen bleibt
            rest = centBetrag % teiler;
            //Bleibt ein Rest übrig, wird festgestellt wie oft der Teiler in den Betrag gepasst hat
            int wieoft = (int)(centBetrag-rest)/teiler;
            //Anzahl wie oft der Teiler in den Betrag gepasst hat wird ausgegeben
            System.out.println(wieoft + " X " + teilerString );
            //der übrige rest ist der neue betrag für den nächsten Schleifendurchlauf
            centBetrag = rest;
        }

    }



    //https://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }


}
