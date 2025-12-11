import java.util.*;

public class Parentheses {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Character> l = new Stack<>();
    String s = sc.next();
    int le = s.length();
    for (int i = 0; i < le; i++) {
      char c = s.charAt(i);
      if (c == '(' || c == '[' || c == '{') {
        l.push(c);
      } else {
        l.pop();
      }
    }
    if (l.isEmpty()) {
      System.out.println("Yes all parentheses");
    } else {
      System.out.println("No it is not correct");
    }
    sc.close();
  }
}
