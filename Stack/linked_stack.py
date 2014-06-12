#!/usr/bin/env python

"""
An implementation of stack using linked list.
"""


class ListNode:
    def __init__(self, value, next=None):
        self.value = value
        self.next = next


class LinkedStack(object):
    def __init__(self):
        self.head = None
        self.size = 0

    def get_size(self):
        return self.size

    def is_empty(self):
        return self.size == 0

    def push(self, item):
        if not self.head:
            self.head = ListNode(item)
        else:
            node = ListNode(item)
            node.next = self.head
            self.head = node
        self.size += 1

    def peek(self):
        if self.size == 0:
            raise AttributeError("Cannot peek from empty stack.")
        else:
            return self.head.value

    def pop(self):
        if self.size == 0:
            raise AttributeError("Cannot pop from empty stack.")

        self.size -= 1

        value = self.head.value
        self.head = self.head.next
        return value


if __name__ == '__main__':
    stack = LinkedStack()
    print stack.get_size()
    print stack.is_empty()
    stack.push('a')
    print stack.get_size()
    print stack.is_empty()
    print stack.peek()
    print stack.pop()

    stack.push('b')
    stack.push('c')
    print stack.get_size()
    print stack.is_empty()
    print stack.peek()
    print stack.pop()

