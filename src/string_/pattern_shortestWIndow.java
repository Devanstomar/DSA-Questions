package string_;
import java.util.*;

public class pattern_shortestWIndow {

    public static void main(String args[])
    {
        pattern_shortestWIndow ob=new pattern_shortestWIndow();

        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String p=sc.next();
        System.out.println(ob.smallestWindow(s,p));

    }
        //Function to find the smallest window in the string s consisting
        //of all the characters of string p.
        public static String smallestWindow(String s, String p)
        {

            String ans="";
            char ch=' ';
            HashMap<Character,Integer> map2=new HashMap<>();

            for(int i=0;i<p.length();i++)
            {
                ch=p.charAt(i);
                map2.put(ch,map2.getOrDefault(ch,0)+1);

            }

            int mct=0;
            int dmct=p.length();

            HashMap<Character,Integer> map1=new HashMap<>();
            int i=-1;
            int j=-1;


            while(true)
            {
                boolean f1=false;
                boolean f2=false;

                while(i<s.length()-1 && mct<dmct)
                {
                    i++;
                    ch=s.charAt(i);
                    map1.put(ch,map1.getOrDefault(ch,0)+1);

                    if(map1.getOrDefault(ch,0) <=map2.getOrDefault(ch,0))
                    {
                        mct++;

                    }
                    f1=true;
                }


                while(j<i && mct==dmct)
                {
                    String pan=s.substring(j+1,i+1);
                    if(ans.length()==0 || pan.length()<ans.length())
                    {
                        ans=pan;
                    }
                    j++;
                    ch=s.charAt(j);
                    if(map1.get(ch)==1)
                    {
                        map1.remove(ch);

                    }
                    else
                    {
                        map1.put(ch,map1.get(ch)-1);

                    }
                    if(map1.getOrDefault(ch,0)< map2.getOrDefault(ch,0))
                    {
                        mct--;
                    }
                    f2=true;

                }

                if(f1==false && f2==false)
                {
                    break;
                }

            }
            return ans;
        }
    }

