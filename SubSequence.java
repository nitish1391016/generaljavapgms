package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubSequence {
	public static void printSubSequence(int ind ,int sum,int[] arr,List<Integer> list,int k)	{
		if(ind==arr.length) {
			if(sum%k==0 && list.size()!=0)
				System.out.println(list);
			return;
		}
		sum+=arr[ind];
		list.add(arr[ind]);
		printSubSequence(ind+1,sum,arr,list,k);
		sum-=arr[ind];
		list.remove(list.get(list.size()-1));
		printSubSequence(ind+1,sum,arr,list,k);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println("enter divisor??");
		int k=sc.nextInt();
		printSubSequence(0,0,arr,new ArrayList<>(),k);
	}
}
