import java.util.Scanner;

public class Task_08{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a Starting number : ");
        int starting = sc.nextInt();
        System.out.print("Please enter ending number : ");
        int ending = sc.nextInt();

        System.out.println("Armstrong numbers:");

        for (int i = starting; i <= ending; i++) {
            int temp = i;
            int store = i;
            int counter = 0;

            // Count number of digits
            for (int j = 1; store != 0; j++) {
                store = store / 10;
                counter++;
            }

            // Create power of 10 based on digit count
            int power = 1;
            for (int k = 1; k < counter; k++) {
                power = power * 10;
            }

            int sum = 0;
            int digitCounterCopy = i; // Copy of the number to extract digits
            for (int m = 1; digitCounterCopy != 0; m++) {
                int first_number = digitCounterCopy / power;
                int cube = first_number * first_number * first_number;
                sum += cube;
                digitCounterCopy = digitCounterCopy % power;
                power = power / 10;
            }

            if (i == sum) {
                System.out.println(i);
            }
        }
    }
}