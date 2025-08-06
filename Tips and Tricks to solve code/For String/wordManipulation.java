public class wordManipulation {
    public static void main(String[] args) {
        String s1="This is a string.";
        String word ="";//For storing the modified words.
        int end=0;
        for(int i=0; (end=s1.indexOf(' ',i))>0;i=end+1){//Space porjonto jabe
            word=s1.substring(i, end);
            System.out.println(word);
        }
        //For printing the last word.
        String lastword = s1.substring((s1.lastIndexOf(' ')+1));
        System.out.println(lastword);
    }
}
