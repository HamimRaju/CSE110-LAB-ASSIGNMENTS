import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount the customer need to pay(Taka) : ");
        int total_bill = sc.nextInt();
        System.out.print("Enter the amout customer gave : ");
        int given = sc.nextInt();
        if (given>total_bill && given!=total_bill){
            int bill = given-total_bill;
            System.out.println("The returned amount is "+bill+" Taka.");
            int hundred = bill/100;
            bill=bill%100;
            System.out.println("100 taka note : "+hundred);
            int fifty = bill/50;
            bill=bill%50;
            System.out.println("50 taka note : "+fifty);
            int twenty = bill/20;
            bill=bill%20;
            System.out.println("20 taka note : "+twenty);
            int ten = bill/10;
            bill=bill%10;
            System.out.println("10 taka note : "+ten);
            int five = bill/5;
            bill=bill%5;
            System.out.println("5 taka coin : "+five);
            int two = bill/2;
            bill=bill%2;
            System.out.println("2 taka coin : "+two);
            int one = bill/1;
            bill=bill%1;
            System.out.println("1 taka coin : "+one);

        }
        else if(given==total_bill){
            System.out.println("The returned amount is 0 Taka.");
        }
        else{
            System.out.println("Please pay "+(total_bill-given+" taka more."));
        }
        sc.close();
    }
}
