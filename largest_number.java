import java.util.*;

public class largest_number {

    public static int largestnum(int num[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;

    }

    public static int smallestnum(int num[]) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
        // Scanner sc =System.
        // System.out.println("Welcome to my practice session");
        // Scanner sc= new Scanner(System.in);

        // int a=sc.nextInt();

        int num[] = { 12, 65, 89, 234, 674, 323, 1000, 1, 6789, -789 };

        System.out.println("Largest Number of Array is = " + largestnum(num));
        System.out.println("Smallest Number of Array is = " + smallestnum(num));
    }
}
