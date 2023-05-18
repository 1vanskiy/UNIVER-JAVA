public class Main {
    public static void main(String[] args) {

        TeslaModelX modelX = new TeslaModelX();
        modelX.setValues(250.5, 2000.5, 2014, 550.5);

        System.out.println(TeslaModelX.averageTime());

    }
}