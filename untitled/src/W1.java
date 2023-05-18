import java.util.Scanner;
public class W1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("ВВедіть 5 слів: ");
        String w1 = input.next();
        String w2 = input.next();
        String w3 = input.next();
        String w4 = input.next();
        String w5 = input.next();

        String ww = w1.concat(" ").concat(w2).concat(" ").concat(w3).concat(" ").concat(w4).concat(" ").concat(w5);

        System.out.println(ww);

    }
}
