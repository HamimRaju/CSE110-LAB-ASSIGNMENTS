import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int x=sc.nextInt();
        if(x<0){
            System.out.println("output: "+2*x);
        }
        if(x>=0 && x<2){
            System.out.println("output: "+(x+1));
        }
        if(x>=2 && x<5){
            System.out.println("output: "+((x*x)-1));
        }
        if(x>5){
            System.out.println("output: "+(3*(x*x)+2));
        }
        sc.close();
    }
}
