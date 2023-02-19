package ExamTask3_SoftUniStudents;

import java.util.ArrayList;
import java.util.List;


public class SoftUni {
    private int capacity;

    List<Student> data;
   
    public SoftUni(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public int getCapacity() {   
        return capacity;
    }

    public int getCount(){ 
        return this.data.size();
    }

    public String insert(Student student){ 





       
        if (getCount() + 1 > this.capacity){  
            return "The hall is full.";
        }else {  
            if (this.data.contains(student)){
                return "Student is already in the hall.";
            }else {
                this.data.add(student); 
                return String.format("Added student %s %s", student.getFirstName(), student.getLastName());

        }

        }
    }

    public String remove(Student student){ 
        
            if(this.data.contains(student)){
                data.remove(student);
                return String.format("Student %s %s.", student.getFirstName(), student.getLastName());

            }else{
                return "Student not found.";
            }
    }

    public Student getStudent(String firstName, String lastName){ 
        for (Student studentEba4 : this.data){ 
            if (studentEba4.getFirstName().equals(firstName) && studentEba4.getLastName().equals(lastName)){
                return studentEba4;
            }
        }
        return null;
    }

    public String statistics(){
        StringBuilder sb = new StringBuilder();
        sb.append("Hall size: ").append(getCount()).append(System.lineSeparator()); 
        this.data.forEach(student -> sb.append(student.toString()).append(System.lineSeparator()));
        return sb.toString(); 
    }
}
