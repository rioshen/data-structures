#!/usr/bin/env python

# An implementation of queue using linked list


class ListNode:
    def __init__(self, value, next=None):
        self.value = value
        self.next = next


class LinkedQueue:
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0

    def get_size():
        return self.size

    def is_empty():
        return self.size == 0

    def enqueue(item):
        node = ListNode(item)
        if not self.head:
            self.head = node
        else:
            self.tail.next = node

        self.tail = node
        self.size += 1

    def dequeue(self):
        value = self.head.value
        if self.head == self.tail:
            self.tail = None
        self.head = self.head.next
        self.size -= 1
        return value
