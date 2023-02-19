package ExamTask3_SoftUniStudents;

import java.util.ArrayList;
import java.util.List;
// next write java class SoftUni that has students (a collection which stores entity students). All entities inside the repository
// have the same fields. Also the soft uni class should have those 2 fields:
// capacity: int
//: data: List<Students>

public class SoftUni {
    private int capacity;// capacity: int

    List<Student> data;//: data: List<Students> и това поле ми е равно на null в момента
    //полета които са null на практика не съществуват
    //условието тук ни кара да направим конструктор само на capacity
    //ние слагаме под него data която да е равна на нов празен лист. празният лист е празен но не е null което ни позволява да го ползваме
    public SoftUni(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public int getCapacity() {   // условие getCapacity()
        return capacity;
    }

    public int getCount(){  // условие getCount() method returns the number of students, and we get them from the list
        return this.data.size();
    }

    public String insert(Student student){ // условие insert (Student student) method adds and entity to the data if hall for it
        // return Added Student {FirstName Last name }if student succesfully added






        // return The hall is full if the hall is full
        if (getCount() + 1 > this.capacity){ //get count е броят на студенти(ако той +1 е по голям от капацитета)
            return "The hall is full.";
        }else {  // return Student is already in the hall if student is already in the list
            if (this.data.contains(student)){
                return "Student is already in the hall.";
            }else {// return Added Student {FirstName Last name }if student succesfully added
                this.data.add(student); // добавяме си студента в списъка
                return String.format("Added student %s %s", student.getFirstName(), student.getLastName());

        }

        }
    }

    public String remove(Student student){ // условие remove (Student student) method - removes student
        // return Removed {firstName lastName} student if student is successfully removed
            if(this.data.contains(student)){
                data.remove(student);
                return String.format("Student %s %s.", student.getFirstName(), student.getLastName());

            }else{ // return stundent not found if the student not in the hall
                return "Student not found.";
            }
    }

    public Student getStudent(String firstName, String lastName){ // условие getStudent(String firstName, String lastName)method - returns the student with given names
        for (Student studentEba4 : this.data){ // за всеки един студент от нашият лист
            if (studentEba4.getFirstName().equals(firstName) && studentEba4.getLastName().equals(lastName)){
                return studentEba4;
            }
        }
        return null;
    }

    public String statistics(){// условие getStatistics() return a string in the following format
        StringBuilder sb = new StringBuilder();
        sb.append("Hall size: ").append(getCount()).append(System.lineSeparator());//1ви ред append aka добави текст hall size, взимаме размера с get count и слагаме сепаратор винаги
        this.data.forEach(student -> sb.append(student.toString()).append(System.lineSeparator())); // за всеки студент в списъка append-ваме данните на студента във формата toString който пренаписахме
        return sb.toString(); // взимаме всичко дето сме апенднали в билдъра форматирано в toString
    }
}
