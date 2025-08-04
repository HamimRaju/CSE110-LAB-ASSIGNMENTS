import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int user = sc.nextInt();

        int non_negative_counter=0;
        int negative_counter=0;
        for(int i=1; i<=user;i++){
            System.out.print("Enter number "+i+":");
            int number = sc.nextInt();
            if(number>=0){
                non_negative_counter+=1;
            }
            else{
                negative_counter+=1;
            }
        }
        System.out.println(non_negative_counter+" Non negative counter");
        System.out.println(negative_counter+" Negative counter");
        sc.close();
    }
}
