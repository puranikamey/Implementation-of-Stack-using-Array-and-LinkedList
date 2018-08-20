package linkedlist_impele;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStack {
	
	private LinkedList<Employee> Llist;
	
	public LinkedListStack() {
		Llist = new LinkedList<>();
		
	}
	
	public void push(Employee employee) {
		Llist.push(employee);
		
	}
	
	
	public Employee pop() {
		return Llist.pop();
		
	}
	
	public Employee peek() {
		return Llist.peek();
		
	}

	public boolean isEmpty() {
		
		return Llist.isEmpty();
		
	}
	
	public void printstack() {
		
		ListIterator<Employee> itr = Llist.listIterator();
		while(itr.hasNext()) 
		{
			
			System.out.println(itr.next());
		}
	}
	 
}
