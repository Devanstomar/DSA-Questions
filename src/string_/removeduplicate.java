package string_;
import java.util.*;
public class removeduplicate {
    public static void main(String args[])
    {
        String s="aabaa";
        StringBuilder ob=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int idx=s.indexOf(ch,i+1);
            if(idx==-1)
            {
                ob.append(ch);
            }

        }
        System.out.println(ob);
    }

}
