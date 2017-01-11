from abc import ABCMeta, abstractmethod
class Queue(metaclass = ABCMeta):

	#add element e to the back of queue
	@abstractmethod
	def enqueue(self,data):pass

	#Removes and returns the first element from the queue
	#(or null if the queue is empty)
	@abstractmethod
	def dequeue(self):pass

	#Returns the first element of the queue, without removing it
	#or null if the queue is empty
	@abstractmethod
	def first(self):pass

	#Returns the number of elements in the queue
	@abstractmethod
	def size(self):pass

	#Returns a boolean indicating whether the queue is empty
	@abstractmethod
	def isEmpty(self):pass

