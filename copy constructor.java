    import java.util.*;

    class Car {
        private String model;
        private int year;

        // Parameterized constructor
        Car(String model, int year) {
            this.model = model;
            this.year = year;
        }

        // Copy constructor
        public Car(Car car) {
            this.model = car.model;
            this.year = car.year;
        }

        // Display the car details
        public void display() {
            System.out.println("Car Model: " + model + ", Car Year: " + year);
        }

        // Getter for model
        public String getModel() {
            return model;
        }

        // Getter for year
        public int getYear() {
            return year;
        }

        // Setter for year
        public void setYear(int year) {
            this.year = year;
        }
    }

    public class Main {
        public static void main(String[] args) {
            // Creating an original car object
            Car car = new Car("Tesla", 2021);
            System.out.println("Original Car: ");
            car.display();

            // Creating a copied car using the copy constructor
            Car copiedCar = new Car(car);
            System.out.println("Copied Car:");
            copiedCar.display();
            System.out.println("Copied Car Year: " + copiedCar.getYear());//Copied Car Year: 2021


            // Changing the year of the copied car
            copiedCar.setYear(2022);
            System.out.println("Updated Copied Car:");
            copiedCar.display();
        }
    }
/*Original Car: 
Car Model: Tesla, Car Year: 2021
Copied Car:
Car Model: Tesla, Car Year: 2021
Updated Copied Car:
Car Model: Tesla, Car Year: 2022
 */