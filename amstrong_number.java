import java.sql.SQLOutput;
import java.util.Scanner;

public class amstrong_number {
    public static void main(String[] args)
    {
        int n,sum=0,r;
        int arg ;

        n=153;
        arg=n;
        for(int i=1;i<n;i++)
        {
            while(n>0){
                r=n%10;
                sum=sum+(r*r*r);
                n=n/10;
            }
        }
        if(arg== sum){
        System.out.println("Number is Armstrong number"+arg);

    }
        else {
            System.out.println("not Armstring"+arg);
        }



    }
}
