package Arrays2;

import java.util.Arrays;
import java.util.HashMap;
class Solution
{

    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        int count=0;
        int temp[]=Arrays.copyOfRange(nums,0,nums.length+1);
        Arrays.sort(nums);

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            while(nums[i]!=temp[i])
            {
                count++;
                swap(temp,i,map.get(temp[i]));
                break;
            }
        }
        return count;
    }
    static void swap(int temp[],int i,int x)
    {
        int tem=temp[i];
        temp[i]=temp[x];
        temp[x]=tem;
    }

    public static void main(String args[])
    {
        System.setProperty("server.port", "4000");
        Solution ob=new Solution();

        int a[]={2, 8, 5, 4};

        System.out.println(ob.minSwaps(a));


    }



}
