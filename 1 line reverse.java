import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        
        StringBuilder sb = new StringBuilder(input).reverse(); ;
        //sb.reverse();  // Reverses the entire string

        System.out.println("The reversed sentence is: " + sb.toString());
        sc.close();
    }
}
