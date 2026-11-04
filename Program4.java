class Result {
    private String name;
    private int total;
    private double average;

    Result(String name, int total, double average) {
        this.name = name;
        this.total = total;
        this.average = average;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}

class Student {
    private String usn;
    private String name;
    private int[] marks;

    static int studentCount = 0;
    final int MAX_MARKS = 100;

    Student(String usn, String name, int m1, int m2, int m3) {
        this.usn = usn;
        this.name = name;
        marks = new int[3];

        setMarks(0, m1);
        setMarks(1, m2);
        setMarks(2, m3);

        studentCount++;
    }

    public void setMarks(int index, int mark) {
        if (mark >= 0 && mark <= MAX_MARKS)
            marks[index] = mark;
        else
            System.out.println("Invalid marks!");
    }

    int getTotal() {
        return marks[0] + marks[1] + marks[2];
    }

    double getAverage() {
        return getTotal() / 3.0;
    }

    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
    }

    void display(boolean showResult) {
        display();
        if (showResult) {
            System.out.println("Total: " + getTotal());
            System.out.println("Average: " + getAverage());
        }
    }

    Result getResultSummary() {
        return new Result(name, getTotal(), getAverage());
    }
}

public class Program4 {
    public static void main(String[] args) {
        Student s = new Student("1AB23CS001", "Anu", 80, 90, 85);

        s.display(true);

        Result result = s.getResultSummary();
        System.out.println("\nResult Summary:");
        result.display();

        System.out.println("\nStudents created: " + Student.studentCount);
    }
}
