package com.packages;
import java.util.Scanner;
public class kadane_algorithm {
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
    int a[]=new int[size];
        int i;
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }

        int max_sum=a[0];
        int sum=a[0];
        for(i=0;i<a.length;i++)
        {
            if(sum<0)
            {
                sum=a[i];
            }
            else
            {
                sum=sum+a[i];
            }
            max_sum=Math.max(sum,max_sum);
        }
      System.out.println(max_sum);



    }
}
