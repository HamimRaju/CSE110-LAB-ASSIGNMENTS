import java.util.Scanner;

public class reverse_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        for(int i=1;i<=number;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=number;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
