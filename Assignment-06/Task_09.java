import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your password : ");
        String password = sc .nextLine();

        boolean flag =true;
        for(int i=0;i<password.length();i++){
            char c = password.charAt(i);
            if(password.length()>=8 && c>='A'&& c<='Z' && c>='a' && c<='z' && c=='@'||c=='!'||c=='#'||c=='$'){
                flag= true;
            }
            else{
                flag= false;
            }
        }
        System.out.println(flag);
        sc.close();
    }
}
