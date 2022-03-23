package Sham;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramCount {
	public	int countOfAnagram(String str,String target)	{
		HashMap<Character,Integer> list=new HashMap<>();
		for(int i=0;i<str.length();i++)	{
			if(list.containsKey(str.charAt(i)))
				list.put(str.charAt(i), list.get(str.charAt(i))+1);
			else
				list.put(str.charAt(i), 1);
		}
		int cnt=list.size();
		int i=0;
		int j=0;
		int result=0;
		while(j<target.length())	{
			if(list.containsKey(target.charAt(j)))	{
				list.put(target.charAt(j), list.get(target.charAt(j))-1);
				if(list.get(target.charAt(j))==0)
					cnt--;
			}
			
			if(j-i+1<str.length())
				j++;
			else if(j-i+1==str.length())	{
				if(cnt==0)
					result++;
				if(list.containsKey(target.charAt(i)))	{
					if(list.get(target.charAt(i))==0)
						cnt++;
					list.put(target.charAt(i), list.get(target.charAt(i))+1);
				}
				i++;
				j++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String target=sc.next();
		AnagramCount obj=new AnagramCount();
		System.out.println(obj.countOfAnagram(str,target));
	}

}
