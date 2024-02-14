public class Diagonal_Sum {
// Dispaly Function
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
    // Fuction For Diagonal Sum
    public static int diagonal_Sum(int Array[][]) {
        int n = Array.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Array[i][i];
            if (i != Array.length - 1 - i) {
                sum += Array[i][Array.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int Array[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int Matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        displayArr(Array);
        System.out.println(" ");
        System.out.println("Diagonal Sum = " + diagonal_Sum(Array));
        System.out.println();

        displayArr(Matrix);
        System.out.println(" ");
        System.out.println("Diagonal Sum = " + diagonal_Sum(Matrix));
    }
}
