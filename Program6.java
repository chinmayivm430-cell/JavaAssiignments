
class University {
    private String universityName;

    University(String universityName) {
        this.universityName = universityName;
    }

    void displayUniversity() {
        System.out.println("University: " + universityName);
    }

    static class Department {
        private String departmentName;

        Department(String departmentName) {
            this.departmentName = departmentName;
        }

        void display() {
            System.out.println("Department: " + departmentName);
        }
    }

    class Faculty {
        private String facultyName;
        private String designation;

        Faculty(String facultyName, String designation) {
            this.facultyName = facultyName;
            this.designation = designation;
        }

        void display() {
            System.out.println("Faculty: " + facultyName);
            System.out.println("Designation: " + designation);
        }
    }
}

public class Program6 {
    public static void main(String[] args) {
        University.Department dept =
                new University.Department("Computer Science");

        University university = new University("ABC University");

        University.Faculty faculty =
                university.new Faculty("Dr. Kumar", "Professor");

        university.displayUniversity();
        dept.display();
        faculty.display();
    }
}