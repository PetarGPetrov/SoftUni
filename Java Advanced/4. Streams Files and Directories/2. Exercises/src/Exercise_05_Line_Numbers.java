import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Exercise_05_Line_Numbers {
    public static void main(String[] args) throws IOException {
        String mainPath = "C:\\Users\\Petar\\Desktop\\Java Practice\\SoftUni- Practice\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";      
        String inputPath = mainPath + "\\inputLineNumbers.txt";  
        String outputPath = mainPath + "\\05.LineNumbers.txt";  

        List<String> allLines = Files.readAllLines(Path.of(inputPath)); 

        BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));
        int lineCount = 1;

        for (String lines : allLines){
            writer.write(lineCount + ". " + lines);
            writer.newLine();
            lineCount++;
        }

        writer.close();
    }
}
