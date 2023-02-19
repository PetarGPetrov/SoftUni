import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task_03_Copy_Bytes {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String mainPath = "C:\\Users\\Petar\\Desktop\\Java Practice\\SoftUni- Practice\\04. Java-Advanced-Files-and-Streams-Lab-Resources";         // this is the path to the main folder
        String inputPath = mainPath + "\\input.txt";  
        String outputPath = mainPath + "\\03.CopyBytesOutput.txt"; 

        List<Character> punctuation = Arrays.asList(',', '.', '!', '?'); 
        

        try (InputStream inputStream = new FileInputStream(inputPath)) { 
            OutputStream outputStream = new FileOutputStream(outputPath); 
            int oneByte = inputStream.read();      
            while (oneByte >= 0) {

                if (oneByte == 10 || oneByte == 32) {
                    outputStream.write(oneByte);    
                } else {  // if it is not
                    String number = String.valueOf(oneByte);     
                    for (int i = 0; i < number.length(); i++) {
                        outputStream.write(number.charAt(i));  
                    }
                }
                oneByte = inputStream.read(); 
            }


        } catch (IOException e) {
            throw new RuntimeException(e);   


        }
    }
}
