Practice on data structure.
===============

##Stack
####The Basics
A stack is a LIFO sequence. Addition and removal takes place only at one end, called the top.

####Operations:

+ push(x): add an item on the top
+ pop: remove the item at the top and return it
+ peek: return the item at the top (without removing it)
+ size: return the number of items in the stack
+ isEmpty: return whether the stack is empty

####Usages:

+ Expression evaluation
+ Matching parentheses
+ Navigating a maze

####Representations in Java:

+ Wrapper around the `java.util.LinkedList`
+ Array based, bounded or expandable (All operations in O(1))
+ Linked list (All operations in O(1))

####Representations in Python:

+ Wrapper around the `list` (All operations in O(1))
+ Linked list (All operations in O(1))

##Queue
####The Basics
A queue is a FIFO sequence. Addition takes place only at the tail, and removal takes place on at the head.

####Operations

+ enqueue(x): add an item at the tail
+ dequeue(): remove the item at the head and return it
+ peek(): return the item at the head (without removing it)
+ size(): return the number of items in the queue
+ isEmpty(): return whether the queue is empty

####Representations

+ Wrapper around the `java.util.LinkedList`
+ Array based, bounded or expandable (All operations in O(1))
+ Linked list (All operations in O(1))

####Circular Array in Queue
Use a circular array to insert and remove items from a queue in constant time is a common way to implement a queue. The idea of of a circular array is that the end of the array "wraps around" to the start of the array.

The `mod` operator is used to calculate remainders:

+ The back of the queue is: `(tail + 1) % array.length`
+ The front of the queue is: `(head + 1) % array.length`