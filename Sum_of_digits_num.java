public class Sum_of_digits_num {
    public static void main(String[] args) {
        int num=251025;
        int rem=0;
        int sum=0;
        int temp;

        temp=num;

        while(num>0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum od digits of" +temp+ "is" +sum);
    }
}
