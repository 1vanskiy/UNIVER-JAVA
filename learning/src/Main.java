import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Transport bmw = new Transport();
        bmw.setValues(250, 2000, "black", new byte[] {0, 0, 0});
        String res1 = bmw.getValues();
        System.out.println(res1);


        Transport truck = new Transport();
        truck.speed = 140;
        truck.weight = 5600;
        truck.color = "red";
        truck.coordinate = new byte [] {100, 0, 100};

        String res2 = truck.getValues();
        System.out.println(res2);
//
//        System.out.println("Truck speed " + truck.speed + "km/h");
//        System.out.println("Truck weight " + truck.weight + "kg");
//        System.out.println("Truck is a " + truck.color + " color");
//        System.out.println("Truck coordinate is a " + Arrays.toString(truck.coordinate)+ " xyz");

    }
}