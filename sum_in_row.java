import java.util.Scanner;

public class sum_in_row {

    // Display 2D Array
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

    public static int Sum_in_Row(int Array[][], int row) {
        int n = row;
        int m = Array[0].length;
        int sum = 0;

        for (int j = 0; j < m; j++) {
            sum += Array[row][j];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Array[][] = { { 1, 2, 3, 1 }, { 5, 6, 7, 1 }, { 9, -10, 11, 1 } };
        int Matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { -7, 8, 9 } };

        displayArr(Array);
        System.out.println(" ");

        displayArr(Matrix);
        System.out.println(" ");

        System.out.println("Enter the row no:  ");
        int row = sc.nextInt();

        System.out.println("Sum Of Row " + row + " = " + Sum_in_Row(Array, row));
        System.out.println("Sum Of Row " + row + " = " + Sum_in_Row(Matrix, row));

    }

}
