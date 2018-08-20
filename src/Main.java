
public class Main {

	public static void main(String[] args) {
	
		
		Arrayclass stack = new Arrayclass(10);
		stack.push(new Employee("Amey", "puranik", 12343));
		stack.push(new Employee("Ant", "Marry", 45543));
		stack.push(new Employee("Johny", "Dep", 3432));
		stack.push(new Employee("Carel", "John", 12343));
		stack.push(new Employee("Amy", "White", 2345343));
		
		stack.printstack();
		stack.pop();
		System.out.println(stack.peek());
		

	}

}
