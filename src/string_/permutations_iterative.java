package string_;
import java.io.*;
import java.util.Scanner;

public class permutations_iterative {

    public static void main(String[] args)
    {
        permutations_iterative ob=new permutations_iterative();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ob.iterative(str);


    }
    void iterative(String str)
    {
        int  n,f,temp,q,r,i,j;

        n=str.length();
        f=factorial(n);

        for(i=0;i<f;i++)
        {
            StringBuilder sb=new StringBuilder(str);
            temp=i;
            for(j=n;j>=1;j--)
            {
                q=temp/j;
                r=temp%j;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp=q;

            }
            System.out.println();
        }

    }

    int factorial(int n)
    {
        int f=1;
        for(int i=2;i<=n;i++)
        {
            f=f*i;
        }
        return(f);
    }
}
