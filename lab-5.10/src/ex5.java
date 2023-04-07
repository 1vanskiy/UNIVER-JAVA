public class ex5 {
    public static void main(String[] args) {
        int sum = 0;        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                int hour1 = i / 10;                int hour2 = i % 10;                int min1 = j / 10;                int min2 = j % 10;                if (hour1 == min2 && hour2 == min1) {
                    sum++;                }
            }
        }
        System.out.println(sum);
    }
}