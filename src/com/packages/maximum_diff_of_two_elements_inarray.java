package com.packages;
import java.io.*;
import java.util.Scanner;

public class maximum_diff_of_two_elements_inarray {


        void diff(int a[]) //time complexity is o(n^2) 1st method
        {int max=0;

        for (int i = 0; i < a.length; i++) {
                for ( int j = i + 1; j < a.length; j++) {
                    if (a[i] < a[j]) {
                        max = Math.max(max, (a[j] - a[i]));

                    }
                }
            }
            System.out.println(max);

        }


        public static void max_diff(int a[]) // 2nd method time complexity o(n)
    {
           int maxdiff = a[1] - a[0];
            int min = a[0];
            int i,j;
            for ( i = 0; i < a.length; i++) {
                if ((a[i] - min > maxdiff)) {
                    maxdiff = a[i] - min;
                }
                if (a[i] < min) {
                    min = a[i];

                }

            }
            System.out.println(maxdiff);

        }

        static void maxx_diff(int a[]) // 3rd method time complexity o(n)
        {
            int i,min=a[0],maxdiff=0;
            for(i=0;i<a.length;i++)
            {
                if(a[i]<min)
                {
                    min=a[i];
                }
            }
            maxdiff=a[1]-a[0];
            for(i=0;i<a.length;i++)
            {
                if((a[i]-min)>maxdiff)
                    maxdiff=a[i]-min;
            }
            System.out.println(maxdiff);
        }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int i, j, max = 0;
        int size = sc.nextInt();
        int a[] = new int[size];
        for (i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
            maxx_diff(a);



    }
}

