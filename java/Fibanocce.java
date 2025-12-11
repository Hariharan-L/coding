import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int a1 = 1;
        int a2 = 1;
        int a3;
        l.add(1);
        l.add(1);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
            l.add(a3);
        }
        System.out.println(l.get(n - 1));
        sc.close();
    }
}