import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 of the triangle : ");
        int side1 = sc.nextInt();
        System.out.print("Enter side 2 of the triangle : ");
        int side2 = sc.nextInt();
        System.out.print("Enter side 3 of the triangle : ");
        int side3 = sc.nextInt();
        if (side1==side2 && side2==side3 && side3==side1){
            System.out.println("This is a equilateral triangle.");
        }
        else if(side1==side2 || side2==side3 || side3==side1){
            System.out.println("This is a isosceles triangle.");
        }
        else{
            System.out.println("This is a Scalene triangle.");
        }
        sc.close();
    }
}
