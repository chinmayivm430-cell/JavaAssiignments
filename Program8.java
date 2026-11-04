class Employee {
    protected int id;
    protected String name;
    protected double basicSalary;

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

class PermanentEmployee extends Employee {
    private double allowance;
    private double bonus;

    PermanentEmployee(int id, String name, double basicSalary,
                      double allowance, double bonus) {
        super(id, name, basicSalary);
        this.allowance = allowance;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basicSalary + allowance + bonus;
    }
}

class ContractEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    ContractEmployee(int id, String name, int hoursWorked,
                     double hourlyRate) {
        super(id, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class Program8 {
    public static void main(String[] args) {
        Employee[] employees = {
                new PermanentEmployee(1, "Ravi", 30000, 5000, 3000),
                new ContractEmployee(2, "Priya", 160, 250)
        };

        for (Employee e : employees) {
            e.display();
            System.out.println("Salary: " + e.calculateSalary());
            System.out.println();
        }
    }
}