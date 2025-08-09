import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of stars : ");
        int number = sc.nextInt();

        for(int i=1;i<=number;i++){
            for(int j=i;j<=number;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}