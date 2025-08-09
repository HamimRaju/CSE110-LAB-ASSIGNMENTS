import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        for (int i = 1; i <number; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = i; k < number; k++) {
                System.out.print("  ");
            }
            for (int k = i; k < number; k++) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Reverse one.
        for(int i=1;i<=number;i++){
            for(int j=i;j<=number;j++){
                System.out.print("* ");
            }
            for(int k=1;k<i;k++){
                System.out.print("  ");
            }
            for(int l=1;l<i;l++){
                System.out.print("  ");
            }
            for(int m=i;m<=number;m++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
