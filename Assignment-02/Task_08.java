import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        
        float max=0;
        float min=0;
        for(int i=1; i<=3; i++){
            System.out.print("Please enter a number : ");
            float number = sc.nextFloat();
            if(i==1){
                max=number;
            }
            else{
                if(number>max){
                    max=number;
                }
            }
            if(i==1){
                min=number;
            }
            else{
                if(number<min){
                    min=number;
                }
            }
        }
        System.out.println("Maximum number is : "+max);
        System.out.println("Minimum number is : "+min);
        sc.close();
    }
}
