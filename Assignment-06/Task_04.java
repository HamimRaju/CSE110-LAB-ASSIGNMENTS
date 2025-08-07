import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a String : ");
        String string = sc.nextLine();
        System.out.print("Please enter a splitter : ");
        String splitter = sc.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == splitter.charAt(0)) {
                System.out.println();
            } 
            else {
                System.out.print(string.charAt(i));
            }
        }
        sc.close();
    }
}
