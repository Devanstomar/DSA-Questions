package com.packages;
import java.util.*;

public class print_elementonce {

    public static void main(String args[])
    {
        int a[]={1,2,2,3};
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            c=0;
            for(int j=0;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }

            }
            if(c==1)
            {
                System.out.println(a[i]);
            }
        }
    }
}
