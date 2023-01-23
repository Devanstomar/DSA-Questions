package com.packages;
import java.util.*;
public class rotate_array {

    public void rotate(int arr[], int n,int k) {
            int i=0;
        while(k>0) {
            int temp = arr[arr.length - 1];


            for (i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = temp;
            k--;

        }

            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j]);
            }


    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];

        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        int rotation=sc.nextInt();
        rotate_array ob=new rotate_array();
        ob.rotate(a,size,rotation);
    }

}
class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
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
            Arrays.sort(arr1);
            Arrays.sort(arr2);
        }
    }
}