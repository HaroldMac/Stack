public class Stack<AnyType> {
	
	/**Node Class
	 * Stores data as an object
	 * Creates a pointer to the next node
	 */

	@SuppressWarnings("hiding")
	private class Node<AnyType>{

		private AnyType data;
		private Node<AnyType> next;

		Node(){
			next = null;
		}

		Node(AnyType t){
			data = t;
			next = null;
		}

		//Setter Methods
		public void setNext (Node<AnyType> n){next = n;}

		//Getter Methods
		public Node<AnyType> getNext() {return next;}
		public AnyType getData () {return data;}
	}
	

	private Node<AnyType> head, tail;
	private int length;

	Stack(){
		head = new Node<AnyType>();
		tail = head;
		length = 0;
	}
	
	/**Checks if the first node has a node after it.
	 * If a next node exits, it places the second node after the first, than attaches the other nodes to 
	 * the second. 
	 *If a next node does not exist, it places the second node
	 *after the first node and updates the tail.
	 *Then it increase the length of the list by 1
	 */
	
	private void insertAfter(Node<AnyType> first, Node<AnyType> second){
		first.setNext(second);
		tail = second;
		length++;
	}
	
	/**Returns true if list is empty
	 * 
	 * @return true if list is empty, false otherwise
	 */
	public boolean isEmpty(){
		if (length == 0){
			return true;
		}
		return false;
	}
	
	/**Returns the length of the list.
	 * 
	 * @return length of the list
	 */
	public int length(){
		return length;
	}

	/** Inserts an object at the end of the list
	 * 
	 * @param objToPush Takes object defined by stack<type>
	 */
	public void push(AnyType objToPush){
		if (isEmpty()){
			insertAfter(head, new Node<AnyType>(objToPush));
		} else {
			insertAfter(tail, new Node<AnyType>(objToPush));
		}	
	}
	
	/**Removes object from the front of the list
	 * 
	 * @return the first object on the stack
	 */
	private Node<AnyType> removeFromFront(){
		Node<AnyType> firstElement = head.getNext();
		head.setNext(null);
		length--;
		return firstElement;
	}

	/**Removes object from the end of the list
	 * 
	 * @return the last object on the stack
	 */
	private Node<AnyType> removeFromEnd(){
		Node<AnyType> lastElement = tail;

		Node<AnyType> iterator = head;
		while(iterator.getNext().getNext() != null){
			iterator = iterator.getNext();
		}
		tail = iterator;
		iterator.setNext(null);
		length--;

		return lastElement;
	}
	
	/**Removes and returns an object from the end of the list
	 * 
	 * @return the top element on the stack
	 */
	public AnyType pop(){
		if (isEmpty()){
			throw new IllegalArgumentException("Stack is empty!");
		}
		if (length == 1){
			return (AnyType) removeFromFront().getData();
		} else {
			return (AnyType) removeFromEnd().getData();
		}
	}
}

public class Stack<AnyType> {
	
	/*Node Class
	 * Stores data as an object
	 * Creates a pointer to the next node
	 */

	private class Node<AnyType>{

		private AnyType data;
		private Node<AnyType> next;

		Node(){
			next = null;
		}

		Node(AnyType t){
			data = t;
			next = null;
		}

		//Setter Methods
		public void setNext (Node<AnyType> n){next = n;}

		//Getter Methods
		public Node<AnyType> getNext() {return next;}
		public AnyType getData () {return data;}
	}
	

	private Node<AnyType> head, tail;
	private int length;

	Stack(){
		head = new Node<AnyType>();
		tail = head;
		length = 0;
	}
	
	/*Checks if the first node has a node after it.
	 * If a next node exits, it places the second node after the first, than attaches the other nodes to 
	 * the second. 
	 *If a next node does not exist, it places teh second node
	 *after the first node and updates the tail.
	 *Then it increase the length of the list by 1
	 */
	
	private void insertAfter(Node<AnyType> first, Node<AnyType> second){
		if (first.getNext() == null){
			first.setNext(second);
			tail = second;
		} else  {
			Node<AnyType> nextNode = first.getNext();
			first.setNext(second);
			second.setNext(nextNode);
		}
		length++;
	}
	
	//Returns true if list is empty
	public boolean isEmpty(){
		if (length == 0){
			return true;
		}
		return false;
	}
	
	//Returns the length of the list.
	public int length(){
		return length;
	}

	//Inserts an object at the end of the list
	public void push(AnyType objToPush){
		if (isEmpty()){
			insertAfter(head, new Node<AnyType>(objToPush));
		} else {
			insertAfter(tail, new Node<AnyType>(objToPush));
		}	
	}
	
	//Removes object from the front of the list
	private Node<AnyType> removeFromFront(){
		Node<AnyType> firstElement = head.getNext();
		head.setNext(null);
		length--;
		return firstElement;
	}

	//Removes object from the end of the list
	private Node<AnyType> removeFromEnd(){
		Node<AnyType> lastElement = tail;

		Node<AnyType> iterator = head;
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
	public AnyType pop(){
		if (isEmpty()){
			throw new IllegalArgumentException("Stack is empty!");
		}
		if (length == 1){
			return (AnyType) removeFromFront().getData();
		} else {
			return (AnyType) removeFromEnd().getData();
		}
	}
}
