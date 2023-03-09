public class Main {
    public static void main(String[] args) {
//        1
        int a = 25;
        int b = 5;
        System.out.println(a/b + "\sта\s" + a%b);
//        2
        int num = 25;
        int digit1 = num / 10;
        int digit2 = num % 10;
        int sumDigits = digit1 + digit2;
        System.out.println("Сума цифр двозначного числа " + num + " дорівнює " + sumDigits);
//        3
        double pi = 3.1415;
        System.out.println("Округлений результат: " + Math.round(pi));
    }
}