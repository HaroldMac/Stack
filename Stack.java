public class Stack {

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
	private void increaseLength(){
		length++;
	}
	private void decreaseLength(){
		length--;
	}
	
	public boolean isEmpty(){
		if (length == 0){
			return true;
		}
		return false;
	}
	
	public int length(){
		return length;
	}
	
	private void addToFront(Node node){
		if (isEmpty()){
			head.setNext(node);
			tail = node;
			increaseLength();
		}
	}
	
	private void addToEnd(Node node){
			tail.setNext(node);
			tail = tail.getNext();
			increaseLength();
	}
	
	
	public void push(int objToPush){
		if (isEmpty()){
			addToFront(new Node(objToPush));
		} else {
			addToEnd(new Node(objToPush));
		}	
	}
	
	private Node removeFromFront(){
		Node firstElement = head.getNext();
		head.setNext(null);
		decreaseLength();
		return firstElement;
	}
	
	private Node removeFromEnd(){
		Node lastElement = tail;

		Node iterator = head;
		while(iterator.getNext().getNext() != null){
			iterator = iterator.getNext();
		}
		tail = iterator;
		iterator.setNext(null);
		decreaseLength();

		return lastElement;
	}
	
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
