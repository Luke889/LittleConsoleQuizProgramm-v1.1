package Schwierigkeit;

import java.util.Scanner;

public class Leicht {
    public static void main(String[] args){
        leicht();
    }
    public static void leicht(){
        System.out.println("Frage 1: Wer war die letzten Jahre Bundeskanzler/in?");
        System.out.println("A: Angela Merkel");
        System.out.println("B: Helmut Kohl");
        System.out.println("C: Ingo Hahn");
        Scanner s = new Scanner(System.in);
        String ein = s.next();

        if(ein.equalsIgnoreCase("a")){
            System.out.println("Das ist richtig!");
        }else if(ein.equalsIgnoreCase("b")){
            System.out.println("Das ist falsch...");
        }else if(ein.equalsIgnoreCase("c")){
            System.out.println("Das ist falsch...");
        }else{
            System.out.println("Diese Auswahlmöglichkeit steht nicht zur Auswahl");
        }
//--------------------

        System.out.println("Frage 2: Was das grösste Land der Welt?");
        System.out.println("A: China");
        System.out.println("B: USA");
        System.out.println("C: Russland");
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

        System.out.println("Frage 3: Was geschah am 11.09.2021");
        System.out.println("A: Terroranschlag");
        System.out.println("B: Antarktis wurde endeckt");
        System.out.println("C: Ein neuer Stoff im PDE wurde erfunden");
        Scanner s2 = new Scanner(System.in);
        String ein2 = s.next();

        if(ein.equalsIgnoreCase("a")){
            System.out.println("Das ist richtig!");
        }else if(ein.equalsIgnoreCase("b")){
            System.out.println("Das ist falsch...");
        }else if(ein.equalsIgnoreCase("c")){
            System.out.println("Das ist falsch...");
        }else{
            System.out.println("Diese Auswahlmöglichkeit steht nicht zur Auswahl");
        }
//-------------------

    }
}



