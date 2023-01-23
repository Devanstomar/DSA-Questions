package Arrays2;

import java.util.Arrays;

public class count_subarrays {

    public static void main(String args[]) {

        int a[]={1, 2, 3, 4};
        int k=1;
        count_subarrays ob =new count_subarrays();
        System.out.println(ob.count(a,k));

    }

    int count(int a[], int k) {
        int i = 0, j = 0;
        int ans = 0;
        while (j < a.length) {
            i=0;

            while ((getmax(Arrays.copyOfRange(a, i, j+1)) > k ) & (i <=j)) {
                ans++;
                i++;
            }
            j++;
        }

        return ans;
    }


    int getmax(int a[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
           max=Math.max(max,a[i]);
        }
        return max;
    }
}
