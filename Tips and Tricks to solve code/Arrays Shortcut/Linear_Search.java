import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = { 23, 14, 5, 46, 30, 8 };
        System.out.print("Enter a number you want to search : ");
        int number = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr1.length; i++) {
            if (number == arr1[i]) {
                System.out.println("Element is found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found.");
        }
    }
}
