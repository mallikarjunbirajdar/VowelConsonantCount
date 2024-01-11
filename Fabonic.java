import java.util.Scanner;

public class Fabonic {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c;
        int count=0;

        System.out.println("enter the number");
        Scanner in=new Scanner(System.in);

        int term =in.nextInt();

        for (int i=1 ;i<=term;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;


        }

    }
}
