import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student Marks: ");
                    double marks = sc.nextDouble();

                    Student student = new Student(id, name, marks);

                    students.add(student);

                    System.out.println("Student Added Successfully!");

                    break;

                case 2:

                    if (students.isEmpty()) {

                        System.out.println("No students found.");

                    } else {

                        for (Student s : students) {
                            s.displayStudent();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Student ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Student s : students) {

                        if (s.id == searchId) {

                            System.out.println("Student Found:");
                            s.displayStudent();

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Student ID to Update: ");
                    int updateId = sc.nextInt();

                    boolean updated = false;

                    for (Student s : students) {

                        if (s.id == updateId) {

                            sc.nextLine();

                            System.out.print("Enter New Name: ");
                            s.name = sc.nextLine();

                            System.out.print("Enter New Marks: ");
                            s.marks = sc.nextDouble();

                            System.out.println("Student Updated Successfully!");

                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Student Not Found.");
                    }

                    break;

                case 5:

                    System.out.print("Enter Student ID to Delete: ");
                    int deleteId = sc.nextInt();

                    boolean deleted = false;

                    for (Student s : students) {

                        if (s.id == deleteId) {

                            students.remove(s);

                            System.out.println("Student Deleted Successfully!");

                            deleted = true;
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Student Not Found.");
                    }

                    break;

                case 6:

                    System.out.println("Exiting Program...");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}