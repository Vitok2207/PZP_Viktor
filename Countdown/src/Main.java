import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Gib eine Zahl ein. Ich zähle runter");
        Scanner Eingabe = new Scanner(System.in);
        while(!Eingabe.hasNextInt()) Eingabe.next();
        int zahl = Eingabe.nextInt();

        for (int countdown = zahl; countdown >= 0; countdown --){
            System.out.println(countdown);
            sleep();
        }
    }

    static void sleep(){
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
