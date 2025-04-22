class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {  // Dog inherits from Animal
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {  // Cat also inherits from Animal
    void meow() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();   // Inherited from Animal
        dog.bark();  // Method of Dog class

        cat.eat();   // Inherited from Animal
        cat.meow();  // Method of Cat class
    }
}
