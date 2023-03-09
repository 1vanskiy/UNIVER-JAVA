import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
//        V1
//        int a = 100;
//        int b = 200;
//        int c = 150;
//        int max = Math.max(Math.max(a,b),c);
//        System.out.println(max);
//       V2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type first num: ");
        int a = scanner.nextInt();
        System.out.print("Type second num: ");
        int b = scanner.nextInt();
        System.out.print("Type third num: ");
        int c = scanner.nextInt();
        int max = Math.max(Math.max(a,b),c);
        System.out.println("Your max number is "+max);
    }
}