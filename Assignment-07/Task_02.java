public class Task_02 {
    public static void main(String[] args) {
        int array [] = {9, -5, 7, 9, -5, 5, 7};
        int [] new_array = new int[array.length];

        for(int i=0;i<array.length;i++){
            new_array[i] = array[i];
        }

        System.out.println("Before removing duplicates : ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        //This block of code will remove duplicates.
        for(int i=0;i<new_array.length;i++){
            int count = 0;
            for(int j=0;j<new_array.length;j++){
                if(new_array[i] == new_array[j]){
                    count++;
                    if(count > 1){
                        new_array[j] = 0;
                    }
                }
            }
        }

        System.out.println("\nAfter removing duplicates : ");
        for(int i=0;i<new_array.length;i++){
            System.out.print(new_array[i]+" ");
        }
    }
}