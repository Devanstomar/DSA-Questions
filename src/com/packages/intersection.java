package com.packages;

public class intersection {
    public static void main(String args[]) {
        int j;
        int x=0;
        int a[] = {1, 2};
        int b[] = {2, 5, 6};
        int c[] = new int[a.length + b.length];
        int i;
        for(i=0; i<a.length; i++)
        {
            for(j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    c[x++]=a[i];

                }
            }

        }
        for(i=0;i<x;i++)
        {
            System.out.println(c[i]);
        }

    }
}
