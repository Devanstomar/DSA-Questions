package com.packages;

import java.util.Arrays;

public class merge_sortedarray {

    public static  void merge(int arr1[], int arr2[], int n, int m) {

        int i=n-1;
        int j=0;
        int temp=0;
        while(i>=0 && j<=m)
        {
            if(arr1[i]>arr2[j])
            {
                temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
                i--;
                j++;
            }
            else{
                break;
            }

            Arrays.sort(arr1);
            Arrays.sort(arr2);
        }
        for(i=0;i<(n+m);i++)

        {
            if(i<n)
            System.out.println(arr1[i]);
            else
                System.out.println(arr2[i]);
        }
    }
    public static void main(String args[])
    {
        int arr1[]={1,4,5};
        int arr2[]={7,8,9,6};
        int n=arr1.length;
        int m=arr2.length;
        merge(arr1,arr2,n,m);
    }
}


