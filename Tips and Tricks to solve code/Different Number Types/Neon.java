import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = sc.nextInt();
        int copy_number = number;

        int sum = 0;
        number = number * number;
        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        if (sum == copy_number) {
            System.out.println("Neon Number.");
        } else {
            System.out.println("Not a Neon Number.");
        }
        sc.close();
    }
}
