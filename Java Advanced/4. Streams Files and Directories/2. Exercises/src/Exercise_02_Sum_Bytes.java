import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Exercise_02_Sum_Bytes {
    public static void main(String[] args) throws IOException {

        String mainPath = "C:\\Users\\Petar\\Desktop\\Java Practice\\SoftUni- Practice\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";         
        String inputPath = mainPath + "\\input.txt";  



       


        byte[] allBytes = Files.readAllBytes(Path.of(inputPath));
        long sum = 0;

        for (byte koraMi :allBytes) {
          if (koraMi != 13 && koraMi != 10){
              sum += koraMi;
          }

        }
        System.out.println(sum);

    }
}
