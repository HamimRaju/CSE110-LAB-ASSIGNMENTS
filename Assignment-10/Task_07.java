public class Task_07 {
    public static void main(String[] args) {
        int arr[] = {6, 13, 28, 17, 3, 9, 11, 23, 10, 29, 12, 7};
        System.out.println("Prime numbers : ");
        for(int i=0;i<arr.length;i++){
            int counter =0;
            for(int j=2;j<arr[i];j++){
                if(arr[i]==0 || arr[i]==1){
                    counter=0;
                }
                if(arr[i]%j==0){
                    counter++;
                    break; //Break is so important here.
                }
                else{
                    counter=0;
                }
            }
            if(counter==0){
                System.out.println(i+" : "+ arr[i]);
            }
            else{
                continue;
            }
        }
        System.out.println("Perfect numbers : ");
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=1;j<arr[i];j++){
                if(arr[i]%j==0){
                    sum+=j;
                }
                else{
                    continue;
                }
            }
            if(sum==arr[i]){
                System.out.println(i+" : "+arr[i]);
            }
            else{
                continue;
            }
        }
    }
}
