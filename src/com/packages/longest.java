package com.packages;

public class longest {
    public static void main(String args[]) {
        int c = 0, i, j, long_length = 0, temp;
        int a[] = { 1, 9, 3, 10, 4, 20, 2 };
        int n = a.length;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }


        }
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        for (i = 0; i < n; i++) {
            if (i == n - 1) {
                break;
            }
            if (a[i] == a[i + 1] - 1) {
                c++;
            } else if (long_length < c) {
                long_length = c;
                c = 0;

            }
        }

            System.out.print(long_length);

        }
    }



