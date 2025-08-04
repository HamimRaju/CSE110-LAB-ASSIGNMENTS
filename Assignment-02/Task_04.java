import java.util.Scanner;
public class Task_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int year= sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println(year+ " is a leap year.");
                }
                else{
                    System.out.println(year+ " is not a leap year. ");
                }
            }
            else{
                System.out.println(year+ " is is leap year.");
            }
        }
        else{
            System.out.println(year+ " is not a leap year.");
        }
        sc.close();
        
        
    }
}
