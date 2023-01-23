import group.Group;
import series.Series;
import student.Student;

public class Main {
    public static void main(String[] args) {
        Student student_1 = new Student(24,"Anna","Kim","kimanna@mail.com");
        Student student_2 = new Student(24,"Ben","Den","benden@mail.com");
        Student student_3 = new Student(24,"Aya","Atakanova","atakanova@mail.com");

       Group groups = new Group(new Student[]{student_1,student_2},"java ","05.12.22");
        Group groups1 = new Group(new Student[]{student_3,student_2},"java ","05.12.22");
        Series series = new Series("Peacksoft", 5, "Meder", new Group[]{groups,groups1});
        System.out.println(series);
    }
}