import java.util.ArrayList;

class Main {

    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<Student> students = new ArrayList<>();

        // Creating Student Objects
        Student s1 = new Student(101, "Mohit", 85.5);
        Student s2 = new Student(102, "Rahul", 90.0);

        // Adding students to ArrayList
        students.add(s1);
        students.add(s2);

        // Displaying all students
        for (Student student : students) {
            student.displayStudent();
        }
    }
}