import java.util.Scanner;

public class Dcuk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = sc.nextInt();
        int zero_counter = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit == 0) {
                zero_counter++;
            }
            number = number / 10;
        }
        if (zero_counter > 0) {
            System.out.println("Duck Number.");
        } else {
            System.out.println("Not a Duck Number.");
        }
        sc.close();
    }
}
