import java.util.Scanner;

public class Task_02_Position_of {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputDimensions = scan.nextLine().split(" ");

        int rows = Integer.parseInt(inputDimensions[0]);
        int cols = Integer.parseInt(inputDimensions[1]);

        int[][] matrix = new int[rows][cols];


        for (int row = 0; row < rows; row++) {
            String[] parts = scan.nextLine().split(" ");
                                                                 //обхождам входните данни и попълвам многомерния масив
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(parts[col]);

            }
        }
        int toFind = Integer.parseInt(scan.nextLine());

        boolean isFound = false;
        for(int row = 0; row < matrix.length; row++){
            for(int cow = 0; cow < matrix[row].length; cow++){
                if(matrix[row][cow] == toFind){
                    isFound = true;
                    System.out.println(row + " " + cow);
                }

            }


        }
        if (!isFound){
            System.out.println("not found");
        }

    }
}
