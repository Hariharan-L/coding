import java.util.*;

class node {
  int data;
  node next;

  node(int data) {
    this.data = data;
    this.next = null;
  }
}

class Reverse_linkedlist_groupof_k {
  static node head = null;
  static node tail = null;

  public static void insert(int a) {
    node n = new node(a);
    if (head == null) {
      head = n;
      tail = n;
    } else {
      tail.next = n;
      tail = n;
    }
  }

  public static void display() {
    node temp = head;
    while (temp != null) {
      System.out.print(temp.data + (temp.next != null ? "->" : "-> null"));
      temp = temp.next;
    }
  }

  public static node reversenode(node head, int k) {
    if (head == null || k == 1)
      return head;

    // Create a dummy node to simplify edge cases and initialize pointers
    node dummy = new node(0);
    dummy.next = head;
    node curr = dummy, nex = dummy, pre = dummy;
    int count = 0;

    // Count the number of nodes in the list
    while (curr.next != null) {
      curr = curr.next;
      count++;
    }

    // Reverse in groups of k
    while (count >= k) {
      curr = pre.next; // set current to the start of the next group
      nex = curr.next; // set next to the second node in the group
      for (int i = 1; i < k; i++) {
        // Perform the in-place reversal of the nodes
        curr.next = nex.next;
        nex.next = pre.next;
        pre.next = nex;
        nex = curr.next;
      }
      pre = curr; // move the pre pointer to the end of the reversed group
      count -= k; // decrease the count by k
    }

    return dummy.next; // return the new head of the list
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int t = sc.nextInt();
      insert(t);
    }
    display();
    int k = sc.nextInt();
    head = reversenode(head, k);
    display();
  }
}
