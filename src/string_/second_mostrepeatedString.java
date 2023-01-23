package string_;
import java.util.*;
public class second_mostrepeatedString {


        String secFrequent(String arr[], int N)
        {
            HashMap<String,Integer> map=new HashMap<>();

            int i;
            int sec_max=Integer.MIN_VALUE;
            int first_max=Integer.MIN_VALUE;
            int value=0;

            String key="";

            for(i=0;i<N;i++) {


                    map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            }

            for(Map.Entry<String,Integer> e:map.entrySet())
            {
                value=e.getValue();
                if(value>first_max)
                {
                    sec_max=first_max;
                    first_max=value;
                }
                else if(value>sec_max && value<first_max)
                {
                    sec_max=value;
                }
            }
            for(Map.Entry<String,Integer> e1:map.entrySet())
            {
                key=e1.getKey();
                value=e1.getValue();
                if(value==sec_max)
                {
                    return key;
                }
            }
            return null;
        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            second_mostrepeatedString ob=new second_mostrepeatedString();
            int N=sc.nextInt();
            String arr[]=new String[N];
            for(int i=0;i<N;i++)
            {
                arr[i]=sc.next();
            }
            System.out.print(ob.secFrequent(arr, N));

        }

    }
