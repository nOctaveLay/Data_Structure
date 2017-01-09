public class StackSimple {       
    private Node top; 
    private int size = 0;
    private class Node {
        private String data;
        private Node next;
        Node(String data){
        	this.data = data;
        }
    }
    
    // Constructor (생성자)
    public Stack() {
        top = null;
    }

    /*
     * Stack 안에 있는 elements 의 개수를 반환한다.
     */
    public int size(){
        return size;
    }

    /*
     * Stack이 비어있는지를 반환한다.
     */
    public boolean isEmpty(){
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Stack의 top 자리에 data를 가지는 Node를 삽입한다.
     */
    public void push(String data){
        Node newnode = new Node(data);
        if (top == null) { 
            top = newnode;
            size++;
        }
	        else{
	        newnode.next = top;
	        top = newnode;
	        size++;
	        }
        }
   
    /*
     * Stack의 top을 반환한다. (제거 x)
     */    
    public String top() {
        return top.data;
    }


    /*
     * Stack의 top을 제거하며, 제거한 Node를 반환한다.
     */    
    public Node pop(){
        Node temp = top;
        if (isEmpty()) { 
            System.out.println("Empty");
        } else {
            top = top.next;
            size--;
        }
        return temp;
    }
    /*
     * Stack 을 top부터 마지막 Node까지 출력한다.
     */    
    public void printStack(){
        Node temp = top;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println("");
    }
}
