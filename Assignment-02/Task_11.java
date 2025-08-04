import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int number1 = sc.nextInt();
        System.out.print("Input the second number : ");
        int number2 = sc.nextInt();
        System.out.print("Input the third number : ");
        int number3 = sc.nextInt();
        if (number1==number2 && number2==number3 && number3==number1){
            System.out.println("All numbers are equal.");
        }
        else if(number1!=number2 && number2!=number3 && number3!=number1){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Neither all are equal or different.");
        }
        sc.close();
    }
}
