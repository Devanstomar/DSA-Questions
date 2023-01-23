package searching_sorting1;

import java.util.Arrays;

public class aggressive_cows {
    public static void main(String args[])
    {
        aggressive_cows ob=new aggressive_cows();
        int a[]={4,2,1,3,6};
        int k=2;
        System.out.println(ob.agg_cows(a,k));



    }

    int agg_cows(int a[],int k) {
        int s = 0;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            maxi = Math.max(maxi, a[i]);
        }
        int e = maxi;
        int ans = 0;
        Arrays.sort(a);
        int mid = s + (e - s) / 2;
        while (s <= e) {
            if (is_possible1(a, k, mid) == true)
            {
                ans = mid;
                s = mid + 1;

            }
            else
            {

                e = mid - 1;

            }
            mid=s+(e-s)/2;
        }

        return ans;
    }



        boolean is_possible1(int a[],int k,int mid)
        {
            int last_pos=a[0];
            int cow_count=1;
            for(int i=0;i<a.length;i++)
            {
                if(a[i]-last_pos>=mid)
                {
                    cow_count++;
                    if(cow_count==k)
                    {
                        return true;
                    }
                   last_pos=a[i];

                }

            }
            return false;
    }
}
