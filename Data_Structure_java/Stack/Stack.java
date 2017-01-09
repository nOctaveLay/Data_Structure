public interface Stack<E>{
	// return stack's size
	int size();
	// is Empty?
	boolean isEmpty();
	//insert
	void push(E e);
	//return but does not remove
	E top();
	//remove & return
	E pop();
}