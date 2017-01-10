class Node(object):
	def __init__(self,data,nodeprev,nodenext):
		self.element = data
		self.prev = nodeprev
		self.next = nodenext
	
	def SetPrev(self,nodeprev): 
		self.prev = nodeprev
	def SetNext(self,nodenext): 
		self.next = nodenext
	def getPrev(self):return self.prev
	def getNext(self):return self.next
	def getelement(self) : return self.element

class DoublyLinkedList(Node):
	def __init__(self):
		self.size = 0
		self.header = Node(None,None,None)
		self.trailer = Node(None,None,None)
	def size(self) :return self.size
	def isEmpty(self): return (self.size == 0)
	def addFirst(self,element):
		if self.isEmpty():
			self.header = Node(element,None,None)
			self.trailer = self.header
		else:
			new = Node(element,None,self.header)
			self.header.SetPrev(new)
			self.header = new
		self.size += 1

	def addLast(self,element):
		node = Node(element,None,None) 
		if self.isEmpty():
			self.header = node
		else:
			# node.SetPrev(self.trailer)
			self.trailer.SetNext(node)
		self.trailer = node
		self.size += 1

	def removeFirst(self):
		if self.isEmpty() :return None
		self.remove(self.header)

	def removeLast(self):
		if self.isEmpty() : return None
		self.remove(self.trailer)
	
	def remove(self,node):
		front = node.getPrev()
		last = node.getNext()
		front.SetNext(last)
		last.SetPrev(front)
		self.size -= 1
		return node.getelement()
	
	def printlist(self):
		snake = self.header
		print("Header->",snake.getelement(),end = ' -> ')
		while snake.getNext() != None:
			print(snake.getelement(),end = " -> ")
			snake = snake.getNext()
		print('Trailer')