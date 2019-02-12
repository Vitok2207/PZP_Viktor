import java.util.Scanner;

public class Main {

    static int breite = 7;
    static int hoehe = 7;

    public static void main(String[] args) {

        Spielfeld2();
    }

    static void Spielfeld(){

        //Rahmen des Spielfleds zeichnen

        //erste Zeile
        for(int b = 0; b < breite; b++){
            System.out.print("#");
        }
        System.out.println();

        //mitte
        for(int h = 0; h < hoehe-1; h++){
            //erstes zeichen der zeile
            System.out.print("#");
            if(h % 2 == 0){
                for(int i = 0; i < breite-2; i=i+2 ){
                    System.out.print(" #");
                }
            }else{
                for(int i = 0; i < breite-1; i++ ){
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
        static void Spielfeld2(){
            char filler= ' ';
            int zuege = 0;
            while (zuege <= 9){
                breite = 3;
                hoehe = 7;
                for(int h = 0; h < hoehe; h++){
                    if( h % 2 == 1){
                        for(int b = 0; b < breite; b++){
                            System.out.print("# "+ filler + " ");
                        }
                        System.out.println("#");
                    }else{
                        System.out.println("#############");
                    }

                }
                System.out.println();
                Scanner Eingabe = new Scanner(System.in);
                System.out.println("Bitte gib die koordinaten des zu befüllenden Feldes ein");
                System.out.println("Reihe? (1,2,3)");
                int y = Eingabe.nextInt();
                System.out.println("Feld? (1,2,3)");
                int x = Eingabe.nextInt();
                int koordinaten =
                zuege ++;
            }


        }



}
