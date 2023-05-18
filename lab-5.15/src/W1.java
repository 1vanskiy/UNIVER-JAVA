import java.util.Random;

public class W1 {
    public static void main(String[] args) {

        Random rand = new Random();

        int randNum = rand.nextInt(41) - 20;
        System.out.println(randNum);

    }
}