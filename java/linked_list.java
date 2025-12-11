public class linked_list {
  node head, last;

  public void append(int num) {
    node n = new node(num);
    if (head == null) {
      head = n;
      last = n;
    } else {
      last.next = n;
      last = n;
    }
  }

  public void insert(int num, int pos) {
    node h = head;
    node n = new node(num);
    if (pos == 0) {
      n.next = head;
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
      h.next = n;
    }
  }

  public void delete(int pos) {
    node h = head;
    if (pos == 0) {
      head = head.next;
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
    }
  }

  public void display() {
    node h = head;
    while (h != null) {

      System.out.print(h.data);
      if (h.next != null) {
        System.out.print("->");
      }
      h = h.next;
    }
    System.out.println();
  }

  public void rotate(int n) {
    while (n > 0) {
      last.next = head;
      head = last;
      while (last.next != head) {
        last = last.next;
      }
      last.next = null;
      n--;
    }
  }

  public static void main(String[] args) {
    linked_list ll = new linked_list();
    int[] l = { 1, 2, 3, 4, 5, 6, 7, 12, 8, 11, 24, 13, 15 };
    for (int i : l) {
      ll.append(i);
    }
    ll.insert(999, 6);
    ll.display();
    ll.delete(9);
    ll.display();
    ll.rotate(4);
    ll.display();
  }
}

class node {
  int data;
  node next;

  node(int n) {
    data = n;
    next = null;
  }
}