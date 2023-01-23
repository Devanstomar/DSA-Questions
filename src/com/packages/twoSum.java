package com.packages;

import java.util.*;

public class twoSum {
        public static void main(String [] args)
        {
            Scanner sc=new Scanner(System.in);
            int size=sc.nextInt();
            int i,j,flag=0;
            int sum=7;
            int a[]=new int[size];
            for(i=0;i<size;i++)
            {
                a[i]=sc.nextInt();
            }
            for(i=0;i<a.length;i++)
            {
                for(j=i+1;j<a.length;j++)
                {
                    if(a[i]+a[j]==sum)
                    {
                        System.out.println(a[i] + " " + a[j] );



                        flag=1;
                    }
                }
            }
            if(flag==0)
            {
                System.out.println(-1);
            }
        }
    }


