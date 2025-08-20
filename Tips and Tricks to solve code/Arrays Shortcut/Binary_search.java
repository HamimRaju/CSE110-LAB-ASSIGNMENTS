import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = {5, 8, 14, 23, 30, 46,};
        System.out.print("Enter a number you want to search : ");
        int number = sc.nextInt();

        int first = 0;
        int last= arr1.length-1;

        boolean found = false;
        while(first <= last) {//For loop iterate one by one but in Binary search we follow steps not one by one checking.
            int middle = (first+last)/2;
            if(number==arr1[middle]){
                System.out.println("The number is found at index "+middle);//Instead of i it will be middle.
                found=true;
                break;
            }
            else if(number<arr1[middle]){
                last=middle-1;
            }
            else if(number>arr1[middle]){
                first=middle+1;
            }
        }

        if(!found){
            System.out.println("Element not found.");
        }

    }
}
