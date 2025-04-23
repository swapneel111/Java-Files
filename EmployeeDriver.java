package reflectionAPI;

import java.lang.reflect.Field;

public class EmployeeDriver {

    public static void main(String[] args) {
        try {
            Class<Emp> employeeClass = Emp.class;
            Field[] fields = employeeClass.getDeclaredFields();

            for (Field field : fields) {
                System.out.println(field.getName());
            }

            Emp employee = new Emp(1, "Rohit", 24000, 18);

            Field f = employeeClass.getDeclaredField("name");
            f.setAccessible(true);
            f.set(employee, "Ram");
            System.out.println(f.get(employee));
            f.setAccessible(false);
            System.out.println(employee.getName());

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
