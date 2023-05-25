package main.staticDemo;

import static main.staticDemo.Student.changeSchoolName;

public class Student {
    static String schoolName = "BHASHYAM HIGH SCHOOL";
    String studName;
    int roll;

    public Student(String studName, int roll) {
        this.studName = studName;
        this.roll = roll;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return this.studName + " " + this.roll + " " + schoolName;
    }

    public void changeUtil(String newSchoolName) {
        changeSchoolName(newSchoolName);
    }

    public static void changeSchoolName(String newSchoolName) {
        schoolName = newSchoolName;
    }

}
