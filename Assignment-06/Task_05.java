import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a String : ");
        String s1 = sc.nextLine();

        String words = "";
        s1+=" ";
        String reverse = "";
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(c!=' '){
                words+=c;
            }
            else{
                reverse=words+" "+reverse;
                words="";
            }
            
        }
        System.out.println(reverse);
        sc.close();
    }
}
