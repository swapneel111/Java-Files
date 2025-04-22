import java.util.*;

public class Functions{
    void printMyName(String name){
        System.out.println(name);
    }//non-static method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        Functions obj= new Functions();//we are instantiating functions class means creating an obj and then passing print method to the object of the class
        obj.printMyName(name);
        sc.close();

    }
}