package heaps;
import java.util.*;
public class Priority_queue {
    int largest(int a[],int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<a.length;i++)
        {
            pq.add(a[i]);
        if(pq.size()>k)
        {
            pq.poll();
        }

        }
        return pq.peek();

    }
    public static void main(String args[])
    {
        Priority_queue ob=new Priority_queue();
        int a[]={7,10,4,20,15};
        int k=4;
        System.out.println(ob.largest(a,k));

    }
}
