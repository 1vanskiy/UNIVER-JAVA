public class Audi extends Cars{
    public Audi(String brand, String model, int year, String engine, int topSpeed, int price, double accelerate, int horsePower) {
        super(brand, model, year, engine, topSpeed, price, accelerate, horsePower);
    }
}

class AudiQ8 extends Cars{
    public AudiQ8(String brand, String model, int year, String engine, int topSpeed, int price, double accelerate, int horsePower) {
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

class AudiEtron extends Cars{
    public AudiEtron(String brand, String model, int year, String engine, int topSpeed, int price, double accelerate, int horsePower) {
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

class AudiRS6 extends Cars{
    public AudiRS6(String brand, String model, int year, String engine, int topSpeed, int price, double accelerate, int horsePower) {
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
