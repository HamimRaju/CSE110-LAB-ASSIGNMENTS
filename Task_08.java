import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter the length of array 1 : ");
        int length = sc.nextInt();
        int[] arr1 = new int[length];
        System.out.println("Please enter the elements of the array 1 : ");
        for (int i = 0; i < length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Please enter the length of array 2 : ");
        int length2 = sc.nextInt();
        int[] arr2 = new int[length2];
        System.out.println("Please enter the elements of the array 2 : ");
        for (int i = 0; i < length2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Subset checking 
        int count = 0;  

        for (int i = 0; i < arr2.length; i++) {   // each element of arr2
            int found = 0;                        // assume not found in arr1
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {         // match found
                    found = 1;
                    break;                        // stop inner loop
                }
            }
            if (found == 0) {                     // if any element not found
                count = 1;                        // not a subset
                break;                            // no need to check more
            }
        }

        if (count == 0) {
            System.out.println("Array 2 is a subset of Array 1.");
        } else {
            System.out.println("Array 2 is not a subset of Array 1.");
        }
        sc.close();
    }
}