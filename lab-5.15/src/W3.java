import java.util.Random;

public class W3 {
    public static void main(String[] args) {

        Random rand = new Random();
        int randNum = rand.nextInt(101);
        int i = String.valueOf(randNum).length();
        //        int i = randNum/10 +1;
        System.out.println(randNum);
        System.out.println(i);

    }
}
