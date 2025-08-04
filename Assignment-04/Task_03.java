import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1;;i++){
            System.out.print("Please enter a number : ");
            int number = sc.nextInt();
            int divisors_count = 0;
            if(number>=0 && number%2==0){
                for(int j=1;j<=number;j++){
                    if(number%j==0){
                        divisors_count++;
                    }
                }
            }
            else{
                break;
            }
            System.out.println(number + " has "+divisors_count+" divisors.");
        }
    }
}
