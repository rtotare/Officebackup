package practice;

import java.util.ArrayList;
import java.util.ListIterator;

public class List {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> al= new ArrayList<String>();
al.add("abc");
al.add("xyz");
al.add("lmn");
al.add("pqr");
System.out.println("2nd number in list : " +al.get(2));
	
System.out.println("Array List is");
	for(String s:al)
	{
		System.out.println(s);
	}
	
// Creating list iterator to traverse element 
	
	ListIterator <String> itr =al.listIterator();
	
	// Traverse element in forward direction 
	System.out.println("Element in forward direction");
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	// Traverse element in Backward direction\
	System.out.println("Element in revese or backword order");
	while(itr.hasPrevious())
	{
		System.out.println(itr.previous());
	}
			
}
}
