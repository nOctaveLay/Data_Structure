from DoublyLinkedList import *
if __name__ == '__main__':
	test = DoublyLinkedList()
	for x in range(1,5):
		print(x,x+5)
		test.addFirst(5-x)
		test.printlist()
		test.addLast(x+4)
		test.printlist()
	test.removeFirst()
	test.printlist()
	test.removeLast()
	test.printlist()