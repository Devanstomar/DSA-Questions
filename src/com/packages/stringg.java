package com.packages;
import java.io.*;
public class stringg {
    public static void main(String args[])
    {
        String x="madam is a cat";

        String b="";
        String c="";
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)!=' ')
            {
                 b+= x.charAt(i);
                continue;
            }
            for(int j=b.length()-1;j>=0;j--)
            {
                c+=b.charAt(j);

            }
            if(b.equals(c)) {
                System.out.println(b);
            }


        }
    }
}

