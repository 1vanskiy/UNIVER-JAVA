public class Main {
    public static void main(String[] args) {
        Tesla tesla = new Tesla(" ",0,0,0,0,0,0,0);

        ModelS modelS = new ModelS("Model S", 2250, 2023,630, 320,129990,1.99,1020);

        Model3 model3 = new Model3("Model 3", 1840, 2023,570, 260,56990,3.1,450);

        ModelX modelX = new ModelX("Model X", 2460, 2023,505, 250,99990,2.7,1020);

        double averagePrice = (modelS.getPrice() + model3.getPrice() + modelX.getPrice()) / 3;

        double averageWeight = (modelS.getWeight() + model3.getWeight() + modelX.getWeight()) / 3;

        double averageRange = (modelS.getRange() + model3.getRange() + modelX.getRange()) / 3;

        double averageHorsePower = (modelS.getHorsePower() + model3.getHorsePower() + modelX.getHorsePower()) / 3;

        double averageAccelerate = (modelS.getAccelerate() + model3.getAccelerate() + modelX.getAccelerate()) / 3;


// prints
        modelS.characteristic();

        System.out.println(" ");

        modelX.characteristic();

        System.out.println(" ");

        model3.characteristic();

        System.out.println(" ");

        System.out.println("Average price for Tesla is " + Math.round(averagePrice) + " $");
        System.out.println("Average weight for Tesla is " + Math.round(averageWeight) + " kg");
        System.out.println("Average range for Tesla is " + Math.round(averageRange) + " km");
        System.out.println("Average horse power for Tesla is " + Math.round(averageHorsePower) + " hp");
        System.out.println("Average acceleration (0-100 km/h) is " + Math.round(averageAccelerate) + " s");



    }



}