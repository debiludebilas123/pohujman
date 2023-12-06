package Lesson12;

public class Lesson12Exercise3 {
    public static void main(String[] args) {
        Car car = new Car();
        displayStudent(car);
    }

    public static void displayStudent(Car thisCar) {
        System.out.format("%s %s (%d)", thisCar.make, thisCar.model, thisCar.year);
        System.out.println("\nVin: " + thisCar.vin);
        System.out.println("Colour: " + thisCar.colour);
        System.out.println("Mileage: " + thisCar.mileage);
        System.out.println("Condition: " + thisCar.condition);
        System.out.println("Price: " + thisCar.price);
    }

}
