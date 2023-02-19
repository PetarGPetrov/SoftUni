import java.util.Scanner;

public class Task_03_Intersection_of_2_Matrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());

        char[][] matrixA = new char[rows][cols];
        char[][] matrixB = new char[rows][cols];                                     // two matrix of chars with assigned rows and cols coming from the input

        for (int row = 0; row < rows; row++) {
            String string = scan.nextLine().trim().replace(" ", ""); // fill matrixA while cutting " "
            matrixA[row] = string.toCharArray();
        }
        for (int row = 0; row < rows; row++) {
            String string = scan.nextLine().trim().replace(" ", ""); // fill matrixB while cutting " "
            matrixB[row] = string.toCharArray();
        }
        char[][] matrixLast = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrixA[row][col] == matrixB[row][col]) {
                    matrixLast[row][col] = matrixA[row][col];
                } else {
                    matrixLast[row][col] = '*';
                }
            }
        }
        for (char[] i : matrixLast) {
            for (char j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
