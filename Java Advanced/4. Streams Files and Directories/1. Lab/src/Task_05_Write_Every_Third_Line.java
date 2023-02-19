import java.io.*;
import java.util.Scanner;

public class Task_05_Write_Every_Third_Line {
    public static void main(String[] args) throws IOException {
        String mainPath = "C:\\Users\\Petar\\Desktop\\Java Practice\\SoftUni- Practice\\04. Java-Advanced-Files-and-Streams-Lab-Resources";         // this is the path to the main folder
        String inputPath = mainPath + "\\input.txt";  
        String outputPath = mainPath + "\\05.WriteEveryThirdLineOutput";  


        try (BufferedReader input = new BufferedReader(new FileReader(inputPath));
            PrintWriter output = new PrintWriter(new FileWriter(outputPath))){
            int lineCount = 1;  
            String read = input.readLine();

            while (read != null){  
                if (lineCount % 3 == 0){  
                    output.println(read);
                }
                read = input.readLine();  
            }

        }catch (IOException e) {
            throw new RuntimeException(e);
        }






    }
}
