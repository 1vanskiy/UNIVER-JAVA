

public class ex3 {

    public static void main(String[] args) {

        String direction = "u";
        int lvl = 8;
        if (direction.equals("u")) {
            if (lvl == 2 || lvl == 3) {
                System.out.println("Ліфт піднялись на 3 поверх");
            } else if (lvl <= 9 && lvl > 0) {
                System.out.println("Ліфт піднялись на " + lvl + " поверх");
            } else {
                System.out.println("Ви вказали невідомий поверх");
            }
        }

        if (direction.equals("d")) {
            if (lvl == 2 || lvl == 1) {
                System.out.println("Ліфт спустились на 1 поверх");
            } else if (lvl <= 9 && lvl > 0) {
                System.out.println("Ліфт спустились на " + lvl + " поверх");
            } else {
                System.out.println("Ви вказали невідомий поверх");
            }
        }


    }
}