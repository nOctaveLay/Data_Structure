class Node(object):
	def __init__(self,data,prevnode,nextnode):
		self.data = data
		self.prev = prevnode
		self.next = nextnode
	
	def SetPrev(self,prevnode): self.prev = prevnode
	def SetNext(self,nextnode): self.next = nextnode
	def getPrev(self): return self.prevnode
	def getNext(self): return self.nextnode
	def getData(self) : return self.data

class DoublyLinkedList(Node):
	def __init__(self):
		self.size = 0
		self.header = Node(None,None,None)
		self.trailer = Node(None,None,None)
	def size(self) :return self.size
	def isEmpty(self): return (self.size == 0)
	def addFirst(self,data):
		new = Node(data,None,self.header)
		self.header.SetPrev(new)
		self.header = new
		if (self.isEmpty()):
			self.trailer = self.header
		self.size += 1

	def addLast(self,data): 
		new = Node(data,self.trailer,None)
		print(self.isEmpty())
		if self.isEmpty():
			self.header = self.trailer
		else:
			self.trailer.SetNext(new)
		self.trailer = new
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
		return node.getData()
	
	def printlist(self):
		snake = self.header
		print("Header-> ",end = '')
		while snake != None:
			print(snake.getData(),end = ' -> ')
			snake = snake.getNext()
		print(snake.getData(),end = 'Trailer')