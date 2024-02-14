import java.util.Scanner;

public class Spiral_Matrix {
    // Normal Dispaly Function
    public static void displayArr(int Array[][]) {
        int n = Array.length;
        int m = Array[0].length;
        System.out.println("Input Array:  ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
  // Display Function in Spiral Format
    public static void displayMatrix(int Array[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = Array.length - 1;
        int endCol = Array[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top boundary
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(Array[startRow][j] + " ");
            }

            // right boundary
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(Array[i][endCol] + " ");
            }

            // bottom boundary
            for (int j = (endCol - 1); j >= startCol; j--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(Array[endRow][j] + " ");
            }

            // left boundary
            for (int i = (endRow - 1); i >= startRow + 1; i--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(Array[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;

        }
        System.out.println(" ");
        System.out.println("Array displayed in spiral form");
    }

    public static void main(String[] args) 
    {
        int Array[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int n = Array.length;
        int m = Array[0].length;

        displayArr(Array);
        System.out.println("Array displayed in normal form");
        System.out.println(" ");
        displayMatrix(Array);

    }
}
