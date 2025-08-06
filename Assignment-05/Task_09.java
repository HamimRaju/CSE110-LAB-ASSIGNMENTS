import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j++) {
                System.out.print(" ");
            }
            int p = number - i + 1;//Each time number decreased by one.
            for (int j = 1; j <= i; j++, p++) {
                if (i==number||j==1||i==j) {
                    System.out.print(p);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}