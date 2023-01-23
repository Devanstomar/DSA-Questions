package Arrays2;

import java.util.Scanner;
public class longest_increasing_subarray {

    public static void main(String args[])
    {
        int len=0,c=0;
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();

        }

        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size-1;j++)
            {
                if(a[j]>a[i])
                {
                    c++;

                }
                else
                {
                    break;
                }

            }
            if(c>len)
            {
                len=c;
            }

        }

        System.out.println(len);
    }
}
