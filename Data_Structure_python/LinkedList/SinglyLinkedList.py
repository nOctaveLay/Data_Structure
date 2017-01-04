from Node import Node
class SinglyLinkedList(Node):
	def __init__(self):
		self.size = 0
		self.head = None
		self.tail = None
	def size(self): return self.size
	def isEmpty(self): return (self.size == 0)
	def first(self):
		if self.head == None:
			return None
		else: return head.getElement()
	def last(self):
		if self.tail == None:
			return None
		else: return tail.getElement()

	#real method
	def addFirst(self,data):
		self.head = Node(data,self.head)
		if (self.isEmpty()):self.tail = self.head
		self.size += 1

	def addLast(self,data):
		node = Node(data,None)
		if (self.isEmpty()):
			self.head = node
		else:
			self.tail.setNext(node)
		self.tail = node
		self.size += 1

	def removeFirst(self):
		if (self.isEmpty()): return None
		else:
			answer = self.head.getElement()
			self.head = self.head.getNext()
			self.size -= 1
			if (self.isEmpty()):
				self.tail = None	
			return answer

	def printList(self):
		node = self.head
		print("head-> ",end = ' ')
		while (node != None):
			print(node.getElement(),end = ' ')
			node = node.getNext()
		print()