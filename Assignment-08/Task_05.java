public class Task_05 {
    //Task-05(A)
    public static void showDots(int number){
        for (int i=1;i<=number;i++){
            System.out.print(".");
        }
    }
    //Task-05(B)
    public static void show_palindrome(int number){
        for(int i=1;i<=number;i++){
            System.out.print(i);
        }
        for(int i=number-1;i>=1;i--){
            System.out.print(i);
        }
    }
    //Task-05(C)

  public static void showDiamond(int number){
    // upper half
    for(int i=1;i<=number;i++){
        showDots(number-i);       // left dots
        show_palindrome(i);       // numbers (palindrome already prints both sides)
        showDots(number-i);       // right dots
        System.out.println();
    }
    // lower half
    for(int i=number-1;i>=1;i--){
        showDots(number-i);       // left dots
        show_palindrome(i);       // numbers
        showDots(number-i);       // right dots
        System.out.println();
    }
}
    
    public static void main(String[] args) {
        //Task-05(A)
        showDots(5);
        //Task-05(B)
        System.out.println();
        show_palindrome(5);
        //Task-05(C)
        System.out.println();
        showDiamond(5);
    }
}
