import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Plese Enter a number : ");
        int number = sc.nextInt();

        int counter =0;
        if(number==0 || number==1){
            System.out.println(number+" is not a prime number.");
        }
        else{
            for(int i=2;i<number;i++){
                if(number%i==0){
                    counter+=1;
                    break;
                }
            
            }
            if(counter==0){
                System.out.println(number + " is a prime number.");
            }
            else{
                System.out.println(number + " is not a prime number.");
            }
        }
        int perfect=number;
        int sum=0;
        for (int i=1;i<perfect;i++){
            if(perfect%i==0){
                sum+=i;
            }
        }
        if (sum==perfect){
            System.out.println(number + " is a perfect number.");
        }
        else{
            System.out.println(number + " is not a perfect number.");
        }
    }
}
