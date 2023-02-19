import java.util.Scanner;

public class Task_04_Sum_Matrix_Elements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] parts = scan.nextLine().split(", ");
                                                                  //обхождам входните данни и попълвам многомерния масив
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(parts[col]);

            }
        }
        int sum = 0;


//        for(int row = 0; row < matrix.length; row++){
//            for(int col = 0; col < matrix[row].length; col++){      for example!!!!
//                sum += matrix[row][col];
//
//            }
//
//        }



        for (int[] row : matrix) {              // using for each cuz I can
            for (int cell : row) {
                sum += cell;
            }
            
        }



        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);

    }
}
