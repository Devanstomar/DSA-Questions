package com.packages;

public class symmetric_difference_func {
    static int[] diff(int[] a, int[] b)
    {
        int j;
        int x = 0,t=0;

        int z[] = new int[a.length + b.length];
        int i;
        for (i = 0; i < a.length; i++) {
            int k = 0;
            for (j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    k = 1;
                    break;

                }
            }
            if (k == 0)
               z[x++]=a[i];

        }
        int h[]=new int[x];
        for(i=0;i<x;i++)
        {
            h[t++]=z[i];
        }


        return h;
    }
    static int[] union(int[] s, int[] j)
    {
        int n=0,i;
        int g[]=new int[s.length+j.length];
        for (i = 0; i < s.length; i++) {
            g[n] = s[i];
            n++;
        }
        for (i = 0; i < j.length; i++) {
            g[n] = j[i];
            n++;
        }
        return g;
    }

    public static void main(String args[])
    {

        int c[]={1,2,3,4};
        int d[]={3,4,5};
        int y[]=diff(c,d);



        int q[]=diff(d,c);





        int g[]=new int[y.length+q.length];
        int e[]=union(y,q);
        for(int i=0;i<e.length;i++)
        {
            System.out.println(e[i]);
        }

    }
}
