package LinkedList;

import java.util.Scanner;

public class CircularSingly {
	private Node start,ptr,preptr;
	
	public Node getStart() {
		return start;
	}
	public void insert(int ele) {//normal insertion 
		if(start==null) {//first time of insertion
			start=new Node(ele);
			start.setNext(start);
		}
		else {//other than first
			ptr=start;
			while(ptr.getNext()!=start)//moving to last node
				ptr=ptr.getNext();
			ptr.setNext(new Node(ele,start));//set next node of last node as start
		}
	}
	public void insert_begin(int ele)	{//insert begin
		if(start==null) {//if list is empty
			start=new Node(ele,null);
		}
		else
			ptr=start;
			while(ptr.getNext()!=start)//moving to last node
				ptr=ptr.getNext();
			start=new Node(ele,start);//changing next node of last node as start
			ptr.setNext(start);
	}
	
	public void insert_end(int ele)	{
		if(start==null) {//if list is empty
			start=new Node(ele,null);
		}
		else {//if list not empty
			ptr=start;
			while(ptr.getNext()!=start)//moving to last node
				ptr=ptr.getNext();
			ptr.setNext(new Node(ele,start));//next field as start address
		}
	}
	public void insert_par(int par,int ele) throws Exception	{
		if(start==null)	{//list is empty then
			throw new Exception("list is empty!!!!");//Exception thrown
		}
		if(start.getVal()==par)	{//if par is first element
			insert_begin(ele);
			return;
		}
		preptr=ptr=start;//else than
		while(ptr.getVal()!=par && ptr.getNext()!=null) {
			preptr=ptr;
			ptr=ptr.getNext();
		}
		if(ptr.getVal()!=par)
			throw new Exception("element  not found!!!");
		preptr.setNext(new Node(ele,ptr));
	}
	
	public void delete_begin() throws Exception	{
		if(start==null) {
			throw new Exception("list is empty!!!");
		}
		if(start.getNext()==start) {//if only one element present
			start=null;
			return;
		}
		ptr=start;//else then
		while(ptr.getNext()!=start)
			ptr=ptr.getNext();
		start=start.getNext();
		ptr.setNext(start);
	}
	public void delete_end() throws Exception	{
		if(start==null) {
			throw new Exception("list is empty!!!");
		}
		else {
			preptr=ptr=start;
			while(ptr.getNext()!=start){//moving to last node
				preptr=ptr;
				ptr=ptr.getNext();
			}
			preptr.setNext(start);//makind before node of last node next field as start
		}
	}
	public void display() throws Exception {
		if(start==null)
			throw new Exception("list is empty");
		ptr=start;
		do{//as start itself is start do--while is used
			System.out.println(ptr.getVal());
			ptr=ptr.getNext();
		}while(ptr!=start);
	}
	public int count() {
		if(start==null)
			return 0;
		else {
			ptr=start;
			int count=0;
			do{
				count++;//same as display()
				ptr=ptr.getNext();
			}while(ptr!=start);
			return count;
		}
	}
	public void delete_par(int par) throws Exception {
		if(start==null) {
			throw new Exception("list is empty!!!");
		}
		else {
			if(start.getVal()==par)	{
				delete_begin();//if first is part element than....
				return;
			}
			preptr=ptr=start;//else then from here....
			while(ptr.getVal()!=par && ptr.getNext()!=start) {
				preptr=ptr;
				ptr=ptr.getNext();
			}
			if(ptr.getVal()!=par) {
				throw new Exception("element not found!!!");
			}
			else {
					preptr.setNext(ptr.getNext());
			}
		}
	}
	public boolean isEmpty()	{
		if(start==null)
			return true;
		return false;
	}
//	public static void main(String[] args) throws Exception {
//		try (Scanner sc = new Scanner(System.in)) {
//			CircularSingly obj=new CircularSingly();
//			System.out.println("1.insert\n2.insert_begin\n3.insert_end\n4.insert_par\n5.delete_begin\n6.delete_end\n7.delete_par\n8.display\n9.count\n10.isEmpty\n11.exit");
//			do {
//				int op=sc.nextInt();
//				switch(op)	{
//				case 1:obj.insert(sc.nextInt());
//					break;
//				case 2:obj.insert_begin(sc.nextInt());
//					break;
//				case 3:obj.insert_end(sc.nextInt());
//					break;
//				case 4:obj.insert_par(sc.nextInt(), sc.nextInt());
//					break;
//				case 5:obj.delete_begin();
//					break;
//				case 6:obj.delete_end();
//					break;
//				case 7:obj.delete_par(sc.nextInt());
//					break;
//				case 8:obj.display();
//					break;
//				case 9:System.out.println(obj.count());
//					break;
//				case 10:System.out.println(obj.isEmpty());
//					break;
//				case 11:System.exit(0);
//				}			
//			}while(true);
//		}
//
//	}
//
}

//class Node {
//	private int val;
//	private Node next;
//	
//	
//	public Node(int val)	{
//		this.val=val;
//	}
//	
//	public Node(Node next) {
//		this.next=next;
//	}
//	
//	public Node(int val,Node next)	{
//		this.val=val;
//		this.next=next;
//	}
//	
//	public int getVal() {
//		return val;
//	}
//	
//	public void setVal(int val) {
//		this.val = val;
//	}
//	public Node getNext() {
//		return next;
//	}
//	
//	public void setNext(Node next) {
//		this.next = next;
//	}
//}
//
//
//
