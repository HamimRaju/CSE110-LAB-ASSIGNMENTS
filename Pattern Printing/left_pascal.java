import java.util.Scanner;

public class left_pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = i; k <= number; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
