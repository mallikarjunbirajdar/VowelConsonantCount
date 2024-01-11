public class ReversString {
    public static void main(String[] args) {
        String str="malik";
        String result="";


        for (int i=str.length()-1; i>=0;i--){
            result=result+str.charAt(i);

        }
        System.out.println("Reverse string="+result);
    }
}
