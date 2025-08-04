import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of terms : ");
        int user=sc.nextInt();

        int summation =0;
        int counter = 1 ;
        System.out.println("The odd numbers are ");
        for(int i=1;;i++){
            if(i%2!=0 && counter<=user){
                summation +=i;
                counter+=1;
            }
            else{
                if(counter<=user){
                    continue;
                }
                else{
                    break;
                    
                }
            }
            System.out.println( i );
        }
        System.out.println("The sum of odd Natuaral Numbers up to "+user+" terms is : "+summation);
        sc.close();
    }
}
