import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = sc.nextInt(); 

        // Upper half
        for (int i = 0; i <= number / 2; i++) {
            // Print spaces
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            // Print numbers from 1 to (number - 2*i)
            for (int j = 1; j <= number - 2 * i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Lower half
        for (int i = number / 2 - 1; i >= 0; i--) {
            // Print spaces
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            // Print numbers from 1 to (number - 2*i)
            for (int j = 1; j <= number - 2 * i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}