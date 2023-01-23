package string_;
import java.util.Scanner;
public class palindromic_strings {

    public static void main(String args[])
    {
        palindromic_strings ob=new palindromic_strings();
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.print(ob.countPS(s));

    }
        long countPS(String str)
        {

            int i,j,c=0;
            String s;
            for(i=0;i<str.length();i++)
            {
                for(j=i+1;j<=str.length();j++)
                {
                    s=str.substring(i,j);
                    if(palindrome(s)==true)
                    {
                        c++;
                    }
                }
            }
            return c;
        }

        boolean palindrome(String s)
        {
            int i=0;
            int j=s.length()-1;
            while(i<=j)
            {
                if(s.charAt(i)!=s.charAt(j))
                {
                    return false;
                }
                else
                {
                    i++;
                    j--;
                }

            }
            return true;


        }
    }

