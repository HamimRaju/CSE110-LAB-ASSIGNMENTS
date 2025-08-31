public class Task_11 {
    //Task-11(A)
    public static int isVowel(String s1){
        int vowel_count = 0;
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
                vowel_count++;
            }
        }
        return vowel_count;
    }

    //Task-11(B)
    public static int isConsonant(String s1){
        int consonant_count = 0;
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(c==' '){
                continue;
            }
            if(!(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')){
                consonant_count++;
            }
        }
        return consonant_count;
    }

    //Task-11(C)
    public static int vowelSum (String [] names){
        int count = 0;
        for(int i=0;i<names.length;i++){
            String s1 = names[i];
            count += isVowel(s1);
        }
        return count;
    }
    public static int consonantSum (String [] names){
        int count = 0;
        for(int i=0;i<names.length;i++){
            String s1 = names[i];
            count += isConsonant(s1);
        }
        return count;
    }
    public static void main(String[] args) {
        //Task-11(A)
        int vowel_count = isVowel("The quick brown fox jumps over the lazy dog");
        System.out.println("Number of vowels in the string : "+vowel_count);
        //Task-11(B)
        int consonant_count=isConsonant("The quick brown fox jumps over the lazy dog");
        System.out.println("Number of consonant in the String : "+consonant_count);
        //Task-11(C)
        String [] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};
        System.out.println( "The total number of vowels in the array is:" + vowelSum(names));
        System.out.println( "The total number of consonants in the array is:" + consonantSum(names));
    }
}
