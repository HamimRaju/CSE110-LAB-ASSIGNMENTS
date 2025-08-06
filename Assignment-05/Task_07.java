import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int row = sc.nextInt();
        System.out.print("Please enter a number : ");
        int column = sc.nextInt();
        
        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                if (i ==1 || i==row){//Will print first row + last row.
                    System.out.print(j);
                }
                else if(j==1 || j==column){//Will print first column + last column
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                } 
            }
            System.out.println();
        }
        sc.close();
    }
}
