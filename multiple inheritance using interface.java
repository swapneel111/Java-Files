interface A {
    void show();  // Abstract method
}

interface B extends A {
    void show();
}

interface C extends A {
    void show();
}

class D implements B, C {  // Class D implements both interfaces
    @Override
    public void show() {
        System.out.println("Class D implementing show method");
    }
}

public class Main {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();  // Calls D's implementation of show()
    }
}

/*diamond problem
 * class A {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    void show() {
        System.out.println("Class B");
    }
}

class C extends A {
    void show() {
        System.out.println("Class C");
    }
}

class D extends B, C {  // This is not allowed in Java
    void show() {
        System.out.println("Class D");
    }
}

 */

 