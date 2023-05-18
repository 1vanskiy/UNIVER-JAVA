import java.util.Random;
public class ex2 {
    public static void main(String[] args) {
        int[] mas1 = new int[20];

        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            mas1[i] = random.nextInt(0,10);
        }

        System.out.print("Старий масив: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(mas1[i] +  " ");
        }

        System.out.println();

        for (int i = 1; i < 20; i += 2) {
            mas1[i] = 0;
        }

        System.out.print("Новий масив: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(mas1[i] + " ");
        }
        System.out.println();
    }
}
