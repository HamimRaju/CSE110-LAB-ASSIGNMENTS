import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.print("Enter the length of the array : ");
        int length = sc. nextInt();

        int [] array = new int[length];
        for(int i=0;i<length;i++){
            System.out.print("Enter a number : ");
            int number = sc.nextInt();
            array[i]=number;
        }
        System.out.println("Original array : ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]<array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println("\nSorted array : ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        sc.close();
    }
}
