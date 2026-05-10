import java.util.ArrayList;

class StudentService {

    ArrayList<Student> students;

    StudentService() {

        students = FileHandler.loadStudents();
    }

    // Add Student
    void addStudent(Student student) {

        students.add(student);

        System.out.println("Student Added Successfully!");
    }

    // Display Students
    void displayStudents() {

        if (students.isEmpty()) {

            System.out.println("No students found.");

        } else {

            for (Student s : students) {
                s.displayStudent();
            }
        }
    }

    // Search Student
    void searchStudent(int id) {

        boolean found = false;

        for (Student s : students) {

            if (s.id == id) {

                s.displayStudent();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found.");
        }
    }

    // Update Student
    void updateStudent(int id, String name, double marks) {

        boolean updated = false;

        for (Student s : students) {

            if (s.id == id) {

                s.name = name;
                s.marks = marks;

                updated = true;

                System.out.println("Student Updated Successfully!");

                break;
            }
        }

        if (!updated) {
            System.out.println("Student Not Found.");
        }
    }

    // Delete Student
    void deleteStudent(int id) {

        boolean deleted = false;

        for (Student s : students) {

            if (s.id == id) {

                students.remove(s);

                deleted = true;

                System.out.println("Student Deleted Successfully!");

                break;
            }
        }

        if (!deleted) {
            System.out.println("Student Not Found.");
        }
    }

    // Save Data
    void saveData() {

        FileHandler.saveStudents(students);
    }
}