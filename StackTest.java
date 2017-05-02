import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackTest {
	
	//private Stack stack;
	
	@Before
	public void setup(){
		
	}
	@Test  (expected = IllegalArgumentException.class)
	public void testPopAnEmptyStack() {     
		 Stack<String> aStack = new Stack<String>(); 
		 aStack.pop();
	 }
	
	@Test  (expected = IllegalArgumentException.class)
	public void testPushAndPopAnEmptyStack() {     
		 Stack<String> aStack = new Stack<String>();
		 aStack.push("item 1");
		 aStack.push("item 2");
		 aStack.pop();
		 aStack.pop();
		 aStack.pop();
	 }

	 @Test   
	 public void testPushAndPopAString() {     
		 Stack<String> aStack = new Stack<String>(); 
		 String result = "Hello World";    
		 aStack.push(result);
		 assertEquals(result, aStack.pop());   
	 }
	
	 @Test   
	 public void testPushAndPopAInt() {     
		 Stack<Integer> aStack = new Stack<Integer>(); 
		 Integer result = 36;    
		 aStack.push(result);
		 assertEquals(result, aStack.pop());   
	 }

	 @Test   
	 public void testPush2StringsAndPop2Strings() {     
		 Stack<String> aStack = new Stack<String>(); 
		 String result1 = "Hello World";
		 String result2 = "Good-Bye Cruel World";
		 aStack.push(result1);
		 aStack.push(result2);
		 assertEquals(result2, aStack.pop());
		 assertEquals(result1, aStack.pop());
	 }


	 @Test   
	 public void testLengthIsZero() {     
		 Stack<String> aStack = new Stack<String>(); 
		 assertEquals(0, aStack.length());
	 }

	 @Test   
	 public void testLengthIsGreaterThanZero() {     
		 Stack<String> aStack = new Stack<String>();
		 aStack.push("1");
		 aStack.push("2");
		 aStack.push("3");
		 aStack.push("4");
		 aStack.push("5");
		 assertEquals(5, aStack.length());
	 }

	

}
