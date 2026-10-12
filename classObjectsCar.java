public class classsObjectsCar {
    public static void main(String[] args){
        Car car = new Car();
        System.out.println(car);
        System.out.println(car.carConfig("blue", "LXI",2012));
    }
}

class Car{
    String color;
    String model;
    int year;

    public String carConfig(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
        return String.format("Configuration of the car is %s %s %d", this.color, this.model, this.year);
    }
}


