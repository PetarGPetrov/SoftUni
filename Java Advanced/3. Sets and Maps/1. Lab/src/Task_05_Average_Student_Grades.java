import java.util.*;

public class Task_05_Average_Student_Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfStudents = Integer.parseInt(scan.nextLine());

        Map<String, List<Double>> names = new TreeMap<>();


        for (int i = 0; i < numOfStudents; i++) {
            String input = scan.nextLine();
            String name = input.split("\\s+")[0];
            double grade = Double.parseDouble(input.split("\\s+")[1]);
            names.putIfAbsent(name, new ArrayList<>());
            names.get(name).add(grade);
        }


        for (Map.Entry<String, List<Double>> entry : names.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            double sum = 0;
            for (Double grade : entry.getValue()) {
                System.out.printf("%.2f ", grade);
                sum += grade;

            }

            System.out.printf("(avg: %.2f)%n", sum / entry.getValue().size());
        }
    }
}