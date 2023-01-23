package heaps;


    // Java program to find the K-th
// largest sum of subarray
import java.util.*;

    class KthLargest {

        // function to calculate Kth largest
        // element in contiguous subarray sum
        static int kthLargestSum(int arr[], int N, int K)
        {
            // array to store prefix sums
            int sum[] = new int[N + 1];
            sum[0] = 0;
            sum[1] = arr[0];
            for (int i = 2; i <= N; i++)
                sum[i] = sum[i - 1] + arr[i - 1];
            int x=0;
            // priority_queue of min heap
            PriorityQueue<Integer> Q
                    = new PriorityQueue<Integer>();

            // loop to calculate the contiguous subarray
            // sum position-wise
            for (int i = 0; i <N; i++) {
                x=arr[i];
                // loop to traverse all positions that
                // form contiguous subarray
                for (int j = i; j <N; j++) {
                    // calculates the contiguous subarray
                    // sum from j to i index
                    if(j==i)
                    {
                        x=arr[i];
                    }
                    else
                    {
                        x+=arr[j];
                    }
                    // if queue has less then k elements,
                    // then simply push it
                    if (Q.size() < K)
                        Q.add(x);

                    else {
                        // it the min heap has equal to
                        // k elements then just check
                        // if the largest kth element is
                        // smaller than x then insert
                        // else its of no use
                        if (Q.peek() < x) {
                            Q.poll();
                            Q.add(x);
                        }
                    }
                }
            }

            // the top element will be then kth
            // largest element
            return Q.poll();
        }

        // Driver's Code
        public static void main(String[] args)
        {
            int a[] = new int[] { 10, -10,30, 20, -40 };
            int N = a.length;
            int K = 6;

            // Function call
            System.out.println(kthLargestSum(a, N, K));
        }
    }

    /* This code is contributed by Danish Kaleem */


