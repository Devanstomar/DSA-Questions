package com.packages;
import java.io.*;
import java.util.Scanner;
public class insertion_sort {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

                int size,temp=0,j,i;
        size=sc.nextInt();
        int a[]=new int[size];

        for( i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=1;i<size;i++)
        {
            temp=a[i];
            j=i-1;
            while(j>=0 && a[j]>temp)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        for(j=0;j<size;j++)
        {
            System.out.println(a[j]);
        }
    }

}
