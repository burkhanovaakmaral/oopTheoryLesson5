package group;

import student.Student;

import java.util.Arrays;

public class Group {
    private Student[] students;
    private String learn;
    private String data;

    public Group(Student[] student, String learn, String data) {
        this.students = student;
        this.learn = learn;
        this.data = data;
    }

    public Group(){

    }

    public Student[] getStudent() {
        return students;
    }

    public void setStudent(Student[] student) {
        this.students = student;
    }

    public String getStudy() {
        return learn;
    }

    public void setStudy(String study) {
        this.learn = study;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Group " +
                "student " + Arrays.toString(students) +
                ", study " + learn + '\'' +
                ", data " + data
                ;
    }
}
