
import java.util.Scanner;

public class StackWithArray {
	static int[] arr;
	private int top=-1;
	
	public StackWithArray()	{
		arr =new int[10];
	}
	
	public StackWithArray(int ele)	{
		arr=new int[ele];
	}
	public void displayElementsOfStack()	{
		for(int i=0;i<=top;i++)
			System.out.println(arr[i]);
	}
	public void push(int ele) throws Exception	{
		if(top>=arr.length-1)
			throw new Exception("stack is full");
		else {
			arr[++top]=ele;
		}
	}
	
	public int pop() throws Exception	{
		if(top==-1) {
			throw new Exception("Stack is empty");
		}
			return arr[top--];
	}
	
	public boolean empty() {
		if(top==-1)
			return true;
		return false;
	}
	
	public int peek() throws Exception	{
		if(top==-1)	{
			throw new Exception("stack is empty");
		}
		else
			return arr[top];
	}
	
	/*public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		StackWithArray obj=new StackWithArray(3);
		System.out.println("1.push\n2.pop\n3.isempty\n4.top\n5.checkTopValue\n");
		do {
			int op=sc.nextInt();
			switch(op)	{
				case 1:obj.push(sc.nextInt());
					break;
				case 2:System.out.println(obj.pop());
					break;
				case 3:System.out.println(obj.isEmpty());
					break;
				case 4:System.out.println(obj.top());	
					break;
				case 5:System.out.println(obj.checkTopValue());
					break;
				case 6:obj.displayElementsOfStack();
			}
		}while(true);
		
	}*/
}
