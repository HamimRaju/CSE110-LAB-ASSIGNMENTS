import java.util.Scanner;

public class Task_04 {
     //Task-04(A)
    public static boolean isPrime(int number){
        if(number<=1){
            return false;
        }
        for(int i=2;i<number;i++){
            if(number %i==0){
                return false;
            }    
        }
        return true;
    }

    //Task-04(B)
    public static boolean isPerfect(int number){
        int sum =0;
        for(int i=1;i<number;i++){
            if(number %i==0){
                sum+=i;
            }
        }
        
        if(sum==number){
            return true;
        }
        else{
            return false;
        }
    }
    //Task-04(C)
    public static int  special_sum(int number){
        int sum=0;
        for(int i=0;i<number;i++){
            if(isPrime(i)||isPerfect(i)){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        //Task-04(A)
        boolean check = isPrime(7);
        System.out.println(check);
        //Task-04(B)
        boolean perfect_check = isPerfect(6);
        System.out.println(perfect_check);
        //Task_04(C)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int user = sc. nextInt();
        int result = special_sum(user);
        System.out.println(result);
        sc.close();
    }
}
