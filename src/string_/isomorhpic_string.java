package string_;

import java.util.HashMap;
import java.util.Scanner;

public class isomorhpic_string {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        isomorhpic_string ob=new isomorhpic_string();

        boolean sb=ob.isomorphic(str1,str2);
        System.out.println(sb);


    }

    boolean isomorphic(String str1, String str2) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Boolean> map2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);


            if (map1.containsKey(ch1) == true) {
                if (map1.get(ch1) != ch2) {
                    return false;
                }} else {
                    if (map2.containsKey(ch2) == true) {
                        return false;
                    } else {
                        map1.put(ch1, ch2);
                        map2.put(ch2, true);


                    }

                }
            }
        return true;


    }
}

