import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = i; j < number; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || i == number || j == (2 * i - 1)) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}