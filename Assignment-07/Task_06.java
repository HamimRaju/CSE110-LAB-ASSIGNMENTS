import java.util.Scanner;
public class Task_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int length = sc.nextInt();

        double[] array = new double[length];
        double maximum = array[0];
        double minimum = array[0];
        double summation = 0.0;
        int maxindex=0;
        int minindex=0;
        for(int i=0;i<length;i++){
            System.out.print("Enter a number : ");
            double number = sc.nextDouble();
            array[i]=number;
            summation+=array[i];

            if(array[i]>maximum){
                maximum=array[i];
                maxindex=i;
            }
            if(array[i]<minimum){
                minimum=array[i];
                minindex=i;
            }
        }
        System.out.println("Maximum element "+maximum+" found at index "+maxindex);
        System.out.println("Minimum element "+minimum+" found at index "+minindex);
        System.out.println("Summation : "+summation);
        System.out.printf("Summation : %.2f",summation/length);
        sc.close();
    }
}
