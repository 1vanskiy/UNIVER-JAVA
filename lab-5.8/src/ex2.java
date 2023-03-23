import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your number: ");
        int n = scanner.nextInt();

        int d1 = n / 100;
        int d2 = n / 10 % 10;
        int d3 = n % 10;
        int max = d1;
        if (d2 > max)
            max = d2;
        if (d3 > max)
            max = d3;
        System.out.println(max);
        System.out.println("Max digit in your number is " + max);
    }
}