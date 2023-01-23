package string_;
import java.util.*;
public class Minimum_character_to_form_palindrome {

    public static void main(String[] args) {
        int c = 0;
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        while (s.length()> 0) {
            if (palindrome(s, 0, s.length()-1) == true) {
                System.out.println("palindromic string");
                flag=1;
                break;
            } else {
                c++;
            }
            s = s.substring(0, s.length() - 1);
        }

        if (flag==1) {
            System.out.println(c);
        }

    }

    static boolean palindrome(String s1, int l, int r) {

        if (l >= r) {
            return true;
        }
        if (s1.charAt(l) != s1.charAt(r)) {
            return false;
        }
        return palindrome(s1, l + 1, r - 1);


    }
}


