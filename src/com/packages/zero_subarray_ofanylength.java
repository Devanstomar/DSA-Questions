package com.packages;
import java.util.*;
import java.util.Scanner;
public class zero_subarray_ofanylength {

    static boolean subarray(int a[], int n)
    {
        Set<Integer> ob=new HashSet<>();
        int sum=0,i;
           boolean found=false;
        for(i=0;i<n;i++)
        {
            ob.add(sum);
            sum+=a[i];
            if(ob.contains(sum))
            {
                found=true;
                break;
            }
        }
        if(found==true)
        {
            return found;
        }
        else
        {
            return false;
        }


    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
       int size=sc.nextInt();
        int a[]=new int[size];
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }

        boolean d=subarray(a,size);
        System.out.println(d);

    }

}
