package ExamTask3_SoftUniStudents;

public class Student {

    private String firstName;

    private String lastName;

    private String bestCourse;

    //конструктор който приема тези 3 параметра
    //демек като кажа в мейн метода стринг студент прима 1 2 3 от някой масив това тря да са 1во име 2ро име и най добър курс
    public Student(String firstName, String lastName, String bestCourse) {
        //това за момента е празен обект.
        this.firstName = firstName;
        this.lastName = lastName;
        this.bestCourse = bestCourse;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getBestCourse() {
        return bestCourse;
    }

    public void setBestCourse(String bestCourse) {
        this.bestCourse = bestCourse;
    }

    @Override
    public String toString() {    // искаме да връща "Student: {firstName} {lastName}, Best Course = {BestCourse}"
         return String.format("Student: %s %s, Best Course = %s", getFirstName(), getLastName(), getBestCourse());
    }
}
