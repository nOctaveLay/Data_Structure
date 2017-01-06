public class DoublyLinkedList<E> {
	private static class Node<E>{
		private E element;
		private Node<E> prev;
		private Node<E> next;
		public Node(E e, Node<E> p, Node<E> n){
			element = e;
			prev = p;
			next = n;
		}
		public E getElement() {return element;}
		public Node<E> getPrev() {return prev;}
		public Node<E> getNext() {return next;}
		public void setPrev(Node<E> p) {prev = p;}
		public void setNext(Node<E> n) {next = n;}
	}

	private Node<E> head;
	public Node<E> tail;
	private int size = 0;
	public DoublyLinkedList(){
		head = new Node<>(null,null,null);
		tail = new Node<>(null, head, null);
		head.setNext(trailer);
	}
	public int size(){return size;}
	public boolean isEmpty(){return size == 0;}
	public E first(){
		if (isEmpty()) return null;
		return head.getNext().getElement();
	}
	public E last(){
		if (isEmpty()) return null;
		return tail.getPrev().getElement();
	}

	public void addFirst(E e){
		addBetween(e, head, head.getNext());
	}
	public void addLast(E e){
		addBetween(e, tail.getPrev(),tail);
	}
	public E removeFirst(){
		if (isEmpty()) return null;
		return remove(head.getNext());
	}
	public E removeLast(){
		if (isEmpty()) return null;
		return remove(tail.getPrev());
	}
	private void addBetween(E e,Node<E> predecessor, Node<E> successor){
		Node<E> newest = new Node<>(e, predecessor, successor);
		predecessor.setNext(newest);
		successor.setPrev(newest);
		size++;
	}
	private E remove(Node<E> node) {
		Node<E> predecessor = node.getPrev();
		Node<E> successor = node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		return node.getElement();
	}
}