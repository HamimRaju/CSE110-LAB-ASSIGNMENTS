import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your marks : ");
        int number = sc.nextInt();
        if (number >= 90 && number <= 100) {
            System.out.println("Your grade is : " + "A");
        }
        if (number >= 85 && number <= 89) {
            System.out.println("Your grade is : " + "A-");
        }
        if (number >= 70 && number <= 84) {
            System.out.println("Your grade is : " + "B");
        }
        if (number >= 57 && number <= 69) {
            System.out.println("Your grade is : " + "C");
        }
        if (number >= 50 && number <= 56) {
            System.out.println("Your grade is : " + "D");
        }
        if (number < 50) {
            System.out.println("Your grade is : " + "F");
        }
        sc.close();
    }
}
