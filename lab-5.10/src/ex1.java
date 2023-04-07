public class ex1 {
    public static void main(String[] args) {
        System.out.println("Цикл for:");
        for (int i = 500; i <= 650; i += 10) {
            System.out.print(i + " ");
        }
        System.out.println();

        // використання циклу while
        System.out.println("Цикл while:");
        int j = 500;
        while (j <= 650) {
            System.out.print(j + " ");
            j += 10;
        }
        System.out.println();

        // використання циклу do-while
        System.out.println("Цикл do-while:");
        int k = 500;
        do {
            System.out.print(k + " ");
            k += 10;
        } while (k <= 650);
        System.out.println();
    }
}