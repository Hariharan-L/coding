import java.util.Scanner;

public class Palindrome_rec {
  public String palindrome(String s, int i, String k) {
    if (i < s.length()) {
      i++;
      k = palindrome(s, i, k);
      i--;
      k = k + s.charAt(i);
      return k;
    } else {
      return "";
    }
  }

  public static void main(String[] args) {
    Palindrome_rec p = new Palindrome_rec();
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int i = 0;
    String k = "", l;
    l = p.palindrome(s, i, k);
    if (l.equals(s)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    sc.close();
  }
}
