class Person {
    // Private fields to ensure encapsulation
    private String name;
    private int age;
    private String address;

    // Constructor to initialize Person object
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        // Adding validation example: Age should be a positive number
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Please enter a positive number.");
        }
    }

    // Getter method for address
    public String getAddress() {
        return address;
    }

    // Setter method for address
    public void setAddress(String address) {
        this.address = address;
    }

    // Method to display the person's details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a Person object using the constructor
        Person person = new Person("John Doe", 30, "123 Main St");

        // Displaying the person's initial details
        System.out.println("Initial Details:");
        person.display();

        // Using setter methods to modify the person's details
        person.setName("Jane Smith");
        person.setAge(35);
        person.setAddress("456 Elm St");

        // Displaying the updated details
        System.out.println("\nUpdated Details:");
        person.display();

        // Trying to set an invalid age
        person.setAge(-5);  // Should display an error message
    }
}
    