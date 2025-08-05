import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j++) {
                System.out.print(" ");
            }
            int p = number - i + 1;// As each time 1 is decreasing by one.
            for (int k = 1; k <= i; k++, p++) {
                System.out.print(p + "");
            }
            System.out.println();
        }
        sc.close();
    }
}
