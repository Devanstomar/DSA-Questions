package com.packages;
import java.io.*;
import java.util.Scanner;
public class selection_sort {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        int i,j,temp=0,min=0,x=0;
        int a[]=new int[size];
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<size-1;i++)
        {
            min=i;
            for(j=i+1;j<size;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }

            }
            if(min!=i)
            {
                temp=a[j+1];
                a[j+1]=a[j];
                a[j]=temp;

            }
        }
        for(i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }
    }

}
