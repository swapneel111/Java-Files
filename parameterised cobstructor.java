import java.util.*;

class Car {
    String model;

    Car(String model) {
        this.model = model;
    }

    void display() {
        System.out.println("Car Model: " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla Model X");
        car.display();
    }
}
