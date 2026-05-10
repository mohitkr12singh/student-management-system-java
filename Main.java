import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService service = new StudentService();

        int choice;

        do {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Save Data");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    service.addStudent(new Student(id, name, marks));

                    break;

                case 2:

                    service.displayStudents();

                    break;

                case 3:

                    System.out.print("Enter Student ID: ");
                    int searchId = sc.nextInt();

                    service.searchStudent(searchId);

                    break;

                case 4:

                    System.out.print("Enter Student ID: ");
                    int updateId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Marks: ");
                    double newMarks = sc.nextDouble();

                    service.updateStudent(updateId, newName, newMarks);

                    break;

                case 5:

                    System.out.print("Enter Student ID: ");
                    int deleteId = sc.nextInt();

                    service.deleteStudent(deleteId);

                    break;

                case 6:

                    service.saveData();

                    break;

                case 7:

                    service.saveData();

                    System.out.println("Exiting Program...");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}