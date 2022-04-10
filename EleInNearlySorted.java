package BinarySearch;

import java.util.Scanner;

public class EleInNearlySorted {
	public static int returnIndex(int[] nums,int ele)	{
		int start=0;
		int end=nums.length-1;
		int mid=0;
		while(start<=end)	{
			mid=end+(start-end)/2;
			if(nums[mid]==ele)	
				return mid;
			if(mid-1>=start && nums[mid-1]==ele)
				return mid-1;
			if(mid+1<=end && nums[mid+1]==ele)
				return mid+1;
			if(ele<nums[mid])
				end=mid-2;
			else
				start=mid+2;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr= {10, 3, 40, 20, 50, 80, 70};
//		for(int i=0;i<arr.length;i++)	arr[i]=sc.nextInt();
		System.out.println(returnIndex(arr,sc.nextInt()));
	}

}
