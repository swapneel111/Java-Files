import java.util.*;

abstract class Animal{
    abstract void sound();

    void eat(){
        System.out.println("This animal foods");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}

public class Main{
    public static void main(String[] args){
        Animal dog=new Dog();
        Animal cat=new Cat();
        dog.sound();
        dog.eat();
        cat.sound();
        cat.eat();
    }
}

/*
 * OUTPUT
 * Dog barks,This animal eats food;Cat meows,Thisanimal eats food;
 */