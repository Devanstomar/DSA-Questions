package com.packages;
import java.util.Scanner;
public class rearrange_negative_positive {

    public static void rearrange(int a[],int n) {
        int k = 0, i = 0, j = 0;
        while (k < n && i < n && j < n) {
            if (k % 2 != 0) {
                if (a[k] >= 0) {
                    i = k;
                    j = k;
                    while (i < n && a[i] >= 0) {


                        i++;
                    }

                    if (i >= n)
                        break;
                    rotate(a, j, i);
                }
            } else {
                if (a[k] < 0) {
                    i = k;
                    j = k;
                    while (j < n && a[k] < 0) {


                        j++;
                    }
                    if (j >= n)
                        break;
                    rotate(a, i, j);
                }

            }
            k++;
        }
        for (i = 0; i < n; i++)
        {
            System.out.print(a[i]);
        }

        }



    static void rotate(int a[], int start, int end)
    {
        int temp=0,i;
        temp=a[end];
        for(i=end;i>start;i--)
        {
            a[i]=a[i-1];

        }
        a[start]=temp;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int i;
        int a[]=new int [size];
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        rearrange(a,size);


    }
}
