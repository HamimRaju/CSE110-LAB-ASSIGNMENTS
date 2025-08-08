import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string : ");
        String user = sc.nextLine();

        String output = "";
        for (int i = 0; i < user.length(); i++) {
            char c = user.charAt(i);

            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                if (i % 2 == 0) {
                    c = Character.toLowerCase(c);
                } 
                else {
                    c = Character.toUpperCase(c);
                }
                output += c;
            }
            else{
                output+=c;
            }
        }

        System.out.println(output);
        sc.close();
    }
}