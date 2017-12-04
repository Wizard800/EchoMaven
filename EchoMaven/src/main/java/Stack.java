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
		if (stack.add(expected))
			return expected;
		else
			return "";
		
	}
	

}
