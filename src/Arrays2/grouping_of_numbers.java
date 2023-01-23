package Arrays2;
import java.util.*;

public class grouping_of_numbers {

    int groups(int arr[], int N, int K) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int p = arr[i] % K;
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        int ans = 0;
        if (map.get(0) != 0) {
            ans++;
        }
        for (int i = 1; i <= K / 2; i++) {

            if (i == (K - i)) {
                if (map.get(i) > 0) {
                    ans++;
                }
            } else {
                ans += Math.max(map.get(i), map.get(K - i));
            }


        }
        return ans;

    }
    public static void main(String args[])
    {
        int arr[]={1,7,2,6};
        grouping_of_numbers ob=new  grouping_of_numbers();
        System.out.println(ob.groups(arr,arr.length,8));


    }
}

