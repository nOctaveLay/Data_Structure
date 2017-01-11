from Queue import *
class ListQueue(Queue):
	def __init__(self):
		self.list = []
	
	def enqueue(self,data):
		self.list.append(data)

	def dequeue(self):
		self.list.pop()

	def isEmpty(self):
		return len(self.list) == 0
	
	def first(self):
		if self.isEmpty(): return None
		else: return self.list[0]
	
	def size(self): return len(self.list) 

	def printqueue(self):
		if self.isEmpty():print("Empty",end = ' ')
		else: print("Top->",end = ' ')
		for x in range(len(self.list)):
			print(self.list[x],end = ' ')
		print()