import java.util.Scanner;

public class Task_01 {
    // Task-01(A)
    public static void oneToN(int start, int end) {
        if (start > end) {
            return;
        } 
        else {
            System.out.print(start + " ");
            oneToN(start + 1, end);
        }
    }

    // Task-01(B)
    public static void nToOne(int start, int end) {
        if (end == 0) {
            return;
        } 
        else {
            System.out.print(end + " ");
            nToOne(start, end - 1);
        }
    }

    // Task-01(C)
    public static int recursiveSum(int start, int end) {
        if (start > end) {
            return 0;
        } else {
            return start + recursiveSum(start + 1, end);
        }
    }

    public static void main(String[] args) {
        // Task-01(A)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int N = sc.nextInt();
        oneToN(1, N);

        // Task-01(B)
        System.out.println();
        nToOne(1, N);

        // Task-01(C)
        System.out.println();
        System.out.println(recursiveSum(1, N));

        sc.close();
    }
}
