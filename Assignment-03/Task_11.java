import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum=0;
        for(int i=0; i<10; i++){
            System.out.print("Enter number : ");
            int number = sc.nextInt();

            sum+=number;
            System.out.println(sum);
        }
        sc.close();
    }
}
