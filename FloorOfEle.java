package BinarySearch;

import java.util.Scanner;

public class FloorOfEle {
	public static int returnFloor(int[] nums,int ele)	{
		int res=-1;
		int start=0;
		int end=nums.length-1;
		int mid=0;
		while(start<=end)	{
			mid=end+(start-end)/2;
			if(nums[mid]>ele)	{
				res=mid;
				end=mid-1;
			}
			else
				start=mid+1;
			//ceil of ele
//			if(nums[mid]<ele)	{
//				res=nums[mid];
//				start=mid+1;
//			}
//			else {
//				end=mid-1;
//			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr= {1, 2, 8, 10, 10, 12, 19};
		int ele=18;
		System.out.println(returnFloor(arr,ele));
	}

}
