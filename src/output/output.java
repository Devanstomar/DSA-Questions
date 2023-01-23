package output;
import java.util.*;

class Question2
{
    static int b=1;
}
 class Question extends Question2{
    static  int b=2;
}

 class answer extends Question{
     static int b=20;
}
public class output extends answer
        {
public static void main(String args[])
        {
            int b=100;
            System.out.println(answer.b);
            System.out.println(b+Question2.b);


        }
        }
