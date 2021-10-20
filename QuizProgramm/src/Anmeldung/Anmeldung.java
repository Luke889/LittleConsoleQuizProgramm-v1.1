package Anmeldung;

import java.util.ArrayList;
import java.util.Scanner;

public class Anmeldung {
    public static void main(String[] args) {
        an();
    }

    public static boolean an() {
        System.out.println("Hallo! Willkommen bei dem QuizProgramm!");
        System.out.println("Hier einmal Anmelden:");
        System.out.println("");

        System.out.printf("Benutzername: ");
        Scanner b = new Scanner(System.in);
        String b1 = b.next();

        System.out.printf("Passwort: ");
        Scanner p = new Scanner(System.in);
        String p1 = p.next();

        ArrayList<String> list = new ArrayList<>();
        list.add(b1);
        list.add(p1);

        System.out.println("Melde dich an: ");

        System.out.printf("Benutzername: ");
        Scanner c = new Scanner(System.in);
        String c1 = c.next();

        System.out.printf("Passwort: ");
        Scanner v = new Scanner(System.in);
        String v1 = v.next();
        if (c1.equals(b1)) {
            if (v1.equals(p1)) {
                System.out.println("Erfolgreich eingeloggt!");
            } else {
                System.out.println("Passwort ist nicht korrekt...");
            }
        } else {
            System.out.println("Benutzername ist falsch...");
        }
        return false;
    }

}

