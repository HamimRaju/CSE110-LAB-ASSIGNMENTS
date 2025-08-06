import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = i; j < number; j++) {
                System.out.print(" ");
            }
            int p = 1;
            for (int k = 1; k <= (2 * i - 1); k++, p++) {
                System.out.print(p);
            }
            System.out.println();
        }
        for (int i = number-1; i>=1; i--) {
            for (int j = i; j < number; j++) {
                System.out.print(" ");
            }
            int p = 1;
            for (int k = 1; k <= (2 * i - 1); k++, p++) {
                System.out.print(p);
            }
            System.out.println();
        }
        sc.close();
    }
}
