import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number : ");
        int row = sc.nextInt();
        System.out.print("Enter column number : ");
        int column = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
