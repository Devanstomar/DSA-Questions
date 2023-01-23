package heaps;
import java.io.*;
import java.util.PriorityQueue;

public class kthlargest_contigous_Sum {

    public static void main(String args[])
    {
        int a[]={10, -10, 20, -40 };
        int k=6;
        kthlargest_contigous_Sum ob=new kthlargest_contigous_Sum();
        System.out.println(ob.find(a,k));

    }
    int find(int a[],int k)
    {
        PriorityQueue<Integer> min=new PriorityQueue<>();
        int x=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                if(j==i)
                {
                    x=a[j];

                }
                else
                {
                    x+=a[j];

                }
                min.add(x);
                if(min.size()>k)
                min.poll();

            }
        }
        return min.peek();

    }
}
