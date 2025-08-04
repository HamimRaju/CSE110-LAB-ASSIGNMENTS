public class Task_01B {
    public static void main(String[] args) {
        for (int i=18;i<=63;i+=9){
            if(i%2==0){
                System.out.print(i+",");
            }
            else{
                System.out.print(-1*i+",");
            }
        }
    }
}
