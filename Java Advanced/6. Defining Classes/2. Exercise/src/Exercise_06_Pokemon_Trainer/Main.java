package PokemonTrainer;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Map<String, List<Pokemon>> trainersesPokemons = new LinkedHashMap<>();

        while (!input.equals("Tournament")) {
            String[] data = input.split("\\s+");
                     
            Pokemon pokemon = new Pokemon(data[1], data[2], Integer.parseInt(data[3]));
            trainersesPokemons.putIfAbsent(data[0], new ArrayList<>());
            trainersesPokemons.get(data[0]).add(pokemon);

            input = scan.nextLine();
        }
        List<Trainer> trainers = trainersesPokemons.entrySet()
                .stream()
                .map(t -> new Trainer(t.getKey(), t.getValue()))
                .collect(Collectors.toList());


        String command = scan.nextLine();
        while (!command.equals("End")) {


            for (Trainer trainer : trainers) {
                trainer.commandExecuting(command);
            }
            command = scan.nextLine();
        }

        trainers.stream()
                .sorted(Comparator.comparingInt(Trainer::getNumberOfBadges).reversed())
                .forEach(System.out::println);
    }
}
