class CircularlyLinkedList(Node):
	def __init__(self):
		self.tail = None
		self.size = 0

	def isEmpty(self): return self.size == 0

	#method
	def rotate(self):
		if self.tail != None:
			self.tail = self.tail.getNext()  

	def addFirst(self,data):
		if (self.isEmpty()):
			self.tail = Node(data,null)
			self.tail.setNext(self.tail)
		else:
			new = Node(data,self.tail.getNext())
			self.tail.setNext(new)

	def addLast(self,data):
		self.addFirst(data)
		self.tail = self.tail.getNext()

	def removeFirst(self):
		head = self.tail.getNext()
		if (self.isEmpty()):
			self.tail = None
		else:
			self.tail.setNext(head.getNext())
		size -= 1
		return head.getElement()

	def printlist(self):
		temp = self.tail.getNext()
		print("head: ")
		while temp != self.tail:
			print(temp.getElement())