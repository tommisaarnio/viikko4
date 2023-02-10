package main;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) throws IOException {
    boolean exit = false;
    Scanner sc = new Scanner(System.in);
    while (!exit) {
        System.out.println("1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma");
        int i = Integer.parseInt(sc.nextLine());
        switch (i) {
            case 1:
                System.out.println("Anna opiskelijan nimi?");
                String studentName = sc.nextLine();
                System.out.println("Anna opiskelijan opiskelijanumero:");
                String studentNumber = sc.nextLine();
                Student s = new Student(studentName, studentNumber);
                University.addStudent(s);
                break;
            case 2:
                University.listStudents();
                break;
            case 3:
                University.pickStudent();
                System.out.println("Mille opiskelijalle suorite lisätään?");
                int pick = Integer.parseInt(sc.nextLine());
                Student st = University.getStudent(pick);
                System.out.println("Mille kurssille suorite lisätään?");
                String course = sc.nextLine();
                System.out.println("Mikä arvosana kurssille lisätään?");
                int grade = Integer.parseInt(sc.nextLine());
                st.addGrade(course, grade);
                break;
            case 4:
                University.pickStudent();
                System.out.println("Minkä opiskelijan suoritteet listataan?");
                int list = Integer.parseInt(sc.nextLine());
                Student stu = University.getStudent(list);
                stu.listGrades();
                break;
            case 5:
                University.pickStudent();
                System.out.println("Minkä opiskelijan suoritteiden keskiarvo lasketaan?");
                int GPA = Integer.parseInt(sc.nextLine());
                Student stud = University.getStudent(GPA);
                Calculator.getAverageGrade(stud);
                break;
            case 6:
                University.pickStudent();
                System.out.println("Minkä opiskelijan suoritteiden mediaani lasketaan?");
                int med = Integer.parseInt(sc.nextLine());
                Student stude = University.getStudent(med);
                Calculator.getMedianGrade(stude);
                break;
            case 7:
                University.saveStudents();
                break;
            case 8:
                University.loadStudents();
                break;
            case 0:
                System.out.println("Kiitos ohjelman käytöstä.");
                sc.close();
                exit = true;
                break;
            default:
                System.out.println("Syöte oli väärä");
                break;
            }
        }
    }
}
