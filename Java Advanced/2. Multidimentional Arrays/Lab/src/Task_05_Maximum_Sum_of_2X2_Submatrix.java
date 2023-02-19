import java.util.Scanner;

public class Task_05_Maximum_Sum_of_2X2_Submatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] columData = scan.nextLine().split(", ");
                                                                         //обхождам входните данни и попълвам многомерния масив
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(columData[col]);

            }
        }
        int maxSumTopLeftRow = -1;          // when we know the top left row and top left colum, we can find the other 3 elements easyly
        int maxSumTopLeftCol = -1;

        int maxSum = 0;
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {      // length -1 because we want to stop before the last element as we need 2 by 2 table and no exception
                int currentSum = matrix[row][col] + matrix[row][col + 1]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1];

                if (currentSum > maxSum) {
                    maxSum = currentSum;

                    maxSumTopLeftRow = row;
                    maxSumTopLeftCol = col;
                }
            }
        }

        System.out.println(matrix[maxSumTopLeftRow][maxSumTopLeftCol] + " " + matrix[maxSumTopLeftRow][maxSumTopLeftCol + 1]);
        System.out.println(matrix[maxSumTopLeftRow + 1][maxSumTopLeftCol] + " " + matrix[maxSumTopLeftRow + 1][maxSumTopLeftCol + 1]);
        System.out.println(maxSum);
    }

    }

