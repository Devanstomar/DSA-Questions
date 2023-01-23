package com.packages;
import java.util.Scanner;


public class stringbuild {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.setCharAt(i, Character.toUpperCase(ch));
            } else if (ch >= 'A' && ch <= 'Z') {
                sb.setCharAt(i, Character.toLowerCase(ch));

            }


        }
        System.out.println(sb);
    }
}