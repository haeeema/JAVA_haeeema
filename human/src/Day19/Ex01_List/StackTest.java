package Day19.Ex01_List;

import java.util.Stack;

/**
 *	LIFO(Last In First Out) 
**/

public class StackTest {
	public static void main(String[] args) {
		Stack s = new Stack();
		
		s.push("Hong");
		s.push("Lee");
		s.push(new Integer(111));
		s.push(new MyStudent());
		
		while( !s.isEmpty()) {
			System.out.println(s.pop());
		}
	}
}
