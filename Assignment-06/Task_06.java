import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string : ");
        String s1 = sc.nextLine();

        String convert=s1.toLowerCase();

        int vowel_count=0;
        int consonant_count=0;
        for(int i=0;i<convert.length();i++){
            char c = s1.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowel_count++;
            }
            else{
                consonant_count++;
            }

        }
        if(vowel_count%3==0 && consonant_count%5==0){
            System.out.println("Aaarr! Me Plunder!!");
        }
        else{
            System.out.println("Blimey! No Plunder!!");
        }
        sc.close();
    }
}
