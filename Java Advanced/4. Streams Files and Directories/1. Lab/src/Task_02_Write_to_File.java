import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task_02_Write_to_File {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String mainPath = "C:\\Users\\Petar\\Desktop\\Java Practice\\SoftUni- Practice\\04. Java-Advanced-Files-and-Streams-Lab-Resources";         
        String inputPath = mainPath + "\\input.txt";  
        String outputPath = mainPath + "\\02.WriteToFileOutput.txt";  

        List<Character> punctuation = Arrays.asList(',', '.', '!', '?');  

        OutputStream outputStream = new FileOutputStream(outputPath); 

        try (InputStream inputStream = new FileInputStream(inputPath)) { 
            int readByte = inputStream.read();
            while (readByte >= 0) {           

                if (!punctuation.contains((char)readByte)) { 
                    outputStream.write(readByte);
                }

                readByte = inputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        outputStream.close();  
    }
}
