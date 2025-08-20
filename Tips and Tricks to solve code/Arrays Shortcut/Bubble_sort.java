public class Bubble_sort {
    public static void main(String[] args) {
        int [] array = {45,3,9,12,3,8,-9};
        //Task is to move the highest one in the right side.
        for(int i=0;i<array.length-1;i++){//(-1)Because we won't compare the last number.
            for(int j=0;j<array.length-1-i;j++){//5,4,3,2,1 like this way
                if(array[j]>array[j+1]){
                    int temp = array[j];//Storing highest value in temp.
                    array[j]=array[j+1];//Right one to the left
                    array[j+1]=temp;//Larger one to the right side.
                }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
