package com.packages;

public class min_merge_operation {
    static int merge(int a[]) {
        int i = 0;
        int j = a.length - 1;
        int ans = 0;
        while (i < j) {
            if (a[i] == a[j]) {
                i++;
                j--;
                ans++;

            } else if (a[i] < a[j]) {
                i++;
                a[i] += a[i - 1];

            } else if (a[j] < a[i]) {
                j--;
                a[j] += a[j + 1];

            }

        }
        return ans;
    }

    public static void main(String args[]) {
        int a[] = {6, 1, 4, 3, 1, 7};
        int z = merge(a);
        System.out.print(z);


    }
}
