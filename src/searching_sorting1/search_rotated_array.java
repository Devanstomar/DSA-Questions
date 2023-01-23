package searching_sorting1;

class Solution {
    public static void main(String args[])
    {
        Solution ob =new Solution();
        int nums[]={4,5,6,7,0,1,2};
        int value=0;
        System.out.println(ob.search( nums, value));
    }
    public int search(int[] nums, int target) {

        int pivot=get_pivot(nums);
        if(target>=nums[pivot] && target<=nums[nums.length-1])
        {

            return binary_search(nums,pivot,nums.length-1,target);
        }
        else
        {
            return binary_search(nums,0,pivot-1,target);
        }

    }

    int get_pivot(int nums[])
    {
        int s=0;
        int e=nums.length-1;
        int mid=s+(e-s)/2;
        while(s<e)
        {
            if(nums[mid]>=nums[0])
            {
                s=mid+1;
            }
            else
            {
                e=mid;
            }
            mid=s+(e-s)/2;

        }
        return s;



    }

    int binary_search(int nums[],int s,int e,int key)
    {
        int  mid=s+(e-s)/2;

        while(s<=e)
        {
            if(nums[mid]==key)
            {
                return mid;

            }
            else if(key>nums[mid])
            {
                s=mid+1;

            }
            else
            {
                e=mid-1;
            }
            mid=s+(e-s)/2;

        }
        return -1;
    }

}
