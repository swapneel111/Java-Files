package reflectionAPI;

public class Emp {
    private int id;
    private String name;
    private double salary;
    private int age;

    public Emp(int id, String name, double salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
