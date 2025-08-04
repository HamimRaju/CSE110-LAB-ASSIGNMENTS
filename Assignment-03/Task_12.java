import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int user = sc.nextInt();
        System.out.println("Divisors of "+user+":");
        for(int i=1; i<=user; i++){
            if(user%i==0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
