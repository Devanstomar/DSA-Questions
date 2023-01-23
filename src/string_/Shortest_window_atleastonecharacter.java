package string_;
import java.util.*;
public class Shortest_window_atleastonecharacter {

    public static void main(String args[])
    {
        Shortest_window_atleastonecharacter ob=new Shortest_window_atleastonecharacter();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        System.out.println(ob.findSubString( str));
    }


        public int findSubString( String str) {


            int len=Integer.MAX_VALUE;
            int plen=0;

            HashSet<Character> unique=new HashSet<>();
            for( int k=0;k<str.length();k++)
            {
                char ch=str.charAt(k);
                unique.add(ch);
            }

            int i=-1;
            int j=-1;

            HashMap<Character,Integer> map=new HashMap<>();

            while(true)
            {
                boolean f1=false;
                boolean f2=false;

                while(i<str.length()-1 && map.size()<unique.size())
                {
                    i++;
                    char ch=str.charAt(i);
                    map.put(ch,map.getOrDefault(ch,0)+1);

                    f1=true;
                }

                while(j<i && map.size()==unique.size())
                {
                    plen=i-j;
                    if(plen<len)
                    {
                        len=plen;
                    }
                    j++;

                    char ch=str.charAt(j);
                    if(map.get(ch)==1)
                    {
                        map.remove(ch);

                    }
                    else
                    {
                        map.put(ch,map.get(ch)-1);

                    }
                    f2=true;
                }
                if(f1==false && f2==false)
                {
                    break;
                }
            }
            return len;
        }
    }

