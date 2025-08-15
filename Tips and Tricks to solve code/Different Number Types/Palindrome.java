import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = sc.nextInt();
        int copy_number = number;

        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        if (reverse == copy_number) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not Plaindrome.");
        }
        sc.close();
    }
}