import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Spielfeld();
    }

        static void Spielfeld(){
           // int breite = 11;
          //  int hoehe = 7;
            char filler= ' ';       // Variable für X bzw O, jenachdem wer dran ist
            int zuege = 0;          // Zähler für die Anzahl der Spielzüge

            int feldY = 1;          // Zähler für die Anzahl der Reihen
            int feldX = 1;          // Zähler für Felder in einer Reihe
            int anzahlFelderX = 3;  // Vorgabe wie viele ausfüllbare Felder es pro Reihe geben soll
            int anzahlFelderY = 3;  // Vorgabe wie viele ausfüllbare Reihen es geben soll
            int anzahlReihen = 0;   // Zähler für Anzahl aller vorhandenen Reihen
            boolean winner = false;
            //char[][] koordinaten = new char[4][4];
            // Array indem alle von Spielern gesetzten Zeichen gespeichert werden
            //wird zunächst mit leerzeichen initialisiert
            char [][] koordinaten = {
                    {' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' '}
            };

            //Solange die Anzahl der Zuege kleiner gleich 9 (maximale Anzahl)
            while(winner == false){
                zuege ++;
                //Zähler für Felder auf der Y Achse auf 1 zurücksetzen
                feldY = 1;
                // Die Anzahl der ausgegebenen Reihen wird bei jedem Schleifendurchlauf zurückgesetzt
                anzahlReihen = 0;
               // feldX = 1;


                // Anzahl aller Reigen muss kleiner sein als Anzahl der Felder in einer (Spalte*2)-1
                while( anzahlReihen < ((anzahlFelderY*2)+1)){
                    //Zähler für Felder auf der X Achse auf 1 zurücksetzen
                    feldX = 1;
                    // Bei ungerader Reihennummer werden befüllbare Felder ausgegeben
                    if( anzahlReihen % 2 == 1){
                        for(int b = 0; b < anzahlFelderX; b++){
                            //System.out.print("# " + feldX + " ");
                            System.out.print("# "+ koordinaten[feldY][feldX] + " ");
                            feldX++;
                        }
                        System.out.print("# <-- Reihe " + feldY );
                        System.out.println();
                        feldY++;
                        //System.out.print(feldY);
                    }else{ //bei ungerader Reihennummer werden nur Rauten als trenner ausgegeben
                        for(int b = 1; b < (anzahlFelderX*4)+2; b++){
                            System.out.print("#");
                        }
                        System.out.println();
                    }
                    anzahlReihen++;
                }
                System.out.println();
                System.out.println("Spielzug: " + zuege);
                // Welcher Spieler ist an der Reihe?
                if(zuege % 2 == 1){
                    System.out.println("Spieler 1 ist dran (O)");
                    filler = 'O';
                }else{
                    System.out.println("Spieler 1 ist dran (X)");
                    filler = 'X';
                }

                Scanner Eingabe = new Scanner(System.in);
                System.out.println("Bitte gib die koordinaten des zu befüllenden Feldes ein");
                System.out.println("Reihe? (1,2,3)");
                int y = Eingabe.nextInt();
                System.out.println("Feld? (1,2,3)");
                int x = Eingabe.nextInt();


                //Position für X/O prüfen und abspeichern oder erneut abfragen
                boolean valid = false;
                while(valid == false){
                    //Filler für die eingegebene Koordinate abspeichern , wenn das Feld nicht bereits belegt ist
                    if(koordinaten[y][x] != 'X' && koordinaten[y][x] != 'O'){
                        valid = true;
                        koordinaten[y][x] = filler;
                    }else{
                        System.out.println("Das Feld ist voll!");
                        System.out.println("Reihe? (1,2,3)");
                        y = Eingabe.nextInt();
                        System.out.println("Feld? (1,2,3)");
                        x = Eingabe.nextInt();
                    }
                }
                if(zuege >= 9){
                    System.out.println("Unentschieden!");
                    break;
                }else {
                    //Prüfung ob es einen Gewinner gibt
                    //Schleife für drei waagerechte
                    for(y = 1; y <= 3; y++){
                        x = 1;
                        if(koordinaten[y][x] == 'X' && koordinaten[y][x+1] == 'X' && koordinaten[y][x+2] == 'X'){
                            System.out.println("Spieler 2 hat gewonnen");
                            winner = true;
                        }
                    }
                    //Schleife für drei senkrechte
                    for(x = 1; x <= 3; x++){
                       y = 1;
                        if(koordinaten[y][x] == 'X' && koordinaten[y+1][x] == 'X' && koordinaten[y+2][x] == 'X'){
                            System.out.println("Spieler 2 hat gewonnen");
                            winner = true;
                        }
                    }
                    //3 von oben links nach unten rechts
                    if(koordinaten[1][1] == 'X' && koordinaten[2][2] == 'X' && koordinaten[3][3] == 'X'){
                        System.out.println("Spieler 2 hat gewonnen");
                        winner = true;
                    }
                    //3 von oben rechts nach unten links
                    if(koordinaten[1][3] == 'X' && koordinaten[2][2] == 'X' && koordinaten[3][1] == 'X'){
                        System.out.println("Spieler 2 hat gewonnen");
                        winner = true;
                    }

                    /*
                    if( (koordinaten[1][1] == 'X' && koordinaten[1][2] == 'X' && koordinaten[1][3] == 'X') || (koordinaten[1][1] == 'X' && koordinaten[2][1] == 'X' && koordinaten[3][1] == 'X') || (koordinaten[1][1] == 'X' && koordinaten[2][1] == 'X' && koordinaten[3][1] == 'X')){
                        System.out.println("Spieler 1 hat gewonnen");
                    }
                    */
                }
                //Zug-Counter +1

            }
        }
}
