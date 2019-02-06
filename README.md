# Prozedurale Programmierung

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

#Tag 2

Sonderzeichen auf der Konsole
Backslash
Um einen \ auszugeben, müssen wir zwei Backslashes ("\\") eintragen. 
System.out.print("Ein Backslash wird ausgegeben: \\"); 
Ausgabe: Ein Backslash wird ausgegeben \ 

Neue Zeile
Um eine neue Zeile auszugeben, können wir zusätzlich zu println() auch \n verwenden. 
System.out.print("Neue Zeile \n"); 
System.out.print("Test"); 
Ausgabe: Neue Zeile 
Test

\n kann jederzeit in einem print() Statement genutzt werden.
System.out.print("Das soll in eine Zeile... \nDas in die andere.");
Das soll in eine Zeile...
Das in die andere.

Unicode Zeichen
https://unicode-table.com/de/ 
Unicode Zeichen können in einem eigenen String mit \u gefolgt von der Unicode Codierung eingegeben werden. 
System.out.print("Preis: 239" + "\u20ac"); 
Ausgabe: Preis: 239€

Verzweigungen
if(Bedingung) {Anweisung}
Die Anweisung wird ausgeführt, wenn die Bedingung erfüllt ist. 
Es können beliebig viele if Blöcke vor einem Else Block stehen.

else if(Bedingung) {Anweisung}
Die Bedingung wird geprüft, wenn die vorangehende Bedingung nicht erfüllt war. 
Die Anweisung wir ausgeführt, wenn die aktuelle Bedingung erfüllt ist. 
Es können beliebig viele else if Blöcke zwischen einem if und einem else Block stehen.

else {Anweisung}
Die Anweisung wird ausgeführt, wenn die Bedingung nicht erfüllt ist. 
Else kann nie alleine stehen.

