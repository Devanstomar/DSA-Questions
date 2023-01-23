package com.packages;
import java.util.*;
public class move_negative_elements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i;
        int size = sc.nextInt();
        int a[] = new int[size];
        for (i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int low = 0;
        int high = size - 1;

        while (low<= high) {
            if (a[low] < 0 && a[high] < 0) {
                low++;
            }


             else if (a[low] < 0 && a[high] > 0) {
                low++;
                high++;

            }

            else if (a[low] > 0 && a[high] > 0) {
                high--;
            }


            else
            {
                swap(a, low, high);
                low++;
                high--;
            }}


        for(i=0;i<size;i++)
        {
            System.out.print(a[i]);
        }
    }

      static void swap(int a[], int i,int j )
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }

    }





