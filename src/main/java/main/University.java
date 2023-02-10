package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class University {

    private static ArrayList<Student> studentList = new ArrayList<>();
    private static String FILENAME = "text.txt";


    public University() {
        ArrayList<Student> studentList = new ArrayList<>();
    }

    public static void addStudent(Student s) {
        studentList.add(s);
    }

    public static void listStudents() {
        int i = 0;
        System.out.println("Opiskelijat:");
        for (Student s : studentList) {
            System.out.println(studentList.get(i).studentNumber + ": " + studentList.get(i).studentName);
            i++;
        }
    }

    public static void pickStudent() {
        int j = 0;
        for (Student s : studentList) {
            System.out.println(j + ": " + studentList.get(j).studentName);
            j++;
        }
    }

    public static Student getStudent(int pick){
        return studentList.get(pick);
    }

    public static void saveStudents () {
            try {
                ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(FILENAME));
                for (Student s : studentList) {
                    writer.writeObject(s);
                }
                writer.close();
            } catch (IOException e) {
                System.out.println("Virhe kirjoitettaessa tiedostoa");
                e.printStackTrace();
            }
        }  

    public static void loadStudents () throws IOException {
        try {
            ObjectInputStream reader = new ObjectInputStream(new FileInputStream(FILENAME));
            Student student = (Student) reader.readObject();
            studentList.add(student);
            reader.close();
        } catch (FileNotFoundException | ClassNotFoundException e) {
            System.out.println("Virhe luettaessa tiedostoa");
            e.printStackTrace();
        } 
    }

}