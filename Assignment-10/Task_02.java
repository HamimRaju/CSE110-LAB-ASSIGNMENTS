public class Task_02 {
    public static void modifyStrings(String s, String s1, String s2){
        if(s.contains(s1)){
            s = s.replace(s1, s2);
            System.out.println(s);
        }
        else{
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        String s = "abababa";
        String s1 = "aba" ;
        String s2 = "a";

        modifyStrings(s, s1, s2);

        s = "baddadda";
        s1 = "dd";
        s2 = "n";
        modifyStrings(s, s1, s2);
    }
}