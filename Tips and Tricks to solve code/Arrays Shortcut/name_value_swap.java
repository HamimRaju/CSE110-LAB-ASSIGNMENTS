
public class name_value_swap {
    public static void main(String[] args) {

        String [ ] students = {"Sam","Maya","Joe","Ronit","Nihir"};
        int [] marks = {92,82,85,91,94};
        for(int i=0;i<marks.length-1;i++){
            for(int j=0;j<marks.length-1-i;j++){
                if(marks[j]>marks[j+1]){
                    int temp = marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=temp;

                    String temporary =students[j];//swap the corresponding student names, keeping marks and names aligned.
                    students[j]=students[j+1];
                    students[j+1]=temporary;
                }
            }
        }
        for(int i=0;i<marks.length;i++){
            System.out.println(students[i]+ " : "+marks[i]);
        }
       
    }
}
