public class SinglyLinkedList<E>{
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	public SinglyLinkedList(){} //constructs an initially empty list
	//access methods
	public int size() {return size;}
	public boolean isEmpty() {return size == 0;}
	public E first(){
		if (isEmpty()) return null;
		else return head.getElement();
	}
	public E last(){
		if (isEmpty()) return null;
		else return tail.getElement();
	}

	//update method
	public void addFirst(E e){
		head = new Node<>(e,head); //create and link a new node
		if (size == 0) tail = head;
		size++;
	}

	public void addLast(E e){
		Node<E> newest = new Node<>(e,null);
		if (isEmpty()) head = newest;
		else tail.setNext(newest);
		tail = newest;
		size ++;
	}

	public E removeFirst() {
		if (isEmpty()) return null;
		E answer = head.getElement();
		head = head.getNext();
		size--;
		if (size == 0) tail = null;
		return answer;
	}

	public void printlist(){
		Node<E> search = head;
		while (search != null){
			if (search == tail) {System.out.println(search.getElement());}
			else System.out.print(search.getElement()+"->");
			search = search.getNext();
		}
	}
}