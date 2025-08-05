import java.util.Scanner;

public class Task_06{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a range : ");
        int user = sc.nextInt();
        int maximum=0;
        int minimum=0;
        int sum=0;
        int positive_counter=0;
        for(int i=1;i<=user;i++){
            System.out.print("Enter number : ");
            int number = sc.nextInt();
            
            if(number>0 && number%2==0){
                sum+=number;
                positive_counter++;

                if(positive_counter==1){
                    maximum=number;
                }
                else{
                    if(number>maximum){
                        maximum=number;
                    }
                }

                if(positive_counter==1){
                    minimum=number;
                }
                else{
                    if(number<minimum){
                        minimum=number;
                    }
                }
            }            
        }
        System.out.println("Max: "+maximum);
        System.out.println("Min: "+minimum);
        if(positive_counter>0){
            System.out.println("Average: "+sum/positive_counter);
        }
        else{
            System.out.println("No even positive number were entered.");
        }   
    }
}
