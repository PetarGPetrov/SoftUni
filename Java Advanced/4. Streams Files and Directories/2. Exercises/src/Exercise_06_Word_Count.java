import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

import static jdk.internal.org.jline.utils.Colors.s;

public class Exercise_06_Word_Count {
    public static void main(String[] args) throws IOException {

      

        String mainPath = "C:\\Users\\Petar\\Desktop\\Java Practice\\SoftUni- Practice\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";         // this is the path to the main folder

        String inputPath2 = mainPath + "\\words.txt";





        List<String> words = Files.readAllLines(Path.of(inputPath2));  

        Map<String, Integer> wordCount = new HashMap<>(); 
        for(String line : words){  
            String[] wordsFromInput = line.split("\\s+");  
            Arrays.stream(wordsFromInput).forEach(word ->{wordCount.put(word, 0);});  
        }

        

        String inputPath = mainPath + "\\text.txt";  
        List<String> text = Files.readAllLines(Path.of(inputPath));

        for (String line : text){  
            String[] wordsOnCurrentLine = line.split("\\s+");  
            for (String word : wordsOnCurrentLine){ 
                if(wordCount.containsKey(word)){  
                    wordCount.put(word, wordCount.get(word)+1); 
                }
            }


        }
            
        String outputPath = mainPath + "\\06.WordCount.txt"; 
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));

        wordCount.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> {
                    try {
                        writer.write(entry.getKey() + " - " + entry.getValue());
                        writer.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        writer.close();
        }

    }

