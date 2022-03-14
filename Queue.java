package Sham;

import java.util.*;

public class Queue{
		static int[] arr;
		int f=-1;
		int r=-1;
		public Queue()	{
			arr=new int[10];
		}
		
		public Queue(int size)	{
			arr=new int[size];
		}
		
		public int getFirst()	{
			if(f==-1)
				return -1;
			return arr[f];
		}
		public boolean isEmpty()	{
			if(f==-1)
				return true;
			return false;
		}
		public void enqueue(int ele) 	{
			if(r==arr.length-1)
				System.out.println("list is full");
			else {
				if(f==-1)	{
					f=r=0;
					arr[r]=ele;
				}
				else {
					r++;
					arr[r]=ele;
				}
			}
		}
		public int deque()	{
			if(f==-1)	{
				System.out.println("queue is empty");
				return -1;
			}
			else {
				if(f==r)	{
					int temp=f;
					f=r=-1;
					return arr[temp];
				}
				else {
					int temp=r;
					f++;
					return arr[temp];
				}
			}
		}
		public void display()	{
			if(f==-1)	{
				System.out.println("queue is empty");
				return;
			}
			for(int i=f;i<=r;i++)	
				System.out.println(arr[i]);
		}
		public static void main(String args[])	{
			Scanner sc=new Scanner(System.in);
			Queue obj=new Queue(10);
			System.out.println("1.enqueue\n2.deque\n3.display\n4.exit");
			do{
				int op=sc.nextInt();
				switch(op)	{
					case 1:obj.enqueue(sc.nextInt());
						break;
					case 2:obj.deque();
						break;
					case 3:obj.display();
						break;
					case 4:System.exit(0);
				}
			}while(true);
		}
}