import java.io.Serializable;

class Student implements Serializable {

    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {

        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void displayStudent() {

        System.out.println("---------------------");
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
    }
}