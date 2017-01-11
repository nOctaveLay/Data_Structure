from ListQueue import *

if __name__ == '__main__':
	LQ = ListQueue()
	for x in range(10):
		LQ.enqueue(x)
		LQ.printqueue()
	for _ in range(10):
		LQ.dequeue()
		LQ.printqueue()
		