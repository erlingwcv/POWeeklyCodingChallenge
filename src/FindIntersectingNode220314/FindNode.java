package FindIntersectingNode220314;

import java.util.Stack;

/*
 * Weekly Coding Challenge:
Pls provide the link to your solution in the comments section not later than Friday morning.

1) Given two singly linked lists that intersect at some point, find the intersecting node. Assume the lists are non-cyclical.

For example, given A = 3 ➔ 7 ➔ 8 ➔ 10 and B = 99 ➔ 1 ➔ 8 ➔ 10, return the node with value 8. In this example, assume nodes with the same value are the exact same node objects.

Do this in 0( m + n) time (where m and n are the lengths of the lists) and constant space.

2) Implement a stack that has the following methods:
• push ( v a 1 ) : push v a 1 onto the stack
• pop: pop off and return the topmost element of the stack. If there are no elements in the stack, throw an error.
• max: return the maximum value in the stack currently. If there are no elements in the stack, throw an error.

Each method should run in constant time.
 * 
 * 
 */


public class FindNode {

	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String theNode = "";
		
		
		
		
		Stack<String> linkedListA = new Stack<>();
		
		Stack<String> linkedListB = new Stack<>();
		
		linkedListA.push("3");
		linkedListA.push("7");
		linkedListA.push("8");
		linkedListA.push("10");
		
		System.out.println(linkedListA);
		
		
		linkedListB.push("11");
		linkedListB.push("8");
		linkedListB.push("1");
		linkedListB.push("3");
		
		System.out.println(linkedListB);
		
		theNode = find(linkedListA, linkedListB);
		
		System.out.println("The result is "+ theNode );
	}
	
		public static String find(Stack x, Stack y) {
		
		for (int i= 0; i<x.size(); i++) {
		
		Object itemOfA = x.pop();
		System.out.println(itemOfA);
		System.out.println("linkedListA x size now is "+x.size());
		
		boolean found = y.contains(itemOfA);
		
		try {
		if (found) {
			
			return itemOfA.toString();
		} 
		
		System.out.println(found);
		
		} catch (Exception e) {
			
			e.getLocalizedMessage();
		}

	}
		return "Intercepting Node Not Found";

 }

}		