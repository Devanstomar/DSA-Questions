package Arrays2;

public class out extends Thread {
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            System.out.print(++i);
        }
    }

    public static void main(String args[])
    {
        out t=new out();
        t.run();
    }
}
