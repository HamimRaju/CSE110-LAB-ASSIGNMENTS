import java.util.Scanner;
public class Task_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the Array : ");
        int length = sc.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter a number : ");
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the number to find : ");
        int required_number = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == required_number) {
                System.out.println(required_number + " is at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found.");
        }
        sc.close();
    }
}