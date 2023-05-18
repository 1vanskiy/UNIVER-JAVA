import java.util.Scanner;
public class W3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("ВВедіть 3 дробових чисел: ");
        double w1 = input.nextDouble();
        double w2 = input.nextDouble();
        double w3 = input.nextDouble();


        double ww1 = Math.max(w1, w2);
        double ww2 = Math.max(ww1, w3);

        System.out.println(ww2);

    }
}
