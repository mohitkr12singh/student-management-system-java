import java.io.*;
import java.util.ArrayList;

class FileHandler {

    static final String FILE_NAME = "students.dat";

    // Save students to file
    static void saveStudents(ArrayList<Student> students) {

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream(FILE_NAME));

            oos.writeObject(students);

            oos.close();

            System.out.println("Data Saved Successfully!");

        } catch (Exception e) {

            System.out.println("Error Saving Data.");
        }
    }

    // Load students from file
    static ArrayList<Student> loadStudents() {

        ArrayList<Student> students = new ArrayList<>();

        try {

            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream(FILE_NAME));

            students = (ArrayList<Student>) ois.readObject();

            ois.close();

            System.out.println("Data Loaded Successfully!");

        } catch (Exception e) {

            System.out.println("No Previous Data Found.");
        }

        return students;
    }
}