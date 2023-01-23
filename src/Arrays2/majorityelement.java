package Arrays2;

import java.util.HashMap;
import java.util.Scanner;

public class majorityelement {

    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        majorityelement ob=new majorityelement();
        ob.element(a);

    }

    void element(int a[] )
    {
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            map.put(a[i],map.getOrDefault(a[i],0)+1);

        }


        for(int key:map.keySet())
        {
           if(map.get(key)>(a.length/2))
           {
               max=map.get(key);
           }

        }

        System.out.println(max);

    }
}
