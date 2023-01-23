package string_;
import java.util.Scanner;
public class allsubstrings {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        int i, j, c = 0;
        String s;
        for (i = 0; i < str.length(); i++) {
            for (j = i + 1; j <= str.length(); j++) {
                s = str.substring(i, j);
                System.out.println(s);

            }
        }

    }}
