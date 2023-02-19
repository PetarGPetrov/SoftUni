import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task_06_Print_Diagonals_of_Square_Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        int size = Integer.parseInt(scan.nextLine());

        int[][] matrix = new int[size][];

        for(int row = 0; row < size; row++){
            String[] columData =  scan.nextLine().split(" ");


//            int[] currentRow = new int[size];
//                   for(int col = 0; col < columData.length; col++){
//                       currentRow[col] = Integer.parseInt(columData[col]);
//
//                   }
                                                                                                            // instead of adding it 1 by one. I created a new array for the whole row and add it to the matrix
            int[] currentRow = Arrays.stream(columData).mapToInt(elem -> Integer.parseInt(elem)).toArray(); // this should do the same as everything from 19 to 23 line
                                                                 //Integer::ParseInt is short for the one in brackets

            matrix[row] = currentRow;
        }

//        Top left to bottom right
//        for (int row = 0; row < matrix.length; row++) {
//            for (int col = 0; col < matrix[row].length; col++) {
//                if (row == col) {
//                    System.out.print(matrix[row][col] + " ");
//                }
//            }
//        }



        for(int i = 0; i <  matrix.length; i++){
            System.out.print(matrix[i][i] + " ");                // this is the same as the one above!
        }
        System.out.println();
        for(int row = size - 1, col = 0; col < size; row--, col++){
            System.out.print(matrix[row][col] + " ");
        }

    }
}
