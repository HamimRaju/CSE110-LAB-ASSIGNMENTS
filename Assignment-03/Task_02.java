import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number :");
        int n=sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n;i++){
            System.out.print("Enter 5 numbers :");
            int number = sc.nextInt();
            sum+=number;
        }
        System.out.println("The sum of "+n+" number is : "+ sum);
        System.out.println("The average is : "+(double)(sum/n));
        sc.close();
    }
}
