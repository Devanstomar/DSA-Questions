package com.packages;

import java.util.ArrayList;
import java.util.Scanner;
public class factorial_largeNumber {

    static ArrayList<Integer> factorial(int n) {
        ArrayList<Integer> res=new ArrayList<Integer>();

        int size=0,c=0,i,j,temp=0;
        res.add(0,1);
        size=1;
        for(i=2;i<=n;i++)
        {
            for(j=size-1;j>=0;j--)
            {
                temp=res.get(j)*i+c;
               res.set(j,temp%10);
                c=temp/10;
            }
            while(c!=0)
            {
                res.add(0,c%10);
                c=c/10;
                size++;

            }
        }
        return (res);



    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> r=factorial(n);

        for(int i=0;i<r.size();i++)
        {
            System.out.print(r.get(i));
        }

    }


}
