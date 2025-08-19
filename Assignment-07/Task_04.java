import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int length = sc.nextInt();

        int [] array = new int[length];
        int [] modified_array = new int[length];
        for(int i= 0;i<length;i++){
            System.out.print("Enter Number : ");
            int number = sc.nextInt();
            array[i]=number;
        }
        System.out.println("Original array : ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        
        for(int i=0;i<length;i++){
            if(array[i]>0){
                modified_array[i]=1;
            }
            else if(array[i]<0){
                modified_array[i]=0;
            }
            else{
                continue;
            }
        }

        System.out.println("\nAfter Modifying : ");
        for(int i =0;i<modified_array.length;i++){
            System.out.print(modified_array[i]+" ");
        }
        sc.close();
    }
}
