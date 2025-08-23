public class Task_01 {
    //Task-01(A)
     public static void evenChecker(int number){
        if(number%2==0){
            System.out.println("Even!!");
        }
        else{
            System.out.println("Odd!!");
        }
    }
    //Task-01(B)
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    //Task-01(C)
     public static boolean isPos(int number){
        if(number>0){
            return true;
        }
        else{
            return false;
        }
    }
    //Task-01(D)
        public static void sequence(int number){
        //f n is positive then it prints all the even numbers from 0 to n, 
        if(isPos(number)){
            for(int i=0;i<=number;i++){
                if(isEven(i)){
                    System.out.print(i+" ");
                }
            }
        }
        else{
            for(int i = number; i <= -1; i++){
                if(!isEven(i)){
                    System.out.print(i+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        //Task-01(A)
        evenChecker(10);
        //Task-01(B)
        boolean result = isEven(10);
        System.out.println(result);
        //Task-01(C)
        isPos(10);
        System.out.println(result);
        //Task-01(D)
        sequence(-7);
    }
}
