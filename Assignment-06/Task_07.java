import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first String : ");
        String s1 = sc.nextLine();
        System.out.print("Please enter second String : ");
        String s2 = sc.nextLine();

        String output = "";
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(!s2.contains(c+"")){
                output+=c;
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (!s1.contains(c + "")) {
                output += c;
            }
        }
        System.out.println(output.toUpperCase());
        sc.close();
    }
}
