import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Task_04_Extract_integers {
    public static void main(String[] args) throws FileNotFoundException {


        String mainPath = "C:\\Users\\Petar\\Desktop\\Java Practice\\SoftUni- Practice\\04. Java-Advanced-Files-and-Streams-Lab-Resources";        
        String inputPath = mainPath + "\\input.txt";  
        String outputPath = mainPath + "\\04.ExtractIntegersOutput.txt";  

        Scanner reader = new Scanner(new FileInputStream(inputPath)); 
        PrintStream writer = new PrintStream(new FileOutputStream(outputPath));
       

        while (reader.hasNext()) {   
            if (reader.hasNextInt()) {  
                writer.println(reader.nextInt());  
            }

            reader.next(); 
        }
    }
}
