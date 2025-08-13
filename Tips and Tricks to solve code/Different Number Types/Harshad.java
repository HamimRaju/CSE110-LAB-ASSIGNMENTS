import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = sc.nextInt();
        int copy_number = number;

        int sum = 0;
        while (number!=0) {
            int digit = number%10;
            sum+=digit;
            number=number/10;
        }
        if(copy_number%sum==0){
            System.out.println("Harshad Number.");
        }
        else{
            System.out.println("Not a Harshad Number.");
        }
        sc.close();
    }
}
