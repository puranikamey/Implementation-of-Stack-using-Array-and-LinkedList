package linkedlist_impele;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee amep= new Employee("Amey", "puranik", 12343);
		Employee ant= new Employee("Ant", "Marry", 45543);
		Employee   johnp= new Employee("Johny", "Dep", 3432);
		Employee Carael = new Employee("Carel", "John", 12343);
		Employee Amy= new Employee("Amy", "White", 2345343);
		
		LinkedListStack stack = new LinkedListStack();
		stack.push(amep);
		stack.push(ant);
		stack.push(johnp);
		stack.push(Carael);
		stack.push(Amy);
			
		stack.printstack();
		stack.pop();
		stack.peek();
		

	}

}
