import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int again = 1;
        while(again == 1) {
            Scanner Eingabe = new Scanner(System.in);
            System.out.println("Bitte gib eine Zahl ein, daraufhin erfährst du ob Sie gerade oder ungerade ist!");
            int Zahl = Eingabe.nextInt();

            if ((Zahl % 2) == 0) {
                System.out.println("Gerade");
            } else {
                System.out.println("Ungerade");
            }
            System.out.println("Nochmal - 1 = Ja / 0 = Nein?");
            again = Eingabe.nextInt();
        }
    }
}