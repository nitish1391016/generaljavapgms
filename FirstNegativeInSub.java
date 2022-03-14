package Sham;

import java.util.Scanner;

public class FirstNegativeInSub {
	public static void firstNegative(int[] arr,int k)	{
		Queue list=new Queue(arr.length);
		int i=0;
		int j=0;
		while(j<arr.length)	{
//			System.out.println("hii");
			if(arr[j]<0)
				list.enqueue(arr[j]);
			
			if(j-i+1<k)
				j++;
			else if(j-i+1==k)	{
				if(list.isEmpty())
					System.out.println("-1");
				else {
					System.out.println(list.getFirst());
				}
				if(arr[i]==list.getFirst())
					list.deque();
				i++;
				j++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[sc.nextInt()];//array
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		int k=sc.nextInt();//size of window
		firstNegative(arr,k);

	}

}
