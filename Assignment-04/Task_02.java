import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("The value of N : ");
        int n = sc.nextInt();

        int y=0;
        for(int i=1;i<=n;i++){
            int sum=0;
            for(int j=1;j<=i;j++){
                sum=sum+j;
            }
            y-=sum;

        }
        System.out.print("The value of Y : "+y);
    }
}
