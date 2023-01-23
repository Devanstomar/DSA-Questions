package com.packages;

public class min_subarray {
    static int  min_length(int a[],int k)
    {
        int start,end,n,cur_sum=0;
        start=end=0;
        n=a.length;
        int min_len=n+1;
        while(end<n)
        {
            while(cur_sum<=k && end<n)
            {
                cur_sum+=a[end++];

            }
            while(cur_sum>k && start<n)
            {
                if((end-start+1)<min_len)
                {
                    min_len=end-start+1;

                }

                cur_sum-=a[start++];

            }
        }
        return min_len;
    }
    public static void main(String args[])
    {
        int a[]={1,10,3,40,18};
        int k=50;
        int z=min_length(a,k);
        System.out.println(z);
    }

}
