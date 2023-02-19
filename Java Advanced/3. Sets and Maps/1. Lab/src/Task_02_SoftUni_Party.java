import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Task_02_SoftUni_Party {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        Set<String> guestList = new TreeSet<>();

        while (!input.equals("PARTY")){
            guestList.add(input);
            input = scan.nextLine();

        }

        while (!input.equals("END")){
            guestList.remove(input);
            input = scan.nextLine();
        }

        System.out.println(guestList.size());
        guestList.forEach(System.out::println);  





    }
}
