
class Node(object):
	def __init__(self,data,name):
		self.data = data
		self.next = name

class Stack(Node):
	def __init__(self):
		self.top = None
		self.size = 0

	def size(self):
		return self.size;

	def isEmpty(self):
		if self.top == None:
			return True
		else:
			return False

	def push(self,data):
		push_node = Node(data,None)
		if self.top == None:
			self.top = push_node
			self.size += 1
		else:
			push_node.next = self.top
			self.top = push_node
			self.size += 1

	def get_top(self):
		print("Top Data: ",end = '')
		if self.top == None:
			print("None")
		else:
			print(self.top.data)

	def pop(self):
		temp = self.top
		if self.isEmpty():
			print("Empty")
		else:
			self.top = self.top.next
			self.size -= 1
		return temp

	def printStack(self):
		temp = self.top
		print("Stack:",end=" ")
		for x in range(self.size):
			print(temp.data,end = " ")
			temp = temp.next
		print("")
	