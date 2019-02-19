# Tag 1
## Kommentare
Werden vom Compiler ignoriert.
### Einzeilig
Eingeleitet mit zwei Schrägstrichen <br>
// Das ist ein Kommentar
### Mehrzeilige
Eingeleitet durch Schrägstrich und Sternchen, beendet durch Sternchen und Schrägstich <br>
/*  Das ist ein mehrzeiliger Kommentar <br>
    Das gehört noch dazu <br>
    Ende des Kommentars */

## Ausgaben auf der Konsole
### Mit Zeilenumbruch
System.out.println("Hello World");

### Ohne Zeilenumbruch
System.out.print("Hello World ohne Zeilenumbruch");

### Fehlermeldungen
Fehlermeldungen werden auf der Konsole rot dargestellt. <br>
System.err.print("Fehlermeldung ohne Zeilenumbruch"); <br>
System.err.println("Fehlermeldung mit Zeilenumbruch"); <br>


#Tag 2
## Sonderzeichen auf der Konsole
### Backslash
Um einen \ auszugeben, müssen wir zwei Backslashes ("\\\\") eintragen. <br>
System.out.print("Ein Backslash wird ausgegeben: \\\\"); <br>
Ausgabe: Ein Backslash wird ausgegeben \ <br>
### Neue Zeile
Um eine neue Zeile auszugeben, können wir zusätzlich zu println() auch \\n verwenden. <br>
System.out.print("Neue Zeile \\n"); <br>
System.out.print("Test"); <br>
Ausgabe: Neue Zeile <br>
Test<br><br>
\\n kann jederzeit in einem print() Statement genutzt werden.<br>
System.out.print("Das soll in eine Zeile... \\nDas in die andere.");<br>
Das soll in eine Zeile...<br>
Das in die andere.<br>

### Unicode Zeichen
https://unicode-table.com/de/ <br>
Unicode Zeichen können in einem eigenen String mit \\u gefolgt von der Unicode Codierung eingegeben werden. <br>
System.out.print("Preis: 239" + "\u20ac"); <br>
Ausgabe: Preis: 239€

## Verzweigungen
### if(Bedingung) {Anweisung}
Die Anweisung wird ausgeführt, wenn die Bedingung erfüllt ist. <br>
Es können beliebig viele if Blöcke vor einem Else Block stehen.

### else if(Bedingung) {Anweisung}
Die Bedingung wird geprüft, wenn die vorangehende Bedingung nicht erfüllt war. <br>
Die Anweisung wir ausgeführt, wenn die aktuelle Bedingung erfüllt ist. <br>
Es können beliebig viele else if Blöcke zwischen einem if und einem else Block stehen.

### else {Anweisung}
Die Anweisung wird ausgeführt, wenn die Bedingung nicht erfüllt ist. <br>
Else kann nie alleine stehen.


# Tag 3
## Operatoren
### \> Größer
if(alter > 17)<br>
Alles, was größer 17 ist erfüllt die Bedingung.

### \< Kleiner
if(alter < 16) <br>
Alles, was kleiner 16 ist erfüllt die Bedingung.
### \>= Größer-gleich
if(alter >= 18) <br>
18 und alles, was größer 18 ist erfüllt die Bedingung.
### \<= Kleiner-gleich
if(alter <= 10) <br>
10 und alles was, kleiner 10 ist erfüll die Bedingung.
### == Gleich
if(alter == 21) <br>
NUR 21 erfüllt die Bedingung
### != Ungleich
if(alter != 21) <br>
ALLES AUßER 21 erfüllt die Bedingung

## Datentypen
### String
Zeichenkette (32bit) <br>
String meinWort = "Hallo";
### int
Ganzzahl (32bit) <br>
int zahl = 3;
### double
Kommazahl (64bit) <br>
double kommaZahl = 3.8; <br>
!Achtung! Komma wird als Punkt geschrieben
### boolean
Kann zwei Werte annehmen, true oder false (wahr oder falsch).<br>
boolean antwort = false; <br>
if(antwort) entspricht if(antwort == true) <br>
if(!antwort) entspricht if(antwort == false) <br>

## Scanner
Mit dem Scanner können wir Eingaben entgegennehmen. <br>
Vor public class Main ergänzen wir import java.util.Scanner; <br>
In der public static void Main ergänzen wir Scanner derScanner = new Scanner(System.in);<br>
Strings können wir dann mit derScanner.nextLine(); auslesen. <br>
Ganzzahlen mit derScanner.nextInt();

## Schleifen
### For-Schleife
Häufig werden wir Teile unseres Programm öfter ausführen müssen. <br>
Um nicht alles kopieren zu müssen, können wir uns Schleifen zu nutze machen.<br>
Der allgemeine Aufbau einer For-Schleife sieht folgendermaßen aus: <br>
for ( Zählvariable mit Anfangswert; Bedingung; Schrittweite) { <br>
      // Anweisung, die wiederholt werden soll <br>
} <br>
Diese können wir beliebig oft ineinander schachteln, wie wir es beim Zeichnen eines Rechteckes nutzen.


#Tag 4
Bearbeitung des Projekts Rechteck


#Tag 5
##Ausgelagerten Methoden
Wir können Teile unseres Programms zur besseren Struktur auslagern und bei Bedarf wieder aufrufen.
### Auslagern
static void methodenName() { Anweisungen, die ausgeführt werden sollen. }
### Aufruf in der main Methode
public static void main(String[] args) { <br>
    methodenName(); <br>
}


