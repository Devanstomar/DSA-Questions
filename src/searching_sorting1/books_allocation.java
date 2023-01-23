package searching_sorting1;
import java.util.Scanner;

public class books_allocation {
    public static void main(String args[]) {


        int a[]={12 ,34, 67, 90};
        int n=a.length;
        int m=5;
       System.out.println( allocate_books(a,n,m));


    }


    static int allocate_books(int[] a, int n, int m) {
            if(m>n)
            {
                return -1;
            }
        int s = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];

        }
        int e = sum;
        int mid = s + (e - s) / 2;
        int ans = 0;
        while (s <= e) {
            if (is_possible(a, m, mid) == true) {

                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;

            }
            mid=s+(e-s)/2;

        }
        return ans;
    }


        static boolean is_possible(int a[],int m, int mid)
        {
            int stu_count=1;
            int pagesum=0;
            for(int i=0;i<a.length;i++)
            {
                if(pagesum + a[i]<=mid)
                {
                    pagesum+=a[i];
                }
                else
                {
                    stu_count++;
                    if(stu_count > m || a[i]>mid)
                    {
                        return false;
                    }
                    pagesum=a[i];
                }


        }
            return true;


    }


}

