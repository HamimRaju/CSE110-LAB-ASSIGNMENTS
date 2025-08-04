import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int user =sc.nextInt();
        
        int counter=0;
        for(int i=1; user>0;i++){
            user=user/10;
            counter+=1;
        }
        System.out.println("Total digits = "+counter);
        sc.close();
    }
}
