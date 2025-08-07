import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a number : ");
        int user = sc.nextInt();
        int number = 0;

        for (int i = 1; i <= user; i++) {
            number = number * 10 + i;// This will convert into a single number.
        }

        int copy_number = number;
        int reverse = 0;
        number = number / 10;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.print(copy_number);
        System.out.print(reverse);
        sc.close();
    }
}
