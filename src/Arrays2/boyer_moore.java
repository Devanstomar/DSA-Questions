package Arrays2;

public class boyer_moore {

    public static void main(String args[])
    {
        int a[]={5,1,1,4,1};
        boyer_moore ob =new boyer_moore();
        ob.majority(a);

    }

    void majority(int a[])
    {
        int c=1;
       int  element=0;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]==a[element])
            {
                c++;
            }
            else
            {
                c--;
            }
            if(c==0)
            {
                element=i;
                int count=1;

            }


        }
    }


}
