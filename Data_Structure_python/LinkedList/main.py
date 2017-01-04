from SinglyLinkedList import *
if __name__ == '__main__':
	sll = SinglyLinkedList()
	sll.addFirst("abs")
	sll.printList() #abs
	sll.addLast("156")
	sll.printList() #abs 156
	sll.addFirst("456")
	sll.printList() #456 abs 156
	sll.addLast("name") 
	sll.printList() #456 abs 156 name
	sll.removeFirst()
	sll.printList() #abs 156 name
