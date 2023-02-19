import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercise_04_Count_Character_Type {
    public static void main(String[] args) throws IOException {

        String mainPath = "C:\\Users\\Petar\\Desktop\\Java Practice\\SoftUni- Practice\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";         // this is the path to the main folder
        String inputPath = mainPath + "\\input.txt"; 
        String outputPath = mainPath + "\\04.CountCharacterType.txt";  

        BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));
        int vowels = 0;
        int otherSymbols = 0;
        int punctuation = 0;
        byte[] allBytes = Files.readAllBytes(Path.of(inputPath));

        for (byte inputByte : allBytes) {
            if (inputByte == 97 || inputByte == 101 || inputByte == 105 || inputByte == 111 || inputByte == 117) { 
                vowels++;
            }else if (inputByte == 44){  
                punctuation ++;
            }else if (inputByte != 13 && inputByte != 10 && inputByte != 96 && inputByte != 32 ){
                otherSymbols++;
            }

        }
        writer.write("Vowels: " + vowels);
        writer.newLine();
        writer.write("Other symbols: " + otherSymbols);
        writer.newLine();
        writer.write("Punctuation: " + punctuation);
        writer.newLine();

        writer.close();

    }
}
