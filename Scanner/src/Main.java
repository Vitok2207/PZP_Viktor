import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner dieEingabe = new Scanner(System.in);
        System.out.println("Wie heißt du?");
        String name = dieEingabe.nextLine();
        System.out.println("Hallo " + name);
        System.out.println("Woher kommst du?");
        String herkunft = dieEingabe.nextLine();
        System.out.println("Gruß nach " + herkunft);
        System.out.println("Wie alt bist du?");
        int alter = dieEingabe.nextInt();
        System.out.println(alter + "Jahre! Alter schwede...");
    }

}
