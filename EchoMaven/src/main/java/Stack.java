import java.util.ArrayList;

public class Stack {
ArrayList<String> stack;
	public Stack() {
		stack = new ArrayList<String>();
	}
	public Boolean isEmpty() {
		// TODO Auto-generated method stub
		return stack.isEmpty();
	}

	public String push(String expected) {
		// TODO Auto-generated method stub
		stack.add(expected);
		return expected;

		
	}
	public String pop() {
		// TODO Auto-generated method stub
		return stack.get(0);
	}
	

}
