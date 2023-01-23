package searching_sorting1;

public class base_equivalence {
    String baseEquiv(int n, int m) {

        int low = 2;
        int high = 32;
        int mid = (low + high)/ 2;
        while (low <= high) {

            if (digit(n, mid) == m)
                return "yes";
            else if (digit(n, mid) < m)
                high = mid - 1;
            else
                low = mid + 1;

            mid = (low + high)/ 2;
        }
        return "no";
    }

    int digit(int n1, int mid1) {
        int count = 0;
        while (n1!=0) {
            count++;
            n1 = n1 / mid1;
        }
        return count;

    }
        public static void main (String args[])
        {
            base_equivalence ob = new base_equivalence();
            System.out.println(ob.baseEquiv(8, 2));
        }


    }
