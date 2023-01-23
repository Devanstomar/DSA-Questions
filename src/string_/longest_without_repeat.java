package string_;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class longest_without_repeat {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        int longest = 0;
        char c;
        char ch[] = s.toCharArray();
        String longestsubstring = null;
        for (int i = 0; i < ch.length; i++) {
            c = s.charAt(i);
            if (map.containsKey(c) == false) {
                map.put(c, i);

            } else {
                i = map.get(c);
                map.clear();
            }
            if (map.size() > longest) {

                longest = map.size();
                longestsubstring = map.keySet().toString();
            }
        }
        System.out.println(longest);
        System.out.println(longestsubstring);


    }
}
