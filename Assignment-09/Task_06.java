public class Task_06 {
    public static int power(int base, int power){
        if(power==0){
            return 1;
        }
        else{
            return base * power(base, power - 1);
        }
    }
    public static void main(String[] args) {
        int x = power(5,3);
        System.out.println(x);

    }
}
