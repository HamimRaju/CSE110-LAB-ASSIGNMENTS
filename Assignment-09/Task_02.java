import java.util.Scanner;

public class Task_02 {
    public static void reverseDigits(int n) {
        if (n == 0) {
            return;
        } 
        else {
            System.out.print(n % 10 + " ");
            reverseDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        reverseDigits(n);

        sc.close();
    }
}
