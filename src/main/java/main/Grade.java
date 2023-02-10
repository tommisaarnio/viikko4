package main;

import java.io.Serializable;

public class Grade implements Serializable {
    String courseName;
    int courseGrade;
    private static final long serialVersionUID = 578101921;


    public Grade(String courseName, int courseGrade) {
        this.courseName = courseName;
        this.courseGrade = courseGrade;
    }

}
