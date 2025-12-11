import java.util.*;

public class two_sum {
  public static void twosum(int l[], int t) {
    Arrays.sort(l);
    int left = 0;
    int right = l.length;
    while (left < right) {
      int tot = l[left] + l[right - 1];
      if (tot == t) {
        System.out.println(l[left] + " " + l[right - 1]);
        left++;
      } else if (tot < t) {
        left++;
      } else {
        right--;
      }
    }
  }
  public static void main(String[] args) {
    // Random r = new Random();
    // int n = 100;
    int[] l = { 1, 5, 5, 9, 11, 2, 4, 6, 7, 10, 15, 14, 29, 22, 20 };
    int target = 10;
    twosum(l, target);
  }
}