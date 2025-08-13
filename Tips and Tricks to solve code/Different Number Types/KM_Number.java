import java.util.Scanner;

public class KM_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number :");
        int number = sc.nextInt();
        int copy_number = number;

        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;

            }
            sum = sum + fact;
            number = number / 10;

        }
        if (sum == copy_number) {
            System.out.println("KrishnaMurti Number.");
        } else {
            System.out.println("Not a KrishnaMurti Number.");
        }
        sc.close();
    }
}
