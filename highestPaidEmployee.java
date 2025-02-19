import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class highestPaidEmployee {
      public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 60000),
            new Employee("Bob", 75000),
            new Employee("Charlie", 55000),
            new Employee("Diana", 90000)
        );
        Optional<Employee> highestPaidEmployee = employees.stream()
            .max(Comparator.comparingDouble(Employee::getSalary));
        highestPaidEmployee.ifPresent(employee -> 
            System.out.println("Employee with highest salary: " + employee)
        );
    }
}
