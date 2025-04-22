class Animal {
    // Overridden method
    public void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();   // Animal reference, Animal object
        Animal myDog = new Dog();         // Animal reference, Dog object
        Animal myCat = new Cat();         // Animal reference, Cat object

        myAnimal.sound();  // Calls Animal's sound method
        myDog.sound();     // Calls Dog's overridden sound method
        myCat.sound();     // Calls Cat's overridden sound method
    }
}
/*Some generic animal sound
Dog barks
Cat meows
 */