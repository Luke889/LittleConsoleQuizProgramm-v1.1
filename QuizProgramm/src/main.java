import Anmeldung.Anmeldung;
import Multiplayer.multi;
import Schwierigkeit.Leicht;
import Schwierigkeit.Mittel;
import Schwierigkeit.Schwer;

import java.util.Scanner;
/*
Author: Luke | Luhe_Xx07_
Version: v1.1
Date: 14.10.2021
Discord: Luke | Luhe_Xx07_#7048
 */
public class main {
    public static void main(String[] args){
        System.out.println("Unsere Hotline zum Bewerben: Discord: Luke | Luhe_Xx07_#7048");
Anmeldung.an();
AGB.agb();
schwierigkeit();
    }
    public static void schwierigkeit(){
        System.out.println("Welche Schwierigkeit willst du spielen? (Multiplayer in Wartung!!!)");
        System.out.println("|--------------|");
        System.out.println("|1: Leicht     |");
        System.out.println("|2: Mittel     |");
        System.out.println("|3: Schwer     |");
        System.out.println("|4: Multiplayer|");
        System.out.println("|--------------|");
        Scanner sc = new Scanner(System.in);
        String eingabe = sc.next();
        if(eingabe.equalsIgnoreCase("1")){
            Leicht.leicht();
        }else if(eingabe.equalsIgnoreCase("2")){
            Mittel.mittel();
        }else if(eingabe.equalsIgnoreCase("3")){
            Schwer.schwer();
        }else if(eingabe.equalsIgnoreCase("4")){
            multi.mp();
            multi.spiel();
        }else{
            System.out.println("Diesen Modus gibt es nicht!");
        }
    }


}
