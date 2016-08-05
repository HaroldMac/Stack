public class Stack {
	
	/*Node Class
	 * Stores data as an object
	 * Creates a pointer to the next node
	 */
	private class Node{

		private Object object;
		private Node next;

		Node (){
			next = null;
		}

		Node(Object obj){
			object = obj;
			next = null;
		}

		//Setter Methods
		public void setNext (Node n){next = n;}

		//Getter Methods
		public Node getNext() {return next;}
		public Object getObject () {return object;}
	}
	
	private Node head, tail;
	private int length;

	Stack(){
		head = new Node();
		tail = head;
		length = 0;
	}
	
	//Inserts the second object after the first
	private void insertAfter(Node first, Node second){
		first.setNext(second);
		tail = second;
		length++;
	}
	
	//Returns true if list is empty
	public boolean isEmpty(){
		if (length == 0){
			return true;
		}
		return false;
	}
	
	public int length(){
		return length;
	}

	//Inserts an object at the end of the list
	public void push(int objToPush){
		if (isEmpty()){
			insertAfter(head, new Node(objToPush));
		} else {
			insertAfter(tail, new Node(objToPush));
		}	
	}
	
	//Removes object from the front of the list
	private Node removeFromFront(){
		Node firstElement = head.getNext();
		head.setNext(null);
		length--;
		return firstElement;
	}

	//Removes object from the end of the list
	private Node removeFromEnd(){
		Node lastElement = tail;

		Node iterator = head;
		while(iterator.getNext().getNext() != null){
			iterator = iterator.getNext();
		}
		tail = iterator;
		iterator.setNext(null);
		length--;

		return lastElement;
	}
	
	//Removes and returns an object from the end of 
	//the list
	public Object pop(){
		if (isEmpty()){
			throw new IllegalArgumentException("Stack is empty!");
		}
		if (length == 1){
			return removeFromFront().getObject();
		} else {
			return removeFromEnd().getObject();
		}
	}		
}
