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

##Tree
A tree is a nonlinear data structure in which elements are organized into a hierarchy.

####The Basics

+ The root node is the only node in the tree that does not have a parent.
+ A node that does not have any children is called a leaf.
+ The height of a tree is the length of the longest path from the root to a leaf.
+ A tree is considered to be balanced if all of the leaves of the tree are on the same level or at least within one level of each other.
+ A tree is considered to be completed if it is balanced and all of the leaves at the bottom level are on the left side of the tree.

####Analysis of Tree

`find` operation is O(logN). This is due to the fact that the height of such a tree will always be logN, where N is the number of elements in the tree.

####Operations

+ contains(x): determines if the target is in the tree
+ find(x): return the specific target if it is found
