package Schwierigkeit;

import java.util.Scanner;

public class Schwer {
    public static void main(String[] args){
        schwer();
    }
    public static void schwer(){
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
//--------------------

        System.out.println("Frage 2: Zu welchen Land gehört die Stadt: Peking?");
        System.out.println("A: China");
        System.out.println("B: Brasilien");
        System.out.println("C: Niederlande");
        Scanner s1 = new Scanner(System.in);
        String ein1 = s.next();

        if(ein.equalsIgnoreCase("a")){
            System.out.println("Das ist richtig!");
        }else if(ein.equalsIgnoreCase("b")){
            System.out.println("Das ist falsch...");
        }else if(ein.equalsIgnoreCase("c")){
            System.out.println("Das ist falsch...");
        }else {
            System.out.println("Diese Auswahlmöglichkeit steht nicht zur Auswahl");
        }
//--------------------

        System.out.println("Frage 3: Wer ist der Reichste Unternehmer der Welt? Stand: 2021");
        System.out.println("A: Elon Musik");
        System.out.println("B: Jeff Bezos");
        System.out.println("C: Mark Zuckerberg");
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
