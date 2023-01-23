package Arrays2;

import java.util.Scanner;

public class count_subarrays_ksum {
    void subarrays(int a[],int x)
    {
        int c=0;
        int s=0;
        int low=0;
        int high=0;
        int n=a.length;
        while(high<n)
        {
            s+=a[high];
            while(s>x)
            {
                s-=a[low];
                low++;
            }
            if(s==x)
            {
                c++;
            }
            high++;
        }
        System.out.println(c);

    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       int  k=sc.nextInt();
        int a[]={-2,2,4,1,2,7};
        count_subarrays_ksum ob=new count_subarrays_ksum();
        ob.subarrays(a,k);

    }



}
