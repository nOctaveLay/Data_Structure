public class TestCircularly{
	public static void main(String[] args){
		CircularlyLinkedList circular = new CircularlyLinkedList();
		circular.addFirst(123);
		circular.printlist();
		circular.addFirst(456);
		circular.printlist();
		circular.addLast(888);
		circular.printlist();
		circular.addLast("kkk");
		circular.printlist();
		circular.removeFirst();
		circular.printlist();

	} 
}