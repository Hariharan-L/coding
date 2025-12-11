public class Trees_full {

  public static void main(String[] args) {
    Binarytree t = new Binarytree();
    t.insert(8);
    t.insert(7);
    t.insert(12);
    t.insert(15);
    t.insert(2);
    t.insert(5);
    t.it();
  }
}

/**
 * Binarytree
 */
class Binarytree {
  node root;

  public void insert(int data) {
    root = insertrec(root, data);
  }

  public node insertrec(node root, int data) {
    if (root == null) {
      root = new node(data);
    } else if (data < root.data) {
      root.leftNode = insertrec(root.leftNode, data);
    } else if (data > root.data) {
      root.rightNode = insertrec(root.rightNode, data);
    }
    return root;
  }

  public void it() {
    inorder_traversal(root);
  }

  public void inorder_traversal(node root) {
    if (root != null) {
      inorder_traversal(root.leftNode);
      System.out.print(root.data);
      inorder_traversal(root.rightNode);
    }

  }
}

/**
 * node
 */
class node {
  int data;
  node leftNode;
  node rightNode;

  node(int data) {
    this.data = data;
  }
}