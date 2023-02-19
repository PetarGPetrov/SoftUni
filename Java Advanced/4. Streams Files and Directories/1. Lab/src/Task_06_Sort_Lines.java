import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_06_Sort_Lines {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String mainPath = "C:\\Users\\Petar\\Desktop\\Java Practice\\SoftUni- Practice\\04. Java-Advanced-Files-and-Streams-Lab-Resources";         
        String inputPath = mainPath + "\\input.txt";  
        String outputPath = mainPath + "\\06.SortLinesOutput"; 

        Path path = Paths.get(inputPath);  // we use path to get idk
        List<String> lines = Files.readAllLines(path).stream().sorted().toList(); 

        Path output = Paths.get(outputPath); 
        Files.write(output, lines);  
//
    }
}
