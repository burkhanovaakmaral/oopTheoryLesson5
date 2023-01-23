package student;

public class Student {
    private int birthday;
    private String name;
    private String surname;
    private String email;

    public Student(int birthday, String name, String surname, String email) {
        this.birthday = birthday;
        this.name = name;
        if (2023 - birthday > 0) {
            this.surname = surname;
        } else {
            System.out.println("Tuura emes jash");
        }
        this.email = email;
    }

    public Student() {

    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        if (2023 - birthday > 0) {
            this.birthday = birthday;
        } else {
            System.out.println("Tuura emes jash");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student" +
                "birthday=" + birthday +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\''
                ;
    }
}
