import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int j = 0;;j++){
            System.out.print("Please enter a number : ");
            int number = sc.nextInt();
            if(number>0){
                System.out.println(number+"^"+number+"="+(number*number));
            }
            else{
                break;
            }
        }
        sc.close();
    }
}
