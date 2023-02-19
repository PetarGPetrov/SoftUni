import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task_03_Voina_Number_Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<Integer> deckOne = new LinkedHashSet<>();
        Set<Integer> deckTwo = new LinkedHashSet<>();

        String[] inputOne = scan.nextLine().split(" ");
        for(int i = 0; i < inputOne.length; i++){
            int currentNum = Integer.parseInt(inputOne[i]);
            deckOne.add(currentNum);

        }

        String[] inputTwo = scan.nextLine().split(" ");
        for(int i = 0; i < inputTwo.length; i++){
            int currentNum = Integer.parseInt(inputTwo[i]);  
            deckTwo.add(currentNum);

        }



        for (int step = 0; step < 50; step++) {
            if (deckOne.isEmpty()) {
                break;
            } else if (deckTwo.isEmpty()) {
                break;
            }
            Integer fighterOne = deckOne.iterator().next();       
            Integer fighterTwo = deckTwo.iterator().next();

            deckOne.remove(fighterOne);
            deckTwo.remove(fighterTwo);                               

            if(fighterOne > fighterTwo){
                deckOne.add(fighterOne);
                deckOne.add(fighterTwo);

            }else{ // <=
                deckTwo.add(fighterOne);
                deckTwo.add(fighterTwo);

            }

            //step++;
        }
        if(deckOne.size() < deckTwo.size()){
            System.out.println("Second player win!");
        }else if(deckTwo.size() < deckOne.size()){
            System.out.println("First player win!");
        }else {
            System.out.println("Draw!");
        }
    }
}
