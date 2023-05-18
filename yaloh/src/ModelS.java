public class ModelS extends Tesla {
    public ModelS(String model, double weight, int year, int range, int topSpeed, int price, double accelerate, int horsePower) {
        super(model, weight, year, range, topSpeed, price, accelerate, horsePower);
    }
    public void characteristic(){
        System.out.println("Tesla " + model);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Range: " + range + " miles");
        System.out.println("Top speed: " + topSpeed + " mph");
        System.out.println("Price: $" + price);
        System.out.println("Acceleration (0-100 km/h): " + accelerate + " seconds");
        System.out.println("Horsepower: " + horsePower + " hp");
    }


}
