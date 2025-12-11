class Constructor1 {
  String name;

  Constructor1() {
    name = "Hark";
  }

  Constructor1(String s) {
    name = s;
  }

  String geValue() {
    return name;
  }
}

public class Constructor {
  public static void main(String[] args) {
    Constructor1 c = new Constructor1();
    Constructor1 c1 = new Constructor1("Kpy");
    System.out.println(c.geValue());
    System.out.println(c1.geValue());
  }
}