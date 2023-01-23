package com.packages;
import java.io.*;
import java.util.Arrays;
import java.io.*;
import java.util.Scanner;
public class removing_duplicate2 {
    public static void main(String args[]) throws IOException {
        Scanner sc=new Scanner(System.in);
        String str = "", str1 = "";
        int i, j;
        int size=sc.nextInt();
        int a[] =new int[size];
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        String b[] = new String[a.length];
        for (i = 0; i < a.length; i++) {
            b[i] = String.valueOf(a[i]);
        }
        for (i = 0; i < b.length; i++) {
            str += b[i];

        }
        System.out.println(str);
        for (i = 0; i < str.length(); i++)
        {
            for (j = 0; j < str.length(); j++)
            {
                if (str.charAt(i) == str.charAt(j)) {
                    str1 += str.charAt(i);
                }
                String ch = String.valueOf(str.charAt(i));
                str = str.replaceAll(ch, " ");

            }
        }
        System.out.println(str1);

    }

}


        /*for(i=0;i<b.length;i++)
        {
            for(j=i+1;j<b.length;j++)
            {
                if(b[j]==b[i])
                    b[x++]=b[j];
                b[]

            }
        }
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }


    }
}*/
