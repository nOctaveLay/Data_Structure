//Test the Singly linked list
public class Test{
	public static void main(String[] args){
		SinglyLinkedList slinkedl = new SinglyLinkedList();
		slinkedl.addFirst(123);
		slinkedl.printlist();
		slinkedl.addFirst(456);
		slinkedl.printlist();
		slinkedl.addLast(888);
		slinkedl.printlist();
		slinkedl.addLast("kkk");
		slinkedl.printlist();
		slinkedl.removeFirst();
		slinkedl.printlist();
	}
}