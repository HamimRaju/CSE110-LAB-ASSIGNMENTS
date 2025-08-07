import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            // Increasing space.
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // Decreasing number 1.
            for (int j = 1; j <= number - i; j++) {
                System.out.print(j);
            }
            // Decreasing number 2
            for (int j = number - i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
        sc.close();
    }
}
