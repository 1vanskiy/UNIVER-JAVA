public class Bmw  extends Cars{
    public Bmw(String brand, String model, int year, String engine, int topSpeed, int price, double accelerate, int horsePower) {
        super(brand, model, year, engine, topSpeed, price, accelerate, horsePower);
    }
}

class BmwM8 extends Cars{
    public BmwM8(String brand, String model, int year, String engine, int topSpeed, int price, double accelerate, int horsePower) {
        super(brand, model, year, engine, topSpeed, price, accelerate, horsePower);
    }
    public void characteristic(){
        System.out.println(brand + " " + model);
        System.out.println("Top speed: " + topSpeed + " km/h");
        System.out.println("Price: $" + price);
        System.out.println("Acceleration (0-100 km/h): " + accelerate + " seconds");
        System.out.println("Horsepower: " + horsePower + " hp");
    }
}

class BmwX5 extends Cars{
    public BmwX5(String brand, String model, int year, String engine, int topSpeed, int price, double accelerate, int horsePower) {
        super(brand, model, year, engine, topSpeed, price, accelerate, horsePower);
    }
    public void characteristic(){
        System.out.println(brand + " " + model);
        System.out.println("Top speed: " + topSpeed + " km/h");
        System.out.println("Price: $" + price);
        System.out.println("Acceleration (0-100 km/h): " + accelerate + " seconds");
        System.out.println("Horsepower: " + horsePower + " hp");
    }
}

class BmwSeries6 extends Cars {

    public BmwSeries6(String brand, String model, int year, String engine, int topSpeed, int price, double accelerate, int horsePower) {
        super(brand, model, year, engine, topSpeed, price, accelerate, horsePower);
    }

    public void characteristic(){
        System.out.println(brand + " " + model);
        System.out.println("Top speed: " + topSpeed + " km/h");
        System.out.println("Price: $" + price);
        System.out.println("Acceleration (0-100 km/h): " + accelerate + " seconds");
        System.out.println("Horsepower: " + horsePower + " hp");
    }
}