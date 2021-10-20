package Schwierigkeit;

import java.util.Scanner;

public class Mittel {
    public static void main(String[] args){
        mittel();
    }
    public static void mittel(){
        System.out.println("Frage 1: Was war Tschernobyl?");
        System.out.println("A: Ein Dorf");
        System.out.println("B: Ein Atomkraftwerk (AKW)");
        System.out.println("C: Ein Huhn");
        Scanner s = new Scanner(System.in);
        String ein = s.next();

        if(ein.equalsIgnoreCase("b")){
            System.out.println("Das ist richtig!");
        }else if(ein.equalsIgnoreCase("a")){
            System.out.println("Das ist falsch...");
        }else if(ein.equalsIgnoreCase("c")){
            System.out.println("Das ist falsch...");
        }else{
            System.out.println("Diese Auswahlmöglichkeit steht nicht zur Auswahl");
        }
//--------------------

        System.out.println("Frage 2: Wer der genannten Personen ist ein Diktator?");
        System.out.println("A: Jens Spahn");
        System.out.println("B: Donald Trump");
        System.out.println("C: Kim Jon Un");
        Scanner s1 = new Scanner(System.in);
        String ein1 = s.next();

        if(ein.equalsIgnoreCase("c")){
            System.out.println("Das ist richtig!");
        }else if(ein.equalsIgnoreCase("b")){
            System.out.println("Das ist falsch...");
        }else if(ein.equalsIgnoreCase("a")){
            System.out.println("Das ist falsch...");
        }else {
            System.out.println("Diese Auswahlmöglichkeit steht nicht zur Auswahl");
        }
//--------------------

        System.out.println("Frage 3: Wann starb Albert Einstein");
        System.out.println("A: 1900");
        System.out.println("B: 2000");
        System.out.println("C: 1960");
        Scanner s2 = new Scanner(System.in);
        String ein2 = s.next();

        if(ein.equalsIgnoreCase("c")){
            System.out.println("Das ist richtig!");
        }else if(ein.equalsIgnoreCase("b")){
            System.out.println("Das ist falsch...");
        }else if(ein.equalsIgnoreCase("a")){
            System.out.println("Das ist falsch...");
        }else{
            System.out.println("Diese Auswahlmöglichkeit steht nicht zur Auswahl");
        }
//-------------------


    }
}


