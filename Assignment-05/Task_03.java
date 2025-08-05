import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            int p = 1; //As each time 1 is increasing by one.
            for (int j = 1; j <= i; j++) {
                System.out.print((p++) + "");
            }
            System.out.println();
        }
        sc.close();
    }
}
