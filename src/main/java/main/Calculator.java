package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {
    
    public static double getAverageGrade(Student s) {
        ArrayList<Grade> gradeList = s.getGrades();
        double sum = 0;
        double n = 0;
        for (Grade g : gradeList) {           
            int grade = g.courseGrade;
            sum = sum + grade;
            n++;
        }
        double average;
        if (sum == 0) {
            average = 0.0;
        }
        else{
            average = (sum / n);
        }
        System.out.println("Keskiarvo on " + average);
        return average;
    }
    public static double getMedianGrade(Student s) {
        List<Integer> grades = new ArrayList<>();
        int number = 0;
        for (Grade g : s.getGrades()) {    
            grades.add(g.courseGrade);
            number++;
        }        
        Collections.sort(grades);

        double median;
        if (grades.size() == 0) {
            median = 0.0;
        }
        else {
            if (grades.size() % 2 == 0) {
            int grade1 = grades.get((grades.size() / 2) - 1);
            int grade2 = grades.get(grades.size() / 2);
            median = (double) ((grade1 + grade2) / 2.0);
            }
            else {
                median = (double) grades.get(grades.size() / 2);
            }
        }
        System.out.println("Mediaani on " + median);
        return median;
    }

}
