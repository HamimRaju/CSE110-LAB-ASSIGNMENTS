import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = i; j < number; j++) {
                System.out.print(" ");
            }
            int p = 1;
            for (int k = 1; k <= (2 * i - 1); k++, p++) {// 2 into row minus one.
                System.out.print(p);
            }
            System.out.println();
        }
        sc.close();
    }
}