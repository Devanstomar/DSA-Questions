package com.packages;

public class difference {

        public static void main(String args[]) {
            int j;
            int x=0;
            int a[] = {1, 2,3,4};
            int b[] = {2,4, 5, 6};
            int c[] = new int[a.length + b.length];
            int i;
            for(i=0; i<a.length; i++)
            {
                int k=0;
                for(j=0;j<b.length;j++)
                {
                    if(a[i]==b[j])
                    {
                        k=1;
                        break;

                    }
                }
                if(k==0)
                    c[x++]=a[i];

            }
           for(i=0;i<x;i++)
            {
                System.out.println(c[i]);
            }


        }
    }


