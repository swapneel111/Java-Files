class MathOperations {
    // Overloaded method with two int parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three int parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println("Sum of two integers: " + math.add(2,3));          // Calls add(int, int)
        System.out.println("Sum of three integers: " + math.add(2, 3, 4));      // Calls add(int, int, int)
        System.out.println("Sum of two doubles: " + math.add(2.5, 3.5));        // Calls add(double, double)
    }
}