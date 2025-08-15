import java.util.Scanner;

public class Special {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = sc.nextInt();
        int copy_number = number;

        int sum = 0;
        int multiplication = 1;
        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            multiplication = multiplication * digit;
            number = number / 10;
        }
        if (sum + multiplication == copy_number) {
            System.out.println("Special Number.");
        } else {
            System.out.println("Not a Special Number.");
        }
        sc.close();
    }
}
