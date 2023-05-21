public class Porsche  extends Cars{
    public Porsche(String brand, String model, int year, String engine, int topSpeed, int price, double accelerate, int horsePower) {
        super(brand, model, year, engine, topSpeed, price, accelerate, horsePower);
    }
}

class PorscheCayenne extends Cars{
    public PorscheCayenne(String brand, String model, int year, String engine, int topSpeed, int price, double accelerate, int horsePower) {
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

class Porsche911 extends Cars{
    public Porsche911(String brand, String model, int year, String engine, int topSpeed, int price, double accelerate, int horsePower) {
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

class PorscheTaycan extends Cars{
    public PorscheTaycan(String brand, String model, int year, String engine, int topSpeed, int price, double accelerate, int horsePower) {
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