#Tag 6
TBD - To be done


#Tag 7
##while-Schleife
Führt den Anweisungsblock solange aus, wie die Bedingung im Schleifenkopf erfüllt ist. <br>
while(Bedingung) {<br>
Anweisungen <br>
}<br>
Mit break; können wir jederzeit aus der Schleife springen. Praktisch um beispielsweise ganze Programme nach dem Durchlauf zu wiederholen.
##switch case
Bietet sich an, wenn wir wir mehrere explizite Werte prüfen möchten.<br>
Ein Switch Case kann nur einzelne Werte prüfen, keine Wertebereiche! <br>
switch(zahl) { <br>
case 4: <br>
... Anweisungen<br>
break;
case 5:
case 6:
case 7:
... Anweisungen<br>
break; <br>
default: <br>
... Wird ausgeführt, wenn kein Case weiter oben bereits ausgeführt wurde. Entsprich also dem else{} Block bei einer if/else Verzweigung. <br>
break; <br>
}


# Tag 8
## Verzögerungen mit thread.sleep
Mit thread.sleep(1000) können wir unser Programm um 1 sec in der Ausführung unterbrechen. <br>
In den Runden Klammern steht die Anzahl der Millisekunden. <br>
try<br>
        {<br>
            thread.sleep(5000);   // Programm wird für 5 Sekunden angehalten <br>
        }<br>
        catch (InterruptedException e)<br>
        {<br>
            e.printStackTrace();  // Sollten Fehler auftreten, werden diese ausgegeben<br>
        }<br>
Wichtig! Thread.sleep(1000); muss in einen try-catch Block gebaut werden, da es Fehler auswerfen kann, welche wir auffangen müssen!
## Modulo Operator
Mit % (Modulo) können wir den Rest einer Division berechnen.<br>
10 % 7 = 3<br>
10 / 7 = 1 Rest 3<br>
Der Rest ist hierbei relevant, dieser wird angegeben.<br>
Der Modulo Operator (%) kann wie jeder anderer arithmetische Operator (+,-,*,/) verwendet werden.


# Tag 9
## Verknüpfte Bedingungen
Seither haben wir in einer if-Abfrage lediglich eine Bedingung geprüft<br>
if(zahl == 5) { ... } <br>
Wir können jedoch mehr als nur eine Bedingung setzen.
### UND Verknüpfung
Mit doppeltem kaufmännischem Und (&&) können wir eine UND Verknüpfung erstellen.<br>
Diese ergibt true (wahr), wenn beide Bedingungen erfüllt sind.<br>
Beispiel: zahl = 5<br>
if(zahl > 2 && zahl < 10) { ... } <br>
Der Anweisungsblock würde ausgeührt werden, da die Bedingungen erfüllt sind. <br>
5 ist größer zwei UND kleiner 10. <br>
if(zahl > 8 && zahl < 10) { ... } <br>
Der Anweisungsblock würde  NICHT ausgeührt werden, da die Bedingungen erfüllt sind. <br>
5 ist NICHT größer 8, aber kleiner 10. <br>
### ODER Verknüpfung
Mit zwei senkrechten Strichen können wir ODER Verknüpfungen einleiten. <br>
Diese ergibt true, wenn mindestens eine Bedingung erfüllt ist.
Beispiel: zahl = 5<br>
if(zahl > 8 || zahl < 10) { ... } <br>
Der Anweisungsblock würde ausgeührt werden, da eine der Bedingungen erfüllt ist. <br>
5 ist NICHT größer 8, aber kleiner 10. <br>


# Tag 10
## Methoden mit Parameter
Java für Dummies - Seite 214ff
## Methoden mit Rückgabetyp
Java für Dummies - Seite 216ff
## Methoden mit Parameter und Rückgabetyp
Methoden können gleichzeitig Parameter annehmen und einen Rückgabewert besitzen. Das eine schließt das andere nicht aus!

# Tag 11
## Zustandsautomaten
Ein Zustandsautomat ist eine Verbindung von while und switch mitderen Hilfe wir Zustände modellieren können. <br>
Zwischen Zuständen kann beliebig oft gesprungen werden, sie können beliebig oft wiederholt werden. <br>
Eine außerhalb der while Schleife definierte Zustandsvariable entscheidet über den aktuellen Zustand, also den Fall, der ausgeführt werden soll. <br>
Um zwischen den Zuständen zu wechseln, müssen wir nur die Variable zustand verändern. <br>
Sobald der aktuelle Fall (case) beendet wird, wird im nächsten Durchlauf der dem Zustand entsprechende Fall ausführt.
Beispiel: <br>
int zustand = 0;<br>
while(zustand < 3) {<br>
switch(zustand) {<br>
case 0: // Starte Programm<br>
// Ausgabe: Willkommen bei TicTacToe V1.1 <br>
zustand = 1;  // Zustand wird auf 1 gesetzt => Im nächsten Durchlauf wird der nächste Zustand ausgeführt! <br>
break;<br>
case 1: // Führe Programm aus<br>
// Tic Tac Toe Spiel<br>
zustand = 2; // Zustand wird auf 2 gesetzt<br>
break;<br>
case 2: // Beende Programm<br>
// Nachfragen, ob beendet werde soll<br>
// Wenn ja, zustand = 3 (3 liegt außerhalb unserer Grenze der While Schleife, daher wird der Automat beendet)
// Wenn nein, dann zustand = 1 (Programm wird nochmal gestartet)<br>
break;<br>
}<br>
}<br>
