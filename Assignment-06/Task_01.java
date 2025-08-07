import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string : ");
        String s1 = sc.nextLine();

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c >= 97 && c <= 122) {
                System.out.print((char) (c - 32));
            } 
            else {
                System.out.print(s1.charAt(i));
            }
        }
        sc.close();
    }
}