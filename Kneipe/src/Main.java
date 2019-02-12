import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Ein Kunde kommt in die Bar
        // < 16 bekommt er nur alkoholfreies
        // 16 - <18 bekommt er Bier, Wein und Sekt
        // >=18 bekommt er Spirituosen.

        var eingabe = getInput();
        boolean isInteger = isInteger(eingabe);

        if (isInteger) {
            int alter = Integer.parseInt(eingabe);
            if(alter >= 18) {
                System.out.println("Sie sind volljährig, wählen Sie aus folgendem:");
                System.out.println("Sprudel, Cola, Fante, Apfelschorle");
                System.out.println("Trollinger, Riesling, Stuttgarter Hofbräu, Paulaner, Sekt Brut");
                System.out.println("Jägermeister, Absinth, Williams, Marillenschnaps");
            }

            else if(alter >= 16) {
                System.out.println("Du bist noch nicht ganz volljährig ;)");
                System.out.println("Wähle aus folgendem:");
                System.out.println("Auswahl: Sprudel, Cola, Fanta, Apfelschorle");
                System.out.println("Trollinger, Riesling, Stuttgarter Hofbräu, Paulaner, Sekt Brut");
            }

            else {
                System.out.println("Du bist noch minderjährig.");
                System.out.println("Wähle aus folgendem");
                System.out.println("Auswahl: Sprudel, Cola, Fanta, Apfelschorle");
            }
        } else {
           System.out.println("Keine gültige Eingabe. Bitte eine Zahl eingeben");

        }

       // boolean isInteger = isInteger(alter);
        //int alter = 18;



        /*
        Schreiben Sie ein Programm, dass das alter eines Kunden entgegen nimmt
        und daraufhin gewisse Getränke zur Verfügung stellt.

        Zb.:
        Alter 15
        Auswahl: Sprudel, Cola, Fanta, Apfelschorle

        Alter 17
        Auswahl: Sprudel, Cola, Fante, Apfelschorle
        Trollinger, Riesling, Stuttgarter Hofbräu, Paulaner, Sekt Brut

        Alter 21:
        Auswahl: Sprudel, Cola, Fante, Apfelschorle
        Trollinger, Riesling, Stuttgarter Hofbräu,  Paulaner, Sekt Brut
        Jägermeister, Absinth, Williams, Marillenschnaps

         */
    }
    public static String getInput() {
        System.out.println("Bitte geben Sie Ihr alter ein und bestätigen Sie mit Enter");
        Scanner sc = new Scanner(System.in);
        var input = sc.next();
        return input;
    }

    public static boolean isInteger(String s) {
        boolean isValidInteger = false;
        try
        {
            Integer.parseInt(s);

            // s is a valid integer

            isValidInteger = true;
        }
        catch (NumberFormatException ex)
        {
            // s is not an integer
        }

        return isValidInteger;
    }
}
