package heaps;

import java.util.PriorityQueue;

public class connect_nropes {
    public static void main(String args[])
    {
        int a[]={4,3,2,6};
        connect_nropes ob=new connect_nropes();
        System.out.println(ob.connect(a));

    }
    int connect(int a[]) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
       int a1,a2,s=0,c=0;
        for (int i = 0; i < a.length; i++)
        {
            min.add(a[i]);
        }
        while(min.size()>1)
        {
            a1=min.poll();
            a2=min.poll();
            s=a1+a2;
            c+=s;
            min.add(s);

        }
        return c;

    }
}
