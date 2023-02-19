import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise_01_Unique_Usernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        Set<String> userNames = new LinkedHashSet<>();

        for(int i = 0; i < input; i++){
            String names = scan.nextLine();

            userNames.add(names);


        }
            
        userNames.forEach(name -> System.out.println(name));
        }
    }

