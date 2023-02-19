import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Exercise_01_Sum_Lines {
    public static void main(String[] args) throws IOException {
        String mainPath = "C:\\Users\\Petar\\Desktop\\Java Practice\\SoftUni- Practice\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";         
        String inputPath = mainPath + "\\input.txt";  



        List<String> allLines = Files.readAllLines(Path.of(inputPath)); 


        allLines.stream() 
                .map(line -> line.toCharArray()) 
                .forEach(arr -> {  
                    int sum = 0;
                    for (char symbol : arr) {  
                        sum+= (int)symbol;

                    }
                    System.out.println(sum);
                });



    }
}
