public class ex1 {
    public static void main(String[] args) {
        // Визначаємо розмір масиву
        int size = 49;

// Створюємо масив та заповнюємо його непарними числами
        int[] array = new int[size];
        for (int i = 1, j = 0; i < 100; i += 2, j++) {
            array[j] = i;
        }

// Виводимо елементи масиву стовпчик
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}