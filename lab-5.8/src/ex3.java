import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int flor = 1;
        int targetFlor = 0;

        while (true) {
            System.out.print("Введіть потрібний вам поверх від 1 до 9: ");
            targetFlor = scanner.nextInt();

            if(targetFlor < 1 || targetFlor > 9) {
                System.out.println("Ви ввели неправильний поверх, введіть поверх від 1 до 9");
                continue;
            }
            if (targetFlor == 2) {
                if(flor < 2) {
                    targetFlor = 3;
                }
                if(flor > 2) {
                    targetFlor = 1;
                }
            }
            if(targetFlor > flor) {
                System.out.println("Ліфт піднімається...");
                while (targetFlor > flor) {
                    flor++;
                    System.out.println("Ліфт піднявся на " + flor + "поверх.");
                }

            } else if (targetFlor < flor) {
                System.out.println("Ліфт опускається...");
                while (targetFlor < flor){
                    flor--;
                    System.out.println("Ліфт опустився на " + flor + "поверх.");
                }

            }
            else {
                System.out.println("Ви вже на потрібному поверсі");
            }
            System.out.println("Ліфт прибув на " + flor + " поверх.");
        }


    }
}
