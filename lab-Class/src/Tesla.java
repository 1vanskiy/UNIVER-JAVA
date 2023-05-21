public class Tesla extends Cars {
    public Tesla(String brand, String model, int year, String engine, int topSpeed, int price, double accelerate, int horsePower) {
        super(brand, model, year, engine, topSpeed, price, accelerate, horsePower);
    }
}


class TeslaModelS extends Cars {
    public TeslaModelS(String brand, String model, int year, String engine, int topSpeed, int price, double accelerate, int horsePower) {
        super(brand, model, year, engine, topSpeed, price, accelerate, horsePower);
    }
    public void characteristic(){
        System.out.println(brand + " " + model);
        System.out.println("Year" + year);
        System.out.println("Engine: " + engine);
        System.out.println("Top speed: " + topSpeed + " km/h");
        System.out.println("Acceleration (0-100 km/h): " + accelerate + " seconds");
        System.out.println("Horsepower: " + horsePower + " hp");
        System.out.println("Price: $" + price);

    }
}


class TeslaModel3 extends Cars {
    public TeslaModel3(String brand, String model, int year, String engine, int topSpeed, int price, double accelerate, int horsePower) {
        super(brand, model,  year, engine, topSpeed, price, accelerate, horsePower);
    }
    public void characteristic(){
        System.out.println(brand + " " + model);
        System.out.println("Top speed: " + topSpeed + " km/h");
        System.out.println("Price: $" + price);
        System.out.println("Acceleration (0-100 km/h): " + accelerate + " seconds");
        System.out.println("Horsepower: " + horsePower + " hp");
    }
}


class TeslaModelX extends Cars {
    public TeslaModelX(String brand, String model, int year, String engine, int topSpeed, int price, double accelerate, int horsePower) {
        super(brand, model,  year, engine, topSpeed, price, accelerate, horsePower);
    }
    public void characteristic(){
        System.out.println(brand + " " + model);
        System.out.println("Top speed: " + topSpeed + " km/h");
        System.out.println("Price: $" + price);
        System.out.println("Acceleration (0-100 km/h): " + accelerate + " seconds");
        System.out.println("Horsepower: " + horsePower + " hp");
    }
}