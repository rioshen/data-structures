#!/usr/bin/env python

class WrapperStack(object):
    def __init__(self):
        self.items = []

    def size(self):
        return len(self.items)

    def is_empty(self):
        return len(self.items) == 0

    def push(self, item):
        self.items.append(item)

    def peek(self):
        return self.items[-1]

    def pop(self):
        return self.items.pop()


if __name__ == '__main__':
    stack = WrapperStack()
    print stack.size()
    print stack.is_empty()
    stack.push('a')
    print stack.size()
    print stack.is_empty()
    print stack.peek()
    print stack.pop()
