package string_;
import java.util.*;

public class permutations {

    static void permute(int index, String s)
    {
        if(index==s.length()-1) {
            System.out.println(s);
            return;
        }
            for(int i=index;i<s.length();i++)
            {
                s=swap(s,i,index);
                permute(index+1,s);
                s=swap(s,i,index);

            }

        }

    static String swap(String s, int i, int j)
    {
        char ch[]=s.toCharArray();
        char p=ch[i];
        ch[i]=ch[j];
        ch[j]=p;
        return String.valueOf(ch);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        permute(0,s);
    }
}
