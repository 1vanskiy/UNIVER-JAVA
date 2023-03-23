import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        String m = "До низу";
        int flor = 9;
        if (m.equals("До верху")) {
            if (flor == 2 || flor == 3) {
                System.out.println("Ви піднялись на 3 поверх");
            } else if (flor <= 9 && flor > 0) {
                System.out.println("Ви піднялись на  поверх" + flor);
            } else {
                System.out.println("Ви вказали неіснуючий поверх");
            }
        }
        if (m.equals("До низу")) {
            if (flor == 2 || flor == 1) {
                System.out.println("Ви спустились на перший поверх");
            } else if (flor <= 9 && flor > 0) {
                System.out.println("Ви спустились на " + flor + " поверх");
            } else {
                System.out.println("Ви вказали неіснючий поверх");
            }
        }
    }
}

