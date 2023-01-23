package com.packages;
import java.io.*;
import java.util.Scanner;
public class bubble_sort {

    public static void main(String args[])
    {

        System.out.println("enter the array");
        int a[]={4,3,3,9,8,5,7,1,5};
        int i,j,temp=0;
        for(i=0;i<a.length;i++) {
            boolean swapped = false; // this boolean is given false
            for (j = 0; j < a.length -i- 1; j++) {
                if (a[j + 1] < a[j]) {
                    swapped = true; // if swapping do not occur for once that is array is now sorted then
                                     // swapped value will not become true that will indicate that sorting is done
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }

            }

            if (swapped == false)  /*if swapped value will remain true then loop will break and
                                      loop will not run more which means it will optimize the program*/

                break;
        }
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);

        }
    }

}
