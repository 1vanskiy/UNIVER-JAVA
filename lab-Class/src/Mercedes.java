public class Mercedes extends Cars{
    public Mercedes(String brand, String model, int year, String engine, int topSpeed, int price, double accelerate, int horsePower) {
        super(brand, model, year, engine, topSpeed, price, accelerate, horsePower);
    }
}


class MercedesGLS extends Cars{
    public MercedesGLS(String brand, String model, int year, String engine, int topSpeed, int price, double accelerate, int horsePower) {
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

class MercedesClassE extends Cars{
    public MercedesClassE(String brand, String model, int year, String engine, int topSpeed, int price, double accelerate, int horsePower) {
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

class MercedesEQS extends Cars{
    public MercedesEQS(String brand, String model, int year, String engine, int topSpeed, int price, double accelerate, int horsePower) {
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