public class Main {

    public static void main(String[] args) {
        boolean antwort;

        System.out.println("Funktioniert alles wie es soll?");
        antwort = false
        if (antwort) {
            System.out.println("Lass es so!");
            System.out.println("Es gibt kein Problem!");
        } else {
            System.out.println("Hast du dran rumgefummelt?");
            antwort = false;

            if (antwort) {
                System.out.println("Du Blödmann!");

                System.out.println("Weiß jemand davon?");
                antwort = false;

                if (antwort) {
                    System.out.println("Du armes Schwein!");
                } else {
                    System.out.println("Behalt's für dich!");
                    System.out.println("Es gibt kein Problem!");
                }
            } else {
                System.out.println("Bist du dafür verantwortlich?");
                antwort = false;

                if (antwort) {
                    System.out.println("Kannst du es jemand anderem anhängen?");
                    antwort = false;

                    if (antwort) {
                        System.out.println("Es gibt kein Problem");
                    } else {
                        System.out.println("Du armes Schwein!");
                    }

                } else {
                    System.out.println("Mehr Glück als Verstand!");
                    System.out.println("Es gibt kein Problem!");
                }

            }
        }


    }
}
