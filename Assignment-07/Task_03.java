import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter Length : ");
        int length = sc.nextInt();

        int [] array = new int[length];
        int [] reversed_array = new int[length];
        for(int i=0;i<length;i++){
            System.out.print("Enter a number : ");
            int number = sc.nextInt();
            array[i]=number;
        }
        System.out.println("Reversed using new array : ");
        for(int i=array.length-1;i>=0;i--){
            reversed_array[i]=array[i];
            System.out.print(reversed_array[i]+" ");
        }

        System.out.println("\nReversed the original array : ");
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        sc.close();
    }
}
