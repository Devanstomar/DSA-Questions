package com.packages;
import java.io.*;
public class print_duplicates {
    public static void main(String args[])
    {

        int a[]={1,3,3,1,2,2,2};
        int temp=0,i,j=0,x=0;
        for( i=0;i<a.length;i++)
        {
            for(j=0;j<a.length-i-1;j++)
            {
                if(a[j+1] < a[j])
                {
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }

            }
        }
        for(i=0;i<a.length;i++)
        {
            if(i==a.length-1)
                break;
            if(a[i]!=a[i+1]) {
                a[x++]=a[i];
            }
        }
        a[x++]=a[a.length-1];
        for(i=0;i<x;i++)
        {
            System.out.println(a[i]);

        }



    }
}
