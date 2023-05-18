import java.util.Scanner;
public class W5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("ВВедіть 2 імені: ");
        String w1 = input.next();
        String w2 = input.next();
        boolean ww = w1.equals(w2);

//        System.out.println(ww);

        if(ww==false) {
            System.out.println("Перший рядок більший за другий");
        }
        else {
            System.out.println("Другий рядок більший за перший");
        }
    }
}
