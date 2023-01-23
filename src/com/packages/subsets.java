package com.packages;
import java.io.*;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.*;
public class subsets {
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        //int size=sc.nextInt();
        int a[]={1,2,3};
        int n=a.length;
      // int max=(int)Math.pow(2,size);
        for(int i=0;i < (1<<n);i++)
        {
            for(int j=0;j < n;j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
