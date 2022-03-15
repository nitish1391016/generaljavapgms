package Sham;

import java.util.Scanner;

public class Singly {
	Node start,ptr,preptr;
	public void insert(int data)	{
		if(start==null)	{
			start=new Node(data,null);
		}
		else {
			ptr=start;
			while(ptr.getNext()!=null)
				ptr=ptr.getNext();
			ptr.setNext(new Node(data,null));
		}
	}
	public void insert_begin(int data)	{
		if(start==null)
			insert(data);
		else {
			start=new Node(data,start);
		}
	}
	
	public void insert_end(int val)	{
		if(start==null)	{
			insert(val);
			return;
		}
		ptr=start;
		while(ptr.getNext()!=null)
			ptr=ptr.getNext();
		ptr.setNext(new Node(val,null));
	}
	
	public void display()	{
		if(start==null)
			System.out.println("list is empty");
		else {
			ptr=start;
			while(ptr!=null)	{
				System.out.println(ptr.getVal());
				ptr=ptr.getNext();
			}
		}
	}
	public void insert_par(int val,int ele) throws Exception	{
		preptr=ptr=start;
		while(ptr.getVal()!=ele & ptr.getNext()!=null)	{
			preptr=ptr;
			ptr=ptr.getNext();
		}
		if(ptr.getVal()!=ele)	{
			throw new Exception("element not found!!! insertion failed");
		}
		else {
			preptr.setNext(new Node(val,ptr));
		}
	}
	public static void main(String[] args) throws Exception {
		Singly obj=new Singly();
		System.out.println("1.insert\n2.insert_begin\n3.insert_end\n4.insert_par\n5.display\n6.exit");
		Scanner sc=new Scanner(System.in);		
		do {
			int op=sc.nextInt();
			switch(op)	{
			case 1:obj.insert(sc.nextInt());
				break;
			case 2:obj.insert_begin(sc.nextInt());
				break;
			case 3:obj.insert_end(sc.nextInt());
				break;
			case 4:obj.insert_par(sc.nextInt(),sc.nextInt());
				break;
			case 5:obj.display();
				break;
			case 6:System.exit(0);
			}
		}while(true);
	}

}
