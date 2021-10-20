import java.util.Scanner;

public class AGB {
    public static void main(String[] args) {
        agb();
    }
    public static void agb() {
        System.out.println("Ich bin mit den AGB´s einverstanden! Schreibe (Ja)");
        Scanner sc = new Scanner(System.in);
        String sc1 = sc.next();
        if(sc1.equalsIgnoreCase("Ja")){
            System.out.println("Warte ein Moment...");
        }else{
            System.out.println("Das tut uns leid...");
        }

    }
}
