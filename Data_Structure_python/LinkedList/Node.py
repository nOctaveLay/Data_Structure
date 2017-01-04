class Node(object):
	def __init__(self,element,node):
		self.element = element
		self.next = node

	def getElement(self): return self.element
	def getNext(self): return self.next
	def setNext(self,n): self.next = n
