public class words_manipulation2 {
    public static void main(String[] args) {
        String s1= "This is a string";

        String modified="";//Stores modified String.
        s1+=" ";//Add a spce at the end of the string.
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(c!=' '){
                modified+=c;
            }
            else{
                System.out.println(modified);
                modified="";//The value that was stored before that will not be concatanated.
            }
        }
    }
}
