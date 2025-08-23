public class Task_03 {
    //Task-03(A)
    public static boolean isTriangle(int side1,int side2,int side3){
        if(side1+side2>side3 && side2+side3>side1 && side3+side1>side2){
            return true;
        }
        else{
            return false;
        }
    }

    //Task-03(B)
    public static void triArea(int side1,int side2,int side3){
        if(isTriangle(side1, side2, side3)){
            double s = (side1 + side2 + side3) / 2.0; // semi-perimeter
            double temp = s * (s - side1) * (s - side2) * (s - side3);
            double area = Math.pow(temp, 0.5); 
            System.out.printf("Area of triangle : %.3f",area);
        }
        else{
            System.out.println("Cant't form a triangle.");
        }
    }
    public static void main(String[] args) {
        ////Task-03(A)
        boolean result = isTriangle(7,5,10);
        System.out.println(result);
        //Task-03(B)
        triArea(7,5,10);
    }
}
