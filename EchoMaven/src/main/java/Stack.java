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
		stack.add(0,expected);
		return expected;

		
	}
	public String pop() {
		// TODO Auto-generated method stub
		return stack.remove(0).toString();
	}
	

}
