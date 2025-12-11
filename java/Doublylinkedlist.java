public class Doublylinkedlist {
  node head, last;

  public void append(int num) {
    node n = new node(num);
    if (head == null) {
      head = n;
      last = n;
    } else {
      last.next = n;
      n.prev = last;
      last = n;
    }
  }

  public void insert(int num, int pos) {
    node h = head;
    node n = new node(num);
    if (pos == 0) {
      n.next = head;
      head.prev = n;
      head = n;
    } else {
      pos = pos - 1;
      while (pos > 0) {
        if (h.next == null) {
          System.out.println(" err");
          break;
        }
        h = h.next;
        pos--;
      }
      n.next = h.next;
      h.next.prev = n;
      h.next = n;
      n.prev = h;
    }
  }

  public void delete(int pos) {
    node h = head;
    if (pos == 0) {
      head = head.next;
      head.prev = null;
    } else {
      pos = pos - 1;
      while (pos > 0) {
        if (h.next == null) {
          System.out.println(" err");
          break;
        }
        h = h.next;
        pos--;
      }
      h.next = h.next.next;
      h.next.next.prev = h;

    }
  }

  public void display() {
    node h = head;
    while (h != null) {
      System.out.print(h.data);
      if (h.next != null) {
        System.out.print("<->");
      }
      h = h.next;
    }
    System.out.println();
  }

  public void rev_deisplay() {
    node n = last;
    while (n != null) {
      System.out.print(n.data);
      if (n.prev != null) {
        System.out.print("<->");
      }
      n = n.prev;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Doublylinkedlist ll = new Doublylinkedlist();
    int[] l = { 1, 2, 3, 4, 5, 6, 7, 12, 8, 11, 24, 13, 15 };
    for (int i : l) {
      ll.append(i);
    }
    ll.insert(999, 5);
    ll.display();
    ll.delete(9);
    ll.display();
    ll.rev_deisplay();
  }
}

class node {
  int data;
  node next, prev;

  node(int n) {
    data = n;
    next = null;
    prev = null;
  }
}