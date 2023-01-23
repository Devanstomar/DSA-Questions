package com.packages;
import java.util.*;
public class frequency {
    public static void func1(int a[],int n,int k) {
        int i,j,c=0,temp;
        for (i = 0; i < n ; i++) {
            for (j = 0; j < n-i-1; j++) {
                if (a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for( i=0;i<n;i++)
        {
            System.out.print(a[i]);

        }
        System.out.println();
        for (i = 0; i < n; i++) {
            if(i==n-1)
            {
                break;
            }
            if (a[i] == a[i + 1]) {
                c++;

            } else {
                if ((c + 1) > (n / k)) {
                    System.out.println(a[i]);
                }
                c = 0;
            }

        }



    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int a[]={2,3,1,2,2,4,4,4,2,3,3,3};
       int n=a.length;
        int k=sc.nextInt();
        func1(a,n,k);



    }
}

