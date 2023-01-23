package Arrays2;

import java.util.Scanner;

public class merge_sort {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
       int a[]={6,3,9,5,2,8,7};

        merge_sort ob = new merge_sort();
         ob.divide(a,0,size-1);

         for(int i=0;i<size;i++)
         {
             System.out.print(a[i]);

         }
    }

    void divide(int a[], int l, int h) {
        if (l ==h) {
            return;
        }



            int mid = l +(h-l) / 2;
            divide(a, l, mid);
            divide(a, mid + 1, h);
            conquer(a, l, mid, h);
        }



    void conquer(int a[], int l, int mid, int h) {
        int merged[] = new int[h - l + 1];
        int i1 = l;
        int i2 = mid + 1;
        int x = 0;
        int y=0;

        while (i1 <= mid && i2 <= h) {
            if (a[i1] <=a[i2]) {
                merged[x++] = a[i1++];

            } else {
                merged[x++] = a[i2++];

            }
            while (i1 <= mid) {
                merged[x++] = a[i1++];

            }
            while (i2 <= h) {
                merged[x++] = a[i2++];
            }
        }
        for( int i=0,j=l; i<merged.length;i++,j++)
        {
            a[j]=merged[i];
        }
    }
}



