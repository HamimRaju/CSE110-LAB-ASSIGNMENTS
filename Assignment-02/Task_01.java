import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max_value = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Please enter a number : ");
            int number = sc.nextInt();
            if (number > max_value) {
                max_value = number;
            } 
            else {
                continue;
            }
        }
        System.out.println("Largest number : " + max_value);
        sc.close();
    }
}
