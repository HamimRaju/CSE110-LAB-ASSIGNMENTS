import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = sc.nextInt();

        int n=number;
        int counter=0;
        for (int i=1;n>0; i++){
            n=n/10;
            counter+=1;
        }
        int power=1;
        for(int j=1;j<counter;j++){
            power = power*10;
        }
        for(int i=0;i<counter;i++){
            int first_number = number/power;
            System.out.print(first_number);
            number=number%power;
            power=power/10;

            if(number!=0){
                System.out.print(",");
            }
        }
        sc.close();
    }
}
