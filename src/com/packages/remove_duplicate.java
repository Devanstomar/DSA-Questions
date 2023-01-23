package com.packages;
import java.io.*;

public class remove_duplicate {
    public static void main(String args[])throws IOException
    {

        int a[]={1,1,4,4,4,5,5,2,2,3,3};
        int i,j,k,temp=0,c=0,x=0;
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a.length-i-1;j++)
            {
                if(a[j+1]<a[j]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }


            for(j=0;j<a.length-1;j++)
            {

                c=0;
                if (a[j]==a[j+1]) {
                    c++;
                }
                if(c==1)
                    continue;
                else
                    a[x++]=a[j];
            }
            a[x++]=a[a.length-1];
            for(k=0;k<x;k++)
            {
                System.out.println(a[k]);
            }

    }
}
