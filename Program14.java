
class Person {
    private String name;
    private int age;

    static int count = 0;
    static final String COLLEGE_NAME = "ABC College";

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Overloaded method
    void displayDetails(String message) {
        System.out.println(message);
        displayDetails();
    }
}

class Student extends Person {
    private String usn;

    Student(String name, int age, String usn) {
        super(name, age);
        this.usn = usn;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("USN: " + usn);
        System.out.println("Type: Student");
    }
}

class Faculty extends Person {
    private String department;

    Faculty(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
        System.out.println("Type: Faculty");
    }
}

class Administrator extends Person {
    private String role;

    Administrator(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: " + role);
        System.out.println("Type: Administrator");
    }
}

class College {

    static class Department {
        private String name;

        Department(String name) {
            this.name = name;
        }

        void display() {
            System.out.println("Department: " + name);
        }
    }
}

public class Program14 {
    public static void main(String[] args) {

        Person[] people = {
                new Student("Anu", 20, "1AB23CS001"),
                new Faculty("Dr. Rao", 45, "Computer Science"),
                new Administrator("Kiran", 35, "Office Manager")
        };

        System.out.println(Person.COLLEGE_NAME);
        System.out.println();

        for (Person p : people) {
            p.displayDetails();
            System.out.println();
        }

        College.Department dept =
                new College.Department("Computer Science");
        dept.display();

        System.out.println("\nTotal people created: " + Person.count);
    }
}