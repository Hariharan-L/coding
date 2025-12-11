import java.util.*;

//******************IMPORTANT: IT IS AN SELF BALANCING TREE NEED TO IMPLEMENT IN BALANCING*************************//
public class AVL_tree {
  Node root;

  AVL_tree(int k) {
    Node n = new Node(k);
    root = n;
  }

  private Node insert(Node root, int a) {
    if (root == null) {
      Node n = new Node(a);
      root = n;
      return root;
    } else if (a < root.data) {
      root.left = insert(root.left, a);
      return root;
    } else if (a > root.data) {
      root.right = insert(root.right, a);
      return root;
    } else {// dupllicates not allowed..
      return root;
    }
  }

  public void inorder_traversal(Node root) {
    if (root != null) {
      inorder_traversal(root.left);
      System.out.print(root.data + " ");
      inorder_traversal(root.right);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    AVL_tree tree = new AVL_tree(10);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int k = sc.nextInt();
      tree.insert(tree.root, k);
    }
    tree.insert(tree.root, 0);
    tree.inorder_traversal(tree.root);
    System.out.println();
    System.out.println(tree.root.data);
    sc.close();
  }
}

class Node {
  int data;
  Node left, right;

  Node(int data) {
    this.data = data;
    left = null;
    right = null;
  }
}