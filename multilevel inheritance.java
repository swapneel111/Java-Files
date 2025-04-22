class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}

class Mammal extends Animal {  // Mammal inherits from Animal
    void walk() {
        System.out.println("Mammal walks");
    }
}

class Dog extends Mammal {  // Dog inherits from Mammal
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();   // Inherited from Animal
        dog.walk();  // Inherited from Mammal
        dog.bark();  // Method of Dog class
        Mammal mammal=new Mammal();
        mammal.eat();
        mammal.walk();
    }
}
/*This animal eats food
Mammal walks
Dog barks
 */