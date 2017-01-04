public class CircularlyLinkedList<E> {
	private Node <E> tail = null;
	private int size = 0;
	public CircularlyLinkedList() {}

	//access method
	public int size() {return size;}
	public boolean isEmpty() {return size == 0;}
	public E first() {
		if (isEmpty()) return null;
		else return tail.getNext().getElement();
	}
	public E last() {
		if (isEmpty()) return null;
		else return tail.getElement();
	}

	public void rotate(){
		if (tail != null) tail = tail.getNext();
	}
	public void addFirst(E e){
		if (size == 0) {
			tail = new Node<>(e,null);
			tail.setNext(tail);
		}
		else{
			Node<E> newest = new Node<>(e,tail.getNext());
			tail.setNext(newest);
		}
		size ++;
	}
	public void addLast(E e){
		addFirst(e);
		tail = tail.getNext();
	}
	public E removeFirst(){
		if (isEmpty()) return null;
		Node<E> head = tail.getNext();
		if (head == tail) tail = null;
		else tail.setNext(head.getNext());
		size --;
		return head.getElement();
	}

	public void printlist(){
		Node <E> temp = tail;
		System.out.print("Head: ");
		while (temp.getNext() != tail){
			temp = temp.getNext();
			System.out.print(temp.getElement()+" ");
		}
		System.out.print("Tail: "+temp.getNext().getElement());
		System.out.println();
	}
}