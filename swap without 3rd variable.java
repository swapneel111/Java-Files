import java.util.Scanner;

public class Main {
    public static int[] swap(int a, int b) {
        a = a + b;  // Step 1: a becomes the sum of a and b
        b = a - b;  // Step 2: b becomes the original value of a
        a = a - b;
        return new int[] {a,b};  // Step 3: a becomes the original value of b
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int[] swapped=swap(a, b);
        a=swapped[0];
        b=swapped[1];
        
        System.out.println("The swapped numbers are: " + a + " and " + b);
        sc.close();
    }
}