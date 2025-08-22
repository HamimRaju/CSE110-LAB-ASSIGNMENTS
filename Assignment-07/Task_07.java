
public class Task_07 {
    public static void main(String[] args) {
        int arr [] = {23,100,23,56,100};
        System.out.println("Input array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        int[] newarray = new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            int found =0 ;
            for(int j=0;j<index;j++){
                if(newarray[j]==arr[i]){
                    found= 1;
                    break;
                }
            }
            if(found==0){
                newarray[index]=arr[i];
                index++;
            }
        }

        System.out.println("\nNew array : ");
        for(int i=0;i<index;i++){
            System.out.print(newarray[i]+" ");
        }
    }
}
