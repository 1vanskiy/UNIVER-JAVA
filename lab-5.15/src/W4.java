import java.util.Scanner;

public class W4 {
    public static void main(String[] args) {
        Scanner martin = new Scanner(System.in);

        int num1 = (int) (1 + Math.random()*2);
        int num2 = (int) (1 + Math.random()*2);
        int num3 = (int) (1 + Math.random()*2);

        System.out.println("У вас є дві спроби, щоб відгати послідовність трьох чисел від 1 до 3:");

        System.out.print("Перша спроба. Введіть 3 числа:");
        int guess1 = martin.nextInt();
        int guess2 = martin.nextInt();
        int guess3 = martin.nextInt();

        if (guess1 == num1 && guess2 == num2 && guess3 == num3){
            System.out.println("Ви виграли!");
        } else {
            System.out.println("Ви програли, проте у вас є ще одна спроба");
        }
        System.out.print("Друга спроба. Введіть три числа:");
        guess1 = martin.nextInt();
        guess2 = martin.nextInt();
        guess3 = martin.nextInt();

        if (guess1 == num1 && guess2 == num2 && guess3 == num3){
            System.out.println("Ви виграли!");
        } else {
            System.out.println("Ви програли. Гру закінчено. Правильна послідовність чисел була " + num1 + " " + num2 + " " + num3 + ".");
        }
    }
}
