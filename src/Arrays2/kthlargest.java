package Arrays2;

import java.util.PriorityQueue;

public class kthlargest {
    public static void main(String args[])
    {
        int a[]={2,3,1,5,7};
        int k=1;
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int i=0;i<k;i++)
        {
            pq.add(a[i]);

        }
        for(int i=k;i<a.length;i++)
        {
            if(pq.peek()<a[i])
            {
                pq.poll();
                pq.add(a[i]);
            }
        }
        System.out.print(pq.peek());

          }
    }


