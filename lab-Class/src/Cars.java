public class Cars {
    //    public String name;
    public String brand;
    public String model;

    public int year;
    public String engine;
    public int topSpeed;
    public double accelerate;
    public int price;
    public int horsePower;

    public Cars(String brand, String model,  int year, String engine, int topSpeed, int price, double accelerate, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.topSpeed = topSpeed;
        this.price = price;
        this.accelerate = accelerate;
        this.horsePower = horsePower;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getEngine() {
        return engine;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public double getAccelerate() {
        return accelerate;
    }



}

