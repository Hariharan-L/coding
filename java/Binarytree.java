import java.util.*;

public class Binarytree {
  Node root;

  public void inorder_traversal(Node root) {
    if (root != null) {
      inorder_traversal(root.left);
      System.out.print(root.data + " ");
      inorder_traversal(root.right);
    }
  }

  public void preorder_traversal(Node root) {
    if (root != null) {
      System.out.print(root.data + " ");
      preorder_traversal(root.left);
      preorder_traversal(root.right);
    }
  }

  public void postorder_traversal(Node root) {
    if (root != null) {
      postorder_traversal(root.left);
      postorder_traversal(root.right);
      System.out.print(root.data + " ");
    }
  }

  public int add_elements(Node root) {
    if (root == null) {
      return 0;
    } else {
      return root.data + add_elements(root.left) + add_elements(root.right);
    }
  }

  public int count_node(Node root) {
    if (root == null) {
      return 0;
    } else {
      return 1 + count_node(root.left) + count_node(root.right);
    }
  }

  public int height_tree(Node root) {
    if (root == null) {
      return 0;
    } else {
      return 1 + Math.max(height_tree(root.left), height_tree(root.right));
    }
  }

  public int search_ele(Node root, int n) {
    if (root == null) {
      return 0;
    } else if (root.data == n) {
      return 1;
    } else {
      return (search_ele(root.left, n) | search_ele(root.right, n));
    }
  }

  public int full_tree(Node root) {
    if (root == null) {
      return 1;
    }
    if ((root.left != null & root.right == null) | (root.left == null & root.right != null)) {
      return 0;
    }
    if (root.left == null & root.left == null) {
      return 1;
    } else {
      return full_tree(root.left) & full_tree(root.right);
    }
  }

  public int complete_tree(Node root) {
    if (root == null) {
      return 1;
    }
    if (root.left == null & root.left == null) {
      return 1;
    }
    if ((root.left != null & root.right == null) | (root.left == null & root.right != null)) {
      return 0;
    } else {
      return complete_tree(root.right) & complete_tree(root.left);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Binarytree tree = new Binarytree();
    tree.root = new Node(10);
    tree.root.left = new Node(12);
    tree.root.right = new Node(23);
    // tree.root.left.left = new Node(8);
    tree.root.right.right = new Node(2);
    tree.root.right.left = new Node(2);
    // System.out.println(tree.search_ele(tree.root, 8));
    // System.out.println(tree.full_tree(tree.root));
    System.out.println(tree.complete_tree(tree.root));
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