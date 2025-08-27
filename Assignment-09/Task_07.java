public class Task_07 {
    public static void print_elements(int [] arr,int index){
        if(index==arr.length){
            return;
        }
        else{
            System.out.println(arr[index]+" ");
            print_elements(arr,index+1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,6,2,1,8,7};
        int index = 2;
        print_elements(arr,index);
    }
}
