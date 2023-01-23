package string_;

import java.util.Scanner;

public class longest_palindrome {
    public static void main(String args[])

    {

        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int max_len=0,i,j,len = 0,start=0,end=0;
        for(i=0;i<s.length();i++)
        {
            for(j=i;j<s.length();j++)
            {
                int z=palindrome(i,j,s);
                if(z > max_len)
                {
                    max_len=z;
                    start=i;
                    end=j;
                }


            }
        }
        System.out.println(max_len);
        for(i=start;i<=end;i++)
        {
            System.out.print(s.charAt(i));
        }
    }

    public static int  palindrome(int x, int y, String s) {
        int i, j, len = 0;
        String s1 = "", s2 = "";
        for (i = y; i >= x; i--) {
            s1 += s.charAt(i);

        }
        for (j = x; j <= y; j++) {
            s2 += s.charAt(j);

        }
        if (s1.equals(s2)) {
            len = y - x + 1;
            return (len);
        } else {

            return 0;
        }
    }

}
