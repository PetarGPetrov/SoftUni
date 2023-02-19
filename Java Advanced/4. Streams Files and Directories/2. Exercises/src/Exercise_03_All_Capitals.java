import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Exercise_03_All_Capitals {
    public static void main(String[] args) throws IOException {

        String mainPath = "C:\\Users\\Petar\\Desktop\\Java Practice\\SoftUni- Practice\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";         // this is the path to the main folder
        String inputPath = mainPath + "\\input.txt";  
        String outputPath = mainPath + "\\03.AllCapital!.txt";  

        List<String> allLines = Files.readAllLines(Path.of(inputPath));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath)); 
        for (String line : allLines){  
            writer.write(line.toUpperCase()); 
            writer.newLine();  

        }
            writer.close(); 
    }
}
