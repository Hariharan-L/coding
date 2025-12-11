import java.util.*;

public class sec_largeele {/// without changing arr
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ni = sc.nextLine();
    int max = 0;
    String[] n = ni.split("\\s+");
    for (int i = 0; i < n.length - 1; i++) {
      Integer a = Integer.parseInt(n[i]);
      for (int j = i + 1; j < n.length; j++) {
        Integer b = Integer.parseInt(n[j]);
        if (a > b && a > max) {
          max = a;
        } else if (max < b) {
          max = b;
        }
        // System.out.println(a);
      }
    }
    int smax = 0;
    for (int i = 0; i < n.length - 1; i++) {
      Integer a = Integer.parseInt(n[i]);
      if (a != max) {
        for (int j = i + 1; j < n.length; j++) {
          Integer b = Integer.parseInt(n[j]);
          if (b != max) {
            if (a > b && a > smax) {
              smax = a;
            } else if (smax < b) {
              smax = b;
            }
          }
        }
      }
    }
    System.out.println(smax);
    sc.close();
  }
}
