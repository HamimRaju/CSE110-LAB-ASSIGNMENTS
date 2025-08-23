public class Task_02 {
    
    //Task-02(A)
    public static double circleArea(int radius){
        double result  = 3.14168*(radius*radius);
        return result;
    }

    //Task-02(B)

    public static double sphereVolume(double radius){
        double result = (4*3.1416*(radius*radius*radius))/3;
        return result;
    }

    //Task-02(C)

    public static void findSpace(int diameter,String type){
        if(type.equalsIgnoreCase("circle")){
            double circle_result = circleArea(diameter/2);
            System.out.println(circle_result);
            
        }
        else if(type.equalsIgnoreCase("sphere")){
            double sphere_result = sphereVolume(diameter/2.0);
            System.out.println(sphere_result);
        }
        else if(type.equalsIgnoreCase("square")){
            System.out.println("Wrong parameter.");
        }

    }
    public static void main(String[] args) {
        //Task-02(A)
        double area=circleArea(5);
        System.out.println(area);

        //Task-02(B)
        double volume = sphereVolume(5.0);
        System.out.println(volume);

        //Task-02(C)
        findSpace(10,"circle");
    }
}
