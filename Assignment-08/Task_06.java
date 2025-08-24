import java.util.Scanner;
public class Task_06 {
    //Task-06(A)
    public static double calcTax(int age, int salary){
        if(age<18 || salary<10000){
            double tax = 0.0;
            return tax;
        }
        if(salary>=10000 && salary<=20000){
            double tax = salary * 0.07;
            return tax;

        }
        if(salary>20000){
            double tax = salary * 0.14;
            return tax;
        }
        return 0.0;

    }

    //Task-06(B)
    public static void calcYearlyTax (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your age : ");
        int age = sc.nextInt();
        double yearly_tax =0;
        for(int i=1;i<=12;i++){
            int income = sc.nextInt();
            double monthly_tax = calcTax(age,income);
            System.out.printf("Month "+ i +" tax : %.2f",monthly_tax);
            System.out.println();
            yearly_tax+=monthly_tax;
        }
        System.out.println("Total yearly tax : "+yearly_tax);

        sc.close();
    }

    public static void main(String[] args) {
        //Task-06(A)
        double tax = calcTax(20,18000);
        System.out.printf("%.1f",tax);

        //Task-06(B)
        System.out.println();
        calcYearlyTax();
    }
}
