import java.util.EmptyStackException;

public class Arrayclass {
	private Employee [] stack;
	private int top;

	
	public Arrayclass(int capacity) {
		
		stack=new Employee[capacity];	
		
	}
	
	public void push(Employee employee) {
		
		if(top==stack.length) {
		
			Employee[] newstack = new Employee[2 * stack.length];    // O(N)
			System.arraycopy(stack, 0, newstack, 0, stack.length);
			stack=newstack;		
		}
		stack[top++]=employee; //O(1)	
		
	}
	
	public Employee pop() {
		
		if (isEmpty()) {
			
			throw new EmptyStackException();	
		}
		Employee employee = stack[--top];
		stack[top]=  null;
		return employee;
		
	}
	
	public Employee peek() {
		
         if (isEmpty()) {
			
			throw new EmptyStackException();
			
		}
         return stack[top-1];
		
		
	}
	
	
	public int size() {
		return top;
		
	}
	
public boolean isEmpty() {
		
		return top==0;
		
	}

public void printstack() {
	
	for(int i = top-1; i>=0; i--) {
		
		System.out.println(stack[i]);
		
	}
}


	
}
