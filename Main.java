import java.util.*;

public class Main{
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        if (a==b){
            System.out.println("Adult");
        }else if(a<b){
            System.out.println("Not Adult");
        }else{      
            System.out.println("Undefined");
        }
    }
}