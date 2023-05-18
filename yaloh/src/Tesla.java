public class Tesla {
//    public String name;
    public String model;
    public double weight;
    public int year;
    public int range;
    public int topSpeed;
    public double accelerate;
    public int price;
    public int horsePower;

    public Tesla(String model, double weight, int year, int range, int topSpeed, int price, double accelerate, int horsePower) {
        this.model = model;
        this.weight = weight;
        this.year = year;
        this.range = range;
        this.topSpeed = topSpeed;
        this.price = price;
        this.accelerate = accelerate;
        this.horsePower = horsePower;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public double getRange() {
        return range;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public double getAccelerate() {
        return accelerate;
    }



//    public void accelerate() {
//        System.out.println("The car is accelerating.");
//    }

//    public double maxS() {
//        return year+range;
//    }

    // Додайте інші методи, які вам потрібні тут

//    @Override
//    public String toString() {
////     return
////        System.out.println("Tesla "+model);
////        System.out.println("Weight: "+weight);
////        System.out.println("Year: "+ year);
////        System.out.println("Range: "+range);
////        System.out.println("Top speed: "+topSpeed);
////        System.out.println("Accelerate: "+ accelerate);
////        System.out.println("HP: "+ horsePower);
////        System.out.println("Price: "+ price);
//    }
//
}