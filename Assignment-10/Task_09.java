public class Task_09 {
    public static void getScores(char [] studentGrades,int  [] studentScores){
        for(int i=0;i<studentGrades.length;i++){
            char c = studentGrades[i];
            if(c=='A'){
                studentScores[i]=100;
            }
            else if(c=='B'){
                studentScores[i]=90;
            }
            else if(c == 'C'){
                studentScores[i]=70;
            }
            else{
                studentScores[i]=0;
            }
        }
    }
    public static void main(String[] args) {
        char [] studentGrades = new char[]{'A', 'A', 'A', 'B', 'C', 'U', 'Z'};
        int  [] studentScores = new int[7];
        
        getScores(studentGrades,studentScores);

        for(int i=0;i<studentScores.length;i++){
            System.out.println(studentScores[i]);
        }
    }
}
