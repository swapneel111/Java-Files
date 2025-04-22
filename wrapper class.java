import java.util.Scanner;

class IntWrapper {
    int value;
    IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    public static void swap(IntWrapper a, IntWrapper b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntWrapper a = new IntWrapper(sc.nextInt());
        IntWrapper b = new IntWrapper(sc.nextInt());
        
        swap(a, b);
        
        System.out.println("The swapped numbers are: " + a.value + " and " + b.value);
        sc.close();
    }
}
