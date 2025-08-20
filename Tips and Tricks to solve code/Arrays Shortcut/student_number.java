import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's name : ");
        String name = sc.nextLine();

        String [ ] students = {"Sam","Maya","Joe","Ronit"};
        int [] marks = {92,82,85,91,94};
        int found =0;
        for(int i =0;i<students.length;i++){
            if(name.equalsIgnoreCase(students[i])){
                System.out.println(marks[i]);
                found=1;
                break;
            }
        }
        if(found==0){
            System.out.println("No record is found.");
        }
    }
}
