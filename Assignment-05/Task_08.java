import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a nuber : ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            int p = 1;
            for (int j = 1; j <= i; j++, p++) {
                if (j == 1 || i == number || i == j) {
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
