public class VowelConsonantCount {
    public static void main(String[] args) {

        String str="Sandeep";

        countVowels(str);
    }

    private static void countVowels(String str){

        int vowelCount=0;
        int consonantCount=0;

        for (int i=0;i<str.length();i++){
            if (isVowel(str.charAt(i))) {
                ++vowelCount;
            }
            else {
                ++consonantCount;
                
            }
        }
        System.out.println("vowel Count="+vowelCount);
        System.out.println("Consonant count="+consonantCount);


    }

    private static boolean isVowel(char ch) {
        ch=Character.toUpperCase(ch);
        return (ch=='A'||ch=='E'||ch=='I'||ch=='o'||ch=='u');

    }
}
