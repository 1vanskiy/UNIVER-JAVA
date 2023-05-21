public class Cars {
    protected String brand;
    protected String model;
    protected int year;
    protected String engine;
    protected int topSpeed;
    protected int price;
    protected double accelerate;
    protected int horsePower;

    public Cars(String brand, String model, int year, String engine, int topSpeed, int price, double accelerate, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.topSpeed = topSpeed;
        this.price = price;
        this.accelerate = accelerate;
        this.horsePower = horsePower;
    }

    public void characteristic() {
        System.out.println(brand + " " + model);
        System.out.println("Year: " + year);
        System.out.println("Engine: " + engine);
        System.out.println("Top speed: " + topSpeed + " km/h");
        System.out.println("Acceleration (0-100 km/h): " + accelerate + " seconds");
        System.out.println("Horsepower: " + horsePower + " hp");
        System.out.println("Price: $" + price);
    }
}