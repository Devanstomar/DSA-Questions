package Arrays2;

import java.util.Scanner;

public class container_with_most {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        int width,hiegth,water=0;

        int i=0;
        int j=size-1;
        int min=0;

        while(i<j)
        {
            width=j-i;
            hiegth=Math.abs(a[j]-a[i]);
            water=width*hiegth;
             if(a[i]<a[j])
             {
                 i++;
             }
             else
             {
                 j--;
             }
             if(water>min )
             {
                 min=water;
             }

        }
        System.out.println(min);

    }
}
