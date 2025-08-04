import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = sc.nextInt();
        for(int i=1;i<=number; i++){
            if(i%5==0 && i%3!=0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
