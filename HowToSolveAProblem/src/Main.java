import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean solve_problem = true;
        while (solve_problem) {
            Scanner dieEingabe = new Scanner(System.in);
            String antwort;
            boolean valid = true;

            System.out.println("Beantworte die folgende Fragen mit JA oder NEIN!\n");

            System.out.print("Funktioniert alles wie es soll? \n");
            antwort = dieEingabe.nextLine();

            if (antwort.equalsIgnoreCase("Ja")) {
                System.out.println("Lass es so!");
                System.out.println("Es gibt kein Problem!\n");
            }
            else if(antwort.equalsIgnoreCase("Nein")){
                System.out.print("Hast du dran rumgefummelt? \n");
                antwort = dieEingabe.nextLine();
                if (antwort.equalsIgnoreCase("Ja")) {
                    System.out.println("Du Blödmann!\n");

                    System.out.print("Weiß jemand davon? \n");
                    antwort = dieEingabe.nextLine();

                    if (antwort.equalsIgnoreCase("Ja")) {
                        System.out.println("Du armes Schwein!\n");
                    }
                    else if(antwort.equalsIgnoreCase("Nein")){
                        System.out.println("Behalt's für dich!");
                        System.out.println("Es gibt kein Problem!\n");
                    }else{
                        valid = false;
                    }
                }
                else if(antwort.equalsIgnoreCase("Nein")){
                    System.out.print("Bist du dafür verantwortlich? \n");
                    antwort = dieEingabe.nextLine();

                    if(antwort.equalsIgnoreCase("Ja")) {
                        System.out.print("Kannst du es jemand anderem anhängen? \n");
                        antwort = dieEingabe.nextLine();

                        if (antwort.equalsIgnoreCase("Ja")) {
                            System.out.println("Es gibt kein Problem \n");
                        }
                        else if(antwort.equalsIgnoreCase("Nein")){
                            System.out.println("Du armes Schwein! \n");
                        }else{
                            valid = false;
                        }
                    }
                    else if(antwort.equalsIgnoreCase("Nein")){
                        System.out.println("Mehr Glück als Verstand!");
                        System.out.println("Es gibt kein Problem!");
                    }else{
                        valid = false;
                    }

                }
                else{
                    valid = false;
                }

            }
            else{
                valid = false;
            }
            if (valid == true) {
                System.out.print("Noch einmal versuchen? \n");
                antwort = dieEingabe.nextLine();
                if (!antwort.equalsIgnoreCase("Ja")) {
                    solve_problem = false;
                }else{
                    System.out.print("Fehlerhfate Eingabe");
                }
            }
        }
     }
}
