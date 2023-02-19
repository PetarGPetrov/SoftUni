import java.util.*;

public class Task_07_Cities_By_Continent_Ando_Country {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfEntries = Integer.parseInt(scan.nextLine());

        Map<String, Map<String, List<String>>> continentCountriesCities = new LinkedHashMap<>();

        for(int i = 0; i < numberOfEntries; i++){
            String input = scan.nextLine();
            String continent = input.split("\\s+")[0];
            String countries = input.split("\\s+")[1];
            String cities = input.split("\\s+")[2];
            continentCountriesCities.putIfAbsent(continent, new LinkedHashMap<>());
            Map<String, List<String>> citiesOfCountry = continentCountriesCities.get(continent);
            citiesOfCountry.putIfAbsent(countries, new ArrayList<>());
            citiesOfCountry.get(countries).add(cities);

        }

        continentCountriesCities.entrySet().stream()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ":");
                    entry.getValue().entrySet().stream()
                            .forEach(country -> {
                                String output = String.join(", ", country.getValue());
                                System.out.println(" " + country.getKey() + " -> " + output); });
                });
    }
}
