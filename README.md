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
+ isEmpty: determine whether the stack is empty

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
+ isEmpty(): determine whether the queue is empty

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

##Binary Tree
A binary tree is a tree data structure in which each node has at most two children (refer to as the left and right child). Binary tree are used to implement binary search tree and binary heaps, and are used for efficient searching and sorting.

####Operations
+ getRoot(): return a reference to the root of the binary tree
+ isEmpty(): determine whether the tree is empty
+ size(): return the number of nodes in the binary tree
+ contains(x): determine whether the specific target is in the tree
+ find(x): return a reference to the node if it is found
+ inorder():
+ preorder():
+ postorder():
+ levelorder():

##Binary Search Tree
####Operations
+ addElement(x): add a new element to the proper location in this tree
+ removeElement(x): removes and returns the specified element in this tree
+ removeMin(): removes and returns the smallest element in this tree
+ removeMax(): removes and returns the largest element in this tree
+ findMin(): returns the smallest element in this tree
+ findMax(): returns the largets element in this tree

###Recursion in Tree
Recursion comes from the algorithm technique [*Divide and Conquer*](http://en.wikipedia.org/wiki/Divide_and_conquer_algorithms), which generally means that some problems can be solved by two steps - Divide and Conquer.

####Divide and Conquer
Divide and Conquer is a technique to solve a problem by reducing it.

+ Divide: reduce the range of the problem to one in only half range each time.
+ Repeat this procedure (recursive)
+ Conquer: solve the smallest problem that is already known (base case)

#####Example
Given a sorted array like {1, 2, 3, 4, 5, 6....., 100}, check whehter 5 is in this array. To demonstrate how to solve it by using *Divide and Conquer*, first we follow the steps above.

+ Divide: Is the target (5) larger than 50 (half element)? if not, find it in the first halve , or find it in the second halve.
+ Repeat his procedure: Is the target larger than 25 or larger than 75
+ Conquer: if we've already visited the whole sub-array, return false

```
boolean contains(int[] array, int target, int low, int high) {
    if (low > high) return false; // we've visited all node in the array.

    int mid = array[(low + high) / 2];
    if (target < mid) {
        return contains(array, target, 0, mid - 1); // reduce
    } else if (target > mid) {
        return contains(array, target, mid + 1, high); // reduce
    } else {
        return true;
    }
}
```
####Recursion and Tree
Recursion is generally appropriate and useful when we have a structure that has similar repeated structural form. A binary search tree consists of multiple subtrees which have a similar structure to a binary search tree.

####Implementation and use of Recursive Algorithms
Two things must happen in a recursive function:

+ The function must have a selection construct which caters for the base case
+ The recursive call must deal with a simpler/smaller version of the data

#####Recursion vs Iteration

+ Both implement repetition
+ Iteration uses repetition construct - explicit
+ Recursion uses selection construct and achieves repetition through repeated function calls
+ Both involve a termination test
+ Recursion has a base case
+ Iteration has a loop condition
+ Both have the potential for endless looping
+ Any problem that can be solved recursively can be solved iteratively
+ Programmers often choose recursion when they can't see the iterative solution
+ Never choose recursion when performance is an issue.

##Sorting
