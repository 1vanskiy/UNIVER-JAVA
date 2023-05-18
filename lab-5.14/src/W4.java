import java.util.Scanner;
public class W4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ВВедіть 2 імені: ");
        String w1 = input.next();
        String w2 = input.next();


        boolean ww = w1.toLowerCase().equals(w2.toLowerCase());

        System.out.println(ww);
    }
}
