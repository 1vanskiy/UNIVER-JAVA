import com.sun.source.tree.DefaultCaseLabelTree;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ви хочете погодитись чи відмовитись?: ");
        String in = scanner.nextLine();

        switch (in.toLowerCase()) {
            case "так":
            case "ok":
            case "yes":
            case "y":
            case "+":
                System.out.println("Я погоджуюсь!");
                break;
            case "ні":
            case "no":
            case "n":
            case "-":
                System.out.println("Я відмовляюсь!");
                break;
        }
    }
}
