import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + ": " + salary;
    }
}

public class SecondHighestSalary {
    public static void main(String[] args) {
        
        List<Employee> employees = Arrays.asList(
            new Employee("rahul", 5000),
            new Employee("amit", 6000),
            new Employee("jay", 7000),
            new Employee("ajay", 6000),
            new Employee("aman", 8000)
        );
 
        Optional<Integer> secondHighestSalary = employees.stream()
            .map(Employee::getSalary) 
            .distinct()               
            .sorted(Comparator.reverseOrder()) 
            .skip(1)                  
            .findFirst();             

        // Print the result
        if (secondHighestSalary.isPresent()) {
            System.out.println("Second highest salary: " + secondHighestSalary.get());
        } else {
            System.out.println("Not enough data to find the second-highest salary.");
        }
        System.out.println("top three highest salary.");
        
        List<Employee> topPaidEmployee = employees.stream()

                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))

                .limit(3)

                .collect(Collectors.toList());


        topPaidEmployee.forEach(System.out::println);
    }
}
