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
