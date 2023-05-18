import java.util.Scanner;
public class W2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("ВВедіть 5 слів: ");
        String w1 = input.next();
        String w2 = input.next();
        String w3 = input.next();
        String w4 = input.next();
        String w5 = input.next();

        String ww = w1.substring(0,1).concat(" ").concat(w2.substring(0,1)).concat(" ").concat(w3.substring(0,1)).concat(" ").concat(w4.substring(0,1)).concat(" ").concat(w5.substring(0,1));

        System.out.println(ww.toLowerCase());
    }
}
