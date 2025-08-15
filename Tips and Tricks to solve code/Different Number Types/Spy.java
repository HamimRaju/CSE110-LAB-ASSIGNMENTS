import java.util.Scanner;

public class Spy {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Please Enter a number : ");
        int number = sc.nextInt();

        int sum = 0;
        int multiplication = 1;
        while (number!=0) {
            int digit = number%10;
            sum = sum+ digit;
            multiplication=multiplication*digit;
            number= number/10;
        }
        if(sum==multiplication){
            System.out.println("Spy number.");
        }
        else{
            System.out.println("Not Spy number.");
        }
        sc.close();
    }
}
