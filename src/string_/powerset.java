package string_;

public class powerset {
    static void powerset(String p, String u)
    {
        char ch;
        if(u.isEmpty()) {

            if(palindrome(p)==true)
                System.out.println(p);

            return;
        }
         ch=u.charAt(0);
        powerset(p+ch,u.substring(1));
       powerset(p,u.substring(1));

    }

    static boolean palindrome(String s)
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



    public static void main(String args[])
    {

        powerset(" ","abc");
    }


}
