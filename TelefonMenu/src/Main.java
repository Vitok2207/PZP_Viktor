import java.util.Scanner;

public class Main {
    static int Auswahl;
    static Scanner Eingabe = new Scanner(System.in);
    static boolean nochmal = true;

    public static void main(String[] args) {

        while(nochmal) {
            System.out.println("Willkommen im Telefonwahl-Menü");
            InfoAnzeigen();
            EingabeAuswerten();
        }

    }
    static void InfoAnzeigen(){
        System.out.println("Folgende optionen stehen zur Verfügung");
        System.out.println("NeuKunde - 1");
        System.out.println("Fragen zur Rechnung - 2");
        System.out.println("Technischer Support - 3");
        System.out.println("Störung melden - 4");
        System.out.println("Hardware anfordern - 5");
        System.out.println("Kündigung - 6");
        System.out.println("Beschwerde - 7");
        System.out.println("Rechtsabteilung - 8");
        System.out.println("sonstiges - 9");
        System.out.println("Gespräch beenden - 0");
        System.out.println("Bitte geben Sie die gewünschte Option in Form der angezeigten Zahl ein");
    }

    static void EingabeAuswerten(){

        while(!Eingabe.hasNextInt()) Eingabe.next();
        Auswahl = Eingabe.nextInt();

        switch(Auswahl){
            case 1:
                Neukunde();
                break;
            case 2:
                Rechnung();
                break;
            case 3:
                Support();
                break;
            case 4:
                System.out.println("Sie haben eine Störung? gehen Sie zum Arzt!");
                break;
            case 5:
                System.out.println("Sie bekommen gern neue Hardware zu horrenden Preisen von uns!");
                break;
            case 6:
                System.out.println("Gern nehmen wir Ihre Kündigung entgegen! Richten Sie sich auf Stundenlange wartezeiten ein!");
                break;
            case 7:
                System.out.println("Gern nehmen wir Ihre Beschwerde auf und lagern Sie in Ablage P!");
                break;
            case 8:
                System.out.println("Bitte verklagen Sie uns nicht!");
                break;
            case 9:
                System.out.println("Sie haben eine Frage die in keine der vorher genannten Kategorien passt? Auf wiederhören!");
                break;
            case 0:
                System.out.println("Auf wiedersehen!");
                nochmal = false;
                break;
            default:
                System.out.println("Sie haben ein ungültiges Zeichen eingegeben, hier nochmal alle Optionen");
                InfoAnzeigen();
                break;
        }
    }

    static void Neukunde(){
        System.out.println("Willkommen Neukunde. Was könne  wir Ihnen andrehen?");
        System.out.println("Telefonie - 1");
        System.out.println("Mobilfunk - 2");
        System.out.println("DSL - 3");
        System.out.println("TV - 4");
        System.out.println("Bitte geben Sie die gewünschte Option in Form der angezeigten Zahl ein");
        Auswahl = Eingabe.nextInt();

        switch (Auswahl){
            case 1:
                System.out.println("Sie werden mit der Telefonie-Fachabteilung verbunden");
                break;
            case 2:
                System.out.println("Sie werden mit der Mobilfunk-Fachabteilung verbunden");
                break;
            case 3:
                System.out.println("Sie werden mit der DSL-Fachabteilung verbunden");
                break;
            case 4:
                System.out.println("Sie werden mit der TV-Fachabteilung verbunden");
                break;
            default:
                System.out.println("Sie haben ein ungültiges Zeichen eingegeben, hier nochmal alle Optionen");
                Neukunde();
                break;
        }

    }

    static void Rechnung() {
        System.out.println("Willkommen Neukunde. Was könne  wir Ihnen andrehen?");
        System.out.println("Fragen zum Rechnungsbetrag - 1");
        System.out.println("Offene Rechnung - 2");
        System.out.println("Gesperrtes Produkt - 3");

        System.out.println("Bitte geben Sie die gewünschte Option in Form der angezeigten Zahl ein");
        Auswahl = Eingabe.nextInt();

        switch (Auswahl) {
            case 1:
                System.out.println("Sie haben Fragen zum Rechnugnsbetrag. Frechheit!");
                break;
            case 2:
                System.out.println("Skandalös, Sie haben Ihre Rechnung nicht bezahlt und wollen jetzt auch noch unseren Support beanspruchen!");
                break;
            case 3:
                System.out.println("Ihr Produkt ist auf Lebenszeit gesperrt! Auf wiedersehen!");
                break;
            default:
                System.out.println("Sie haben ein ungültiges Zeichen eingegeben, hier nochmal alle Optionen");
                Neukunde();
                break;
        }
    }

    static void Support(){
        System.out.println("Der Technische Support hilft Ihnen gern auch bei den dümmsten Fragen!");
        System.out.println("Probleme mit Ihrem Telefon? - 1");
        System.out.println("Probleme mit Ihrem Mobiltelefon? - 2");
        System.out.println("Probleme mit Ihrem DSL Anschluss? - 3");
        System.out.println("Probleme mit Ihrem Fernsehanschluss? - 4");

            System.out.println("Bitte geben Sie die gewünschte Option in Form der angezeigten Zahl ein");
            Auswahl = Eingabe.nextInt();

            switch (Auswahl) {
                case 1:
                    System.out.println("Sie werden mit der Telefonie-Fachabteilung verbunden");
                    break;
                case 2:
                    System.out.println("Sie werden mit der Mobilfunk-Fachabteilung verbunden");
                    break;
                case 3:
                    System.out.println("Sie werden mit der DSL-Fachabteilung verbunden");
                    break;
                case 4:
                    System.out.println("Sie werden mit der TV-Fachabteilung verbunden");
                    break;
                default:
                    System.out.println("Sie haben ein ungültiges Zeichen eingegeben, hier nochmal alle Optionen");
                    Neukunde();
                    break;
            }
    }
}
