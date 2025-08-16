import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String name = sc.nextLine();

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        boolean invalid = false;

        for (int i = 0; i <= password.length() - name.length(); i++) {
            if (password.charAt(i) == name.charAt(0)) {  // check only when first letter matches
                int count = 0;
                for (int j = 0; j < name.length(); j++) {
                    if (password.charAt(i + j) == name.charAt(j)) {
                        count++;
                    } else {
                        break;
                    }
                }
                if (count == name.length()) { // full match
                    invalid = true;
                    break;
                }
            }
        }

        if (invalid) {
            System.out.println("Invalid password");
        } else {
            System.out.println("Valid password");
        }
        sc.close();
    }
}