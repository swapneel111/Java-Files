interface Vehicle{
    void start();
    void stop();
}

class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Car is starting");
    }
    @Override
    public void stop(){
        System.out.println("Car is stopping");
    }
}

class Bike implements Vehicle{
    @Override
    public void start(){
        System.out.println("Bike is starting");
    }
    @Override
    public void stop(){
        System.out.println("Bike is stopping")
    }
}

public class Main{
    public static void main(String[] args){
        Vehicle vehicle=new Car();
        Vehicle vehicle=new Bike();
        car.start();
        car.stop();
        bike.start();
        bike.stop();
    }
}

/*
 * Car is starting,CAR IS STOPPING,Bike isstarting,Bike is stopping
 */
