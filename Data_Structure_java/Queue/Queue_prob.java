
public class Queue_prob {
	private Node front;
	private Node back;
	
	private class Node{
		private int data;
		private Node next;
		Node(int data){
			this.data = data;
		}
	}
	public Queue_prob() {
		front = null;
		back = null;
	}

	public void enqueue(int data){
		if (back == null){
			front = new Node(data);
			back = new Node(data);
		}
		else{
			Node temp = new Node(data);
			temp.next = back;
			back = temp;
		}
	}

	public Node dequeue(){
		if (isEmpty()){
			System.out.println("Empty");
		}else{
			Node newnode = back;
			while (newnode.next.next !=null){
				newnode = newnode.next;
			}
			front = newnode;
			newnode.next = null;
		}
		return null;
	}

	public void printQueue(){
		if (isEmpty()){
			System.out.println("Empty");
		}
		else{
		Node temp = back;
		while (temp != null){
			System.out.print(temp.data+"\t");
			temp = temp.next;
		}
		System.out.println("");
		}
	}

	public boolean isEmpty(){
		if(front == null){
			return true;
		} else {
			return false;
		}
	}

}
