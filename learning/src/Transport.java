public class Transport {

    public int speed, weight;
    public String color;
    public byte[] coordinate;

    public void setValues(int speed, int weight, String color, byte[] coordinate){
        speed = this.speed;
        weight = this.weight;
        color = this.color;
        coordinate = this.coordinate;
    }

    public String getValues() {
        String info = "Object speed: " + speed + ". Weight: " + weight + ". Color: " + color + "." ;
        String infoCoordinates = "Coordinates:\n";
        for(int i = 0; i < coordinate.length; i++)
            infoCoordinates += coordinate[i] + "\n";

        return info + infoCoordinates;
    }

}
