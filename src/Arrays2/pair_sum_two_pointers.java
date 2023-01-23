package Arrays2;

import java.util.Arrays;

public class pair_sum_two_pointers {

    public static void main(String args[])
    {
        int c=0;
        int a[]={2,1,3,-1,-2,9};
           int x=5;
        Arrays.sort(a);
        int low=0;
        int high=a.length-1;
        int s=0;
        while(low<high)
        {

            if(a[low]+a[high]<x)
            {
                low++;
            }
            else if(a[low]+a[high]>x)
            {
                high--;
            }
            else
            {
                System.out.println(a[low]+" "+a[high]);
                low++;
                high--;
                c++;

            }
        }
        System.out.println(c);


    }
}
