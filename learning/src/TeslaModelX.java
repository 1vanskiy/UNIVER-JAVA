public class TeslaModelX {

    public static double maxSpeed;
    public double weight;
    public static double range;
    public int year;


    public void setValues(double maxSpeed, double weight, int year, double range){
        maxSpeed = this.maxSpeed;
        weight = this.weight;
        year = this.year;
        range = this.range;
    }

    public static int averageTime() {
        return (int) (range + maxSpeed);

    }

}
