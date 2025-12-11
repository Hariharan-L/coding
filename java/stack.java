import java.util.*;
class Innerstack {
  public int top;
  public Integer l[];
  public int n;

  public Innerstack(int n) {
    this.n = n;
    this.l = new Integer[n];
    top = -1;
  }

  public void push(int n) {
    if (isfull()) {
      System.out.println("Stack is full");
    } else {
      l[++top] = n;
    }
  }

  public void pop() {
    if (isempty()) {
      System.out.println("Stack is empty");
    } else {
      System.out.println("Poped element: " + l[top]);
      l[top] = null;
      top--;
    }
  }

  public boolean isfull() {
    if (top == n - 1) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isempty() {
    if (top == -1) {
      return true;
    } else {
      return false;
    }
  }

  public void peek() {
    if (!isempty()) {
      System.out.println("The top element is : " + l[top]);
    } else {
      System.out.println("Stack is empty");
    }
  }
}

public class stack {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Innerstack s = new Innerstack(n);
    for (int i = 0; i < n; i++) {
      int b = sc.nextInt();
      s.push(b);
    }
    s.pop();
    for (int i = 0; i < s.top + 1; i++) {
      System.out.println(s.l[i]);
    }
    sc.close();
  }
}
