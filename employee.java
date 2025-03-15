// 1.	Collect all employee’s names in one list, who have salary >5000.

// 2.	Sort the list based on salary in desc order.

// 3.	Find employee’s name who has min salary.

// 4.	Find out all employee’s mobile numbers in a single List.

import java.util.*;
import java.util.stream.Collectors;

class employee {
    private int id;
    private String name;
    private String dept;
    private Double salary;
    private List<Long> mobileNums;
    public employee(int id, String name, String dept, Double salary, List<Long> mobileNums) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.mobileNums = mobileNums;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public Double getSalary() {
        return salary;
    }

    public List<Long> getMobileNums() {
        return mobileNums;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", mobileNums=" + mobileNums +
                '}';
    }
}

class EmployeeStreamOperations {
    public static void main(String[] args) {
        List<employee> empList = new ArrayList<>();

        empList.add(new employee(1, "Alice", "IT", 6000.0, Arrays.asList(9876543210L, 9876543211L)));
        empList.add(new employee(2, "Bob", "HR", 4000.0, Arrays.asList(9876543212L)));
        empList.add(new employee(3, "Charlie", "Finance", 7000.0, Arrays.asList(9876543213L, 9876543214L)));
        empList.add(new employee(4, "David", "IT", 5000.0, Arrays.asList(9876543215L)));
        empList.add(new employee(5, "Eve", "Admin", 3000.0, Arrays.asList(9876543216L, 9876543217L)));

        List<String> SalaryGreaterThan = empList.stream()
                .filter(emp -> emp.getSalary() > 5000)
                .map(employee::getName)
                .collect(Collectors.toList());

        System.out.println("Employees with salary > 5000: " + SalaryGreaterThan);

        List<employee> sortedBySalaryDesc = empList.stream()
                .sorted(Comparator.comparingDouble(employee::getSalary).reversed())
                .collect(Collectors.toList());

        System.out.println("Employees sorted by salary in descending order:");
        sortedBySalaryDesc.forEach(System.out::println);

        String minSalaryEmployee = empList.stream()
                .min(Comparator.comparingDouble(employee::getSalary))
                .map(employee::getName)
                .orElse("No employees");

        System.out.println("Employee with minimum salary: " + minSalaryEmployee);

        List<Long> allMobileNumbers = empList.stream()
                .flatMap(emp -> emp.getMobileNums().stream())
                .collect(Collectors.toList());

        System.out.println("All employee mobile numbers: " + allMobileNumbers);
    }
}
