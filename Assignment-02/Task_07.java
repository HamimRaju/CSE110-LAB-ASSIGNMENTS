import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plese enter your salary : ");
        int salary = sc.nextInt();
        System.out.println("Please enter your age : ");
        int age = sc.nextInt();
        if (age>=18){
            if(salary<10000){
                System.out.println("Your tax amounts in 0 Tk.");
            }
            else if(salary>=10000 && salary<=20000){
                int tax = (salary*5)/100;
                System.out.println("Your tax amounts in "+tax+ " Tk.");
            }
            else if(salary>=20000){
                int tax = (salary*10)/100;
                System.out.println("Your tax amounts in "+tax+ " Tk.");
            }
        }
        else{
            System.out.println("Your tax amounts in 0 Tk.");
        }
        sc.close();
    }
}
