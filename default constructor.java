import java.utils.*;

class Car{
    String model;
    Car(){
        model="Default Model";
    }
    void display() {
        System.out.println("Car Model: "+model);
    }
}

class main{
    public static void main(String [] args){
        Car car=new Car();
        car.display();

    }
}
