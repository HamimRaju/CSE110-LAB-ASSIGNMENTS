import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int user = sc.nextInt();

        for(int i=0; user!=0;i++){
            int last_digit=user%10;
            System.out.print(last_digit);
            user=user/10;
            if(user!=0){
                System.out.print(",");
            }
        }
        sc.close();
    }
    
}
