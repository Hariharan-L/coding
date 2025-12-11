import java.util.*;

public class Island {
  public int n, m;
  int[][] l;

  public void sample(int i, int j) {
    if ((0 <= i) && (i < n) && (0 <= j) && (j < m)) {
      if (l[i][j] == 1) {
        l[i][j] = 0;
        sample(i, j + 1);
        sample(i, j - 1);
        sample(i + 1, j + 1);
        sample(i + 1, j - 1);
        sample(i - 1, j + 1);
        sample(i - 1, j - 1);
        sample(i + 1, j);
        sample(i - 1, j);
      }
    }
  }

  public void land(int[][] l) {
    int count = 0;
    int row = l.length;
    int col = l[0].length;
    if (l.length == 0) {
      System.out.println("No island");
    } else {
      for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
          if (l[i][j] == 1) {
            count = count + 1;
            sample(i, j);
          }
        }
      }
      System.out.println(count);
    }
  }

  public static void main(String[] args) {
    Island island = new Island();
    Scanner sc = new Scanner(System.in);
    island.n = sc.nextInt();
    island.m = sc.nextInt();
    island.l = new int[island.n][island.m];
    for (int i = 0; i < island.n; i++) {
      for (int j = 0; j < island.m; j++) {
        island.l[i][j] = sc.nextInt();
      }
    }
    island.land(island.l);
    sc.close();
  }
}
