
import java.util.Scanner;
public class createMatrix {
    static Scanner scan = new Scanner(System.in);  // create a Scanner "object"

    public static int[][] generateMatrix(int x) {
        int[][] matrix = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int p = 0; p < x; p++) {
                int k = (int) (Math.random() + 0.5);
                matrix[i][p] = k;
                matrix[p][i] = k;

                if (i == p) {
                    matrix[i][p] = 0;
                }
            }
        }


        return matrix;
    }

    public static int[][] inputtedMatrix(int x) {
        int[][] matrix = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int p = i; p < x; p++) {
                if (i != p) {
                    System.out.println("input a value for the " + (i + 1) + " row and " + (p + 1) + " column, answer should be 1 or 0");
                    int k = scan.nextInt();
                    matrix[i][p] = k;
                    matrix[p][i] = k;
                } else {

                    matrix[i][p] = 0;
                }
            }
        }


        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}