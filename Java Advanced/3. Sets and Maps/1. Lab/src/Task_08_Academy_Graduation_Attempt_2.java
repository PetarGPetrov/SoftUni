import java.text.DecimalFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task_08_Academy_Graduation_Attempt_2 {           
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int studentCount = Integer.parseInt(scan.nextLine());

        Map<String, Double[]> gradesOfStudents = new TreeMap<>();

        for (int i = 0; i < studentCount; i++) {
            String names = scan.nextLine();
            String[] inputGrades = scan.nextLine().split(" ");
            Double[] totalGrades = new Double[inputGrades.length];

            for (int j = 0; j < inputGrades.length; j++) {
                totalGrades[j] = Double.parseDouble(inputGrades[j]);
            }

            gradesOfStudents.put(names, totalGrades);
        }

        DecimalFormat formating = new DecimalFormat("0.#######################");
        for (String studentName : gradesOfStudents.keySet()) {
            Double[] grades = gradesOfStudents.get(studentName);

            double sum = 0;
            for (Double grade : grades) {
                sum += grade;
            }

            System.out.printf("%s is graduated with %s%n", studentName, formating.format(sum / grades.length));
        }
    }
}

