import java.util.Scanner;
public class Task_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter Length : ");
        int length = sc.nextInt();

        int [] array = new int[length+1];
        for(int i=0;i<length;i++){
            System.out.print("Enter a number : ");
            int number = sc.nextInt();
            array[i]=number;
        }
        System.out.print("Enter another number : ");
        int another_number = sc.nextInt();

        System.out.println("The elements of the Array are : ");
        for(int j=0;j<length;j++){
            System.out.println(j+" : "+array[j]);
        }

        array[length]=another_number;
        System.out.println("After resizing the array : ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        sc.close();
    }
}