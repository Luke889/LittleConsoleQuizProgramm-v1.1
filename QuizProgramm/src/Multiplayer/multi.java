package Multiplayer;

import java.util.ArrayList;
import java.util.Scanner;

public class multi {
    public static void main(String[] args){
        mp();
        spiel();
    }
    public static void mp(){
        System.out.println("So, du bist im Multiplayer Modus! 2x Max Personen! Mehr kommt bald ;)");
        System.out.println("Die Regeln: ");
        System.out.println("1.) Es geht nicht um Zeit sondern um Punkte!");
        System.out.println("2.) Wer die meisten Punkte hat gewinnt!");
        System.out.println("3.) Es wird nicht geschummelt!");
        System.out.println("4.) Habt Spass! :)");

        System.out.println("--------------------------------------------------------------------------------------");

            System.out.println("|----------------|");
            System.out.println("|Wie heisst ihr? |");
            System.out.printf("|Spieler 1: ");
            Scanner sc = new Scanner(System.in);
            String eing = sc.next();
            System.out.printf("|Spieler 2: ");
            Scanner sc3 = new Scanner(System.in);
            String eing3 = sc3.next();
            System.out.println("|----------------|");

        ArrayList<String> name = new ArrayList<>();
        name.add(eing);
        name.add(eing3);

        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("Spieler 1: " + eing);
        System.out.println("Spieler 2: " + eing3);
        System.out.println("----------------------");
        System.out.println("Korrekt? Ja/Nein");
        Scanner s = new Scanner(System.in);
        String e = s.next();
        if(e.equalsIgnoreCase("ja")){
            System.out.println("Prima! Es startet.....");
        }else if(e.equalsIgnoreCase("nein")) {
            System.out.println("Oh dann probier nochmal! :)");

            System.out.println("|----------------|");
            System.out.println("|Wie heisst ihr? |");
            System.out.printf("|Spieler 1: ");
            Scanner sc1 = new Scanner(System.in);
            String eing1 = sc1.next();
            System.out.printf("|Spieler 2: ");
            Scanner sc2 = new Scanner(System.in);
            String eing2 = sc2.next();
            System.out.println("|----------------|");

            ArrayList<String> name1 = new ArrayList<>();
            name.add(eing1);
            name.add(eing2);

            System.out.println("Spieler 1: " + eing);
            System.out.println("Spieler 2: " + eing3);

        }else{
            System.out.println("ERROR: YOU DONT WROTE YES/NO [SYSTEM CLOSE]");
        }

    }
    public static void spiel(){
        System.out.println("Spieler 1 fängt an!");
        System.out.println("Frage 1: Wer war Stephan Hawking?");
        System.out.println("A: Ein Professor");
        System.out.println("B: Wissenschaftler");
        System.out.println("C: Lehrer");
        Scanner s = new Scanner(System.in);
        String ein = s.next();

        if(ein.equalsIgnoreCase("b")){
            System.out.println("Das ist richtig!");
        }else if(ein.equalsIgnoreCase("c")){
            System.out.println("Das ist falsch...");
        }else if(ein.equalsIgnoreCase("a")){
            System.out.println("Das ist falsch...");
        }else{
            System.out.println("Diese Auswahlmöglichkeit steht nicht zur Auswahl");
        }
        //-------

        System.out.println("Spieler 2 Ist am Zug!");
        System.out.println("Frage 1: Wer erfand das Spagetti Eis??");
        System.out.println("A: Ein Deutscher");
        System.out.println("B: Ein Italiener");
        System.out.println("C: Ein Amerikaner");
        Scanner s1 = new Scanner(System.in);
        String ein1 = s1.next();

        if(ein1.equalsIgnoreCase("a")){
            System.out.println("Das ist richtig!");
        }else if(ein1.equalsIgnoreCase("b")){
            System.out.println("Das ist falsch...");
        }else if(ein1.equalsIgnoreCase("c")){
            System.out.println("Das ist falsch...");
        }else {
            System.out.println("Diese Auswahlmöglichkeit steht nicht zur Auswahl");
        }
    }
}
