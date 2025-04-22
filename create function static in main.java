import java.util.*;

public class Main{

    static class printMyName {
        static String name;
        printMyName(String name){
            this.name=name;
        }
        static void display(){
            System.out.println("Name is : "+name);
        }
    }/*In your Java code, you are trying to call the printMyName method from the main method, but since printMyName is a non-static method, it cannot be directly called from the main method, which is static.

Problem:
You need an instance of the class Functions to call the non-static method printMyName.

Solution:
You can either make printMyName static, or
Create an instance of the Functions class to call the non-static method.
     */
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        printMyName obj=new printMyName("Swapneel");
        printMyName.display();

    }
}