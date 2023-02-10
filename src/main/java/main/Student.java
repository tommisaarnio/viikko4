package main;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {

    String studentName;
    String studentNumber;
    private ArrayList<Grade> gradeList = new ArrayList<>();
    private static final long serialVersionUID = 82194509;


    public Student(String studentName, String studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        ArrayList<Grade> gradeList = new ArrayList<>();

    }


    public void addGrade(String course, int grade) {
        gradeList.add(new Grade(course, grade));
    }

    public void listGrades() {
        for (Grade g : gradeList) {
            System.out.println(g.courseName + ": " + g.courseGrade);
        }
    }

    public ArrayList<Grade> getGrades() {
        return gradeList;
    }
}