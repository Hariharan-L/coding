class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
        self.last = None

    def append(self, num):
        n = Node(num)
        if self.head is None:
            self.head = n
            self.last = n
        else:
            self.last.next = n
            self.last = n

    def insert(self, num, pos):
        h = self.head
        n = Node(num)
        if pos == 0:
            n.next = self.head
            self.head = n
        else:
            pos -= 1
            while pos > 0:
                if h.next is None:
                    print("Error: Position out of bounds")
                    return
                h = h.next
                pos -= 1
            n.next = h.next
            h.next = n

    def delete(self, pos):
        h = self.head
        if pos == 0:
            self.head = self.head.next
        else:
            pos -= 1
            while pos > 0:
                if h.next is None:
                    print("Error: Position out of bounds")
                    return
                h = h.next
                pos -= 1
            h.next = h.next.next if h.next else None

    def display(self):
        h = self.head
        while h is not None:
            print(h.data, end="")
            if h.next is not None:
                print("->", end="")
            h = h.next
        print()

    def rotate(self, n):
        while n > 0:
            self.last.next = self.head
            self.head = self.last
            while self.last.next != self.head:
                self.last = self.last.next
            self.last.next = None
            n -= 1

if __name__ == "__main__":
    ll = LinkedList()
    l = [1, 2, 3, 4, 5, 6, 7, 12, 8, 11, 24, 13, 15]
    for i in l:
        ll.append(i)
    ll.insert(999, 6)
    ll.display()
    ll.delete(9)
    ll.display()
    ll.rotate(4)
    ll.display()