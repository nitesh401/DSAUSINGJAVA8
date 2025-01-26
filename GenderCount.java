import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class GenderCount {

    public static void main(String[] args) {
        List<Employees> employees = Arrays.asList(
            new Employees(1, "John Doe", 30, "Male", 50000),
            new Employees(2, "Jane Smith", 25, "Female", 20000),
            new Employees(3, "Mike Johnson", 40, "Male", 70000),
            new Employees(4, "Emily Davis", 35, "Female", 30000),
            new Employees(5, "Robert Brown", 50, "Male", 90000)
        );

        // Group by gender and count
        Map<String, Long> genderCount = employees.stream()
            .collect(groupingBy(Employees::getGender, counting()));

        // Group by gender and calculate average salary
        Map<String, Double> averageSalary = employees.stream()
            .collect(groupingBy(Employees::getGender, averagingDouble(Employees::getSalary)));

        // Print results
        System.out.println("Gender Count: " + genderCount);
        System.out.println("Average Salary: " + averageSalary);
    }
}

class Employees {
    private int id;
    private String name;
    private int age;
    private String gender;
    private double salary;

    public Employees(int id, String name, int age, String gender, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Employee{id=%d, name='%s', age=%d, gender='%s', salary=%.2f}", 
                              id, name, age, gender, salary);
    }
}
