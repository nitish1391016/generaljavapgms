class Solution {//number of times rotated || min ele in rotated sorted array
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=-1;
        int prev=0;
        int next=0;
        int n=nums.length;
        while(start<=end)   {
            mid=end+(start-end)/2;
            prev=(mid+n-1)%n;
            next=(mid+1)%n;
            if(nums[mid]<=nums[prev] && nums[mid]<=nums[next])
                return nums[mid];
            else if(nums[mid]>nums[n-1])
                start=mid+1;
            else 
                end=mid-1;
        }
        return mid;
    }
}
