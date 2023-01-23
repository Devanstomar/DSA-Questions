package Arrays2;

//o(n) time & o(1) space
public class rotatearray_ksteps {

    static void reverse(int a[], int l, int h)
    {

        while(l<h)
        {
            int temp=a[l];
            a[l]=a[h];
            a[h]=temp;
            l++;
            h--;
        }
    }

    static void rotate(int a[],int k)
    {
         k=k%a.length;
        if(k<0)
        {
            k=k+a.length;

        }

        reverse(a,0,a.length-k-1);
        reverse(a,a.length-k,a.length-1);
        reverse(a,0,a.length-1);
    }

    public static void main(String args[])
    {
        int a[]={2,3,4,5,6,7};
        int k=-3;
        rotatearray_ksteps ob=new rotatearray_ksteps();
        ob.rotate(a,k);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }

    }
}
