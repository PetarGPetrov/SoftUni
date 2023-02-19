import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise_04_Applied_Arithmetic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());  // we take the first row(in this case the only row), split by "\\s+" and we parse it to int as when it is list it is from strings

        //add -> добавяме 1 към всеки елемент на списъка: приема списък -> връщаме списък с модифицирани елементи
        Function<List<Integer>, List<Integer>> addCommand = list -> list.stream().map(number -> number += 1).collect(Collectors.toList());
        // Function of List of Integers that returns list of Integerds.. we take the list,streamit,map the number to number +1 and collect it back to list

        //multiply -> умножаваме всеки един от елементите по 2: приема списък -> връщаме списък с модифицирани елементи
        Function<List<Integer>, List<Integer>> multiplyCommand = list -> list.stream().map(number -> number *= 2).collect(Collectors.toList());
        // multiply is same but multiplyes by one

        //subtract -> изважда 1 от всеки елемент на списъка: приема списък -> връщаме списък с модифицирани елементи
        Function<List<Integer>, List<Integer>> subtractCommand = list -> list.stream().map(number -> number -= 1).collect(Collectors.toList());
        // subtract again is same but divide 1 of each elem

        //print -> принтира всички елементи на нов ред: приема списък -> печатаме всеки елемент
        Consumer<List<Integer>> printCommand = list -> list.forEach(number -> System.out.print(number + " "));
        // as we want noting back, consumer is void and the consumer just prints

        String command = scan.nextLine();

        while (!command.equalsIgnoreCase("end")){
            switch (command){
                case"add":
                    numbers = addCommand.apply(numbers);
                    break;
                case"multiply":
                    numbers = multiplyCommand.apply(numbers);
                    break;

                case"subtract":
                    numbers = subtractCommand.apply(numbers);
                    break;
                case "print":
                    printCommand.accept(numbers);
                    System.out.println();
                    break;
            }
            command = scan.nextLine();
        }
    }
}
