import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1;;i++){
            System.out.print("Please enter a number : ");
            int number = sc.nextInt();
            if(number>0){
                int square= number * number;
                System.out.println(number+ " ^ "+ number+ " = "+square);
            }
            else{
                break;
            }
        }
    }
}
