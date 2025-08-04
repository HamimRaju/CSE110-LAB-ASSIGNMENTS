import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int user = sc.nextInt();

        int prime_counter = 0;
        for (int i = 2; ; i++) {
            int count=0;
            for (int j = 2; j < i; j++) { 
                if(i%j==0){
                    count++;
                    break;
                }
            } 
            if(count==0){
                System.out.println(i);
                prime_counter++;
            }
            if(prime_counter==user){
                break;
            }
        }
    }
}
