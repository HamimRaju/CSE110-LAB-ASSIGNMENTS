public class Task_04 {

    public static String reverse_string(String s, int index) {
        if (index == s.length()) {
            return "";
        }
        return reverse_string(s, index + 1) + s.charAt(index);
    }
    public static void main(String[] args) {
        System.out.println(reverse_string("Hello", 0)); 
    }
}