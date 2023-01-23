package com.packages;

public class dutch_national_flag {
    void sort012(int a[], int n)
    {
        int low=0;    // code here int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high)
        {
            if(a[mid]==0)
            {
                swap(a,mid,low);
                low++;
                mid++;
            }
            else if(a[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(a,mid,high);
                high--;
            }
        }

    }
    void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void main(String args [])
    {
        int a[]={0,1,2,1,0};
        int n=a.length;
        dutch_national_flag ob=new dutch_national_flag();
        ob.sort012(a, n);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }



}
