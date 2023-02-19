import com.sun.source.tree.WhileLoopTree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Exercise_07_Merge_Two_Files {
    public static void main(String[] args) throws IOException {

        String mainPath = "C:\\Users\\Petar\\Desktop\\Java Practice\\SoftUni- Practice\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";         // this is the path to the main folder
        String inputPath = mainPath + "\\inputOne.txt";  
        String inputPath2 = mainPath + "\\inputTwo.txt";
        String outputPath = mainPath + "\\07.MergeTwoFiles.txt"; 


        List<String> input1 = Files.readAllLines(Path.of(inputPath));
        List<String> input2 = Files.readAllLines(Path.of(inputPath2));

        BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));

        for (String line : input1){
            writer.write(line);
            writer.newLine();
        }

        for (String line : input2){
            writer.write(line);
            writer.newLine();
        }
        writer.close();

    }
}
