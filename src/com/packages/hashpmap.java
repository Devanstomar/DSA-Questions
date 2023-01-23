package com.packages;
import java.util.*;
import java.util.Scanner;
import java.io.*;

class abc {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        char y[]=s.toCharArray();
        int size =y.length;
        Map<Character,Integer> map=new HashMap<>();
       int i=0;
       while(i!=size)
       {
           if (map.containsKey(y[i]) == false) {
               map.put(y[i], 1);

           }
           else
           {
               int old_val = map.get(y[i]);
               int new_val = old_val + 1;
               map.put(y[i], new_val);
           }
           ++i;
       }
      Set<Map.Entry<Character,Integer>>hmap=map.entrySet();
       int maxval=0;
        char maxkey=' ';
       for(Map.Entry<Character,Integer>data:hmap)
       {
       if(data.getValue()>maxval)
       {
           maxval=data.getValue();
            maxkey=data.getKey();
       }


       }
        System.out.println(maxkey);
        System.out.println(maxval);
    }
}
