import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number : ");
        int start =sc.nextInt();
        System.out.print("Enter number of odd number you want to add : ");
        int no_of_odd_number = sc.nextInt();

        if(start%2==0){
            int number_counter=0;
            int next_odd=start+1;
            int sum=0;
            for(int i=next_odd;;i++){
                if(number_counter==no_of_odd_number){
                    break;
                }
                else if(i%2!=0){
                    sum+=i;
                    number_counter++;
                }
            }
            System.out.println(sum);
        }
        else{
            int sum=0;
            int number_counter=0;
            for(int i=start;;i++){
                if(number_counter==no_of_odd_number){
                    break;
                }
                else if(i%2!=0){
                    sum+=i;
                    number_counter++;
                }
            }
            System.out.println(sum);
        }
    }
}
