
class Person {
    String name;
    int age;

    Person(String name, int age) {
        System.out.println("Person constructor");
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int employeeId;
    double basicSalary;

    Employee(String name, int age, int employeeId, double basicSalary) {
        super(name, age);
        System.out.println("Employee constructor");
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }
}

class Manager extends Employee {
    String department;
    double bonus;

    Manager(String name, int age, int employeeId, double basicSalary,
            String department, double bonus) {
        super(name, age, employeeId, basicSalary);
        System.out.println("Manager constructor");
        this.department = department;
        this.bonus = bonus;
    }

    double calculateTotalSalary() {
        return basicSalary + bonus;
    }

    void displayManager() {
        display();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}

public class Program10 {
    public static void main(String[] args) {
        Manager manager = new Manager(
                "Arun", 40, 101, 60000,
                "IT", 15000
        );

        System.out.println();
        manager.displayManager();
    }
}