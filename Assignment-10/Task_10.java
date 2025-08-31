public class Task_10 {
    //Task-10(A)
    public static double convertToCm(double inches){
        double cm = inches *2.54;
        return cm;
    }
    ////Task-10(B)
    public static double findAvgCm (double [] cheetos_inches){
        double total_inches=0;
        for(int i=0;i<cheetos_inches.length;i++){
            total_inches += cheetos_inches[i];
        }
        double average = total_inches/cheetos_inches.length;
        double converted = convertToCm(average);
        return converted;
    }
    public static void main(String[] args) {
        //Task-10(A)
        double t = convertToCm(16);
        System.out.println(t + " cm");

        //Task-10(B)
        double [] cheetos_inches = new double [] {10.0, 12.0, 14.0, 16.0, 18.0};
        double averageLength = findAvgCm(cheetos_inches);
        System.out.println("The average Cheeto length is "+ averageLength  +" cm");

    }
}
