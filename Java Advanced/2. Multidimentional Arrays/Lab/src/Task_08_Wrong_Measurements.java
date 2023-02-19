import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task_08_Wrong_Measurements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[rows][];

        for (int i = 0; i < rows; i++) {
            matrix[i] = arrayReader(scan);
        }


        List<int[]> valueForReplacement = new ArrayList<>();
        int[] indexForInvalidNumber = arrayReader(scan);

        int invalidNumber = matrix[indexForInvalidNumber[0]][indexForInvalidNumber[1]];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == invalidNumber) {
                    int correctValue = getSum(matrix, i, j, invalidNumber);
                    valueForReplacement.add(new int[]{i, j, correctValue});
                }
            }
        }
        for (int[] entry : valueForReplacement) {
            matrix[entry[0]][entry[1]] = entry[2];
        }


        for (int[] x : matrix) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    private static int getSum(int[][] matrix, int row, int cols, int invalidNumber) {
        int total = 0;

        if (ifIndexValid(row - 1, matrix.length)) {
            if (matrix[row - 1][cols] != invalidNumber) {
                total += matrix[row - 1][cols];
            }
        }
        if (ifIndexValid(row + 1, matrix.length)) {
            if (matrix[row + 1][cols] != invalidNumber) {
                total += matrix[row + 1][cols];
            }
        }
        if (ifIndexValid(cols - 1, matrix[row].length)) {
            if (matrix[row][cols - 1] != invalidNumber) {
                total += matrix[row][cols - 1];
            }
        }
        if (ifIndexValid(cols + 1, matrix[row].length)) {
            if (matrix[row][cols + 1] != invalidNumber) {
                total += matrix[row][cols + 1];
            }
        }
        return total;

    }

    private static boolean ifIndexValid(int index, int length) {
        return (index >= 0 && index < length);
    }

    private static int[] arrayReader(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
