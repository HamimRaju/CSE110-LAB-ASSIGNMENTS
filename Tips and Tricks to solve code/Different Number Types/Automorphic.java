import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number :");
        int number = sc.nextInt();

        int counter = 0;
        int square = number * number;
        while (number != 0) {
            int digit = number % 10;
            int d1 = square % 10;
            if (digit != d1) {
                counter = 1;
            }
            number = number / 10;
            square = square / 10;
        }
        if (counter == 0) {
            System.out.println("Authomorphic Number.");
        } else {
            System.out.println("Not an Automorphic Number.");
        }
        sc.close();
    }
}
