import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise_08_Get_Folder_Size {
    public static void main(String[] args) throws IOException {
        String mainPath = "C:\\Users\\Petar\\Desktop\\Java Practice\\SoftUni- Practice\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";         
        String outputPath = "C:\\Users\\Petar\\Desktop\\Java Practice\\SoftUni- Practice\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\08.GetFolderSize.txt";  
        File folder = new File(mainPath);

        File[] allFilesInFolder = folder.listFiles();  
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));
        int folderSize = 0;

        if (allFilesInFolder != null) {
            for (File file : allFilesInFolder) {
                folderSize += file.length();
            }
        }

//       
        writer.write("Folder size: " + folderSize);
        writer.close();




    }
}
