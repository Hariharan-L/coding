import java.util.*;

public class bubble_sort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    int n = 1000000;
    int[] l = new int[n];
    for (int i = 0; i < n; i++) {
      l[i] = r.nextInt(1000);
    }
    // *************Ascending order sorting****************
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        if (l[i] > l[j]) {
          int temp = l[i];
          l[i] = l[j];
          l[j] = temp;
        }
      }
    }
    for (int j = 0; j < n; j++) {
      System.out.print(l[j] + " ");
    }
    System.out.println();
    // ***************** Decending order Sorting************
    // for (int i = 0; i < n; i++) {
    // for (int j = i; j < n; j++) {
    // if (l[i] < l[j]) {
    // int temp = l[i];
    // l[i] = l[j];
    // l[j] = temp;
    // }
    // }
    // }
    // for (int j = 0; j < n; j++) {
    // System.out.print(l[j] + " ");
    // }
    sc.close();
  }
}
