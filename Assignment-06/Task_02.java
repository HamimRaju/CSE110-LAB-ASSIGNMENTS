import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string : ");
        String s1 = sc.nextLine();
        
        for (int i = s1.length() - 1; i >= 0; i--) {
            System.out.print(s1.charAt(i));
        }
        sc.close();
    }
}
