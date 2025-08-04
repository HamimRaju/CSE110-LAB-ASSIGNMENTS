import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number=sc.nextInt();
        if (number<0){
            System.out.println("Number is negative.");
        }
        if (number==0){
            System.out.println("Number is zero.");
        }
        if (number>0 && number%2==0){
            System.out.println("Number is positive and even.");
        }
        if (number>0 && number%2!=0){
            System.out.println("Number is positive and odd.");
        }
        sc.close();
        
    }
}
