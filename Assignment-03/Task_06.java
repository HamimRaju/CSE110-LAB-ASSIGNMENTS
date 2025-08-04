import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Please enter a number : ");
        int number = sc.nextInt();

        int sum=0;
        for(int i=1; i<=number;i++){
            if(i%2==0){
                sum+=-1*(i*i);
            }
            else{
                sum+=(i*i);
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
