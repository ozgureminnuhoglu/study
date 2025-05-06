package recursion01;

public class RecursiveCall03 {
    // bir önceki örnekte tail-call kullanarak bir recursion yapmıştık
    // bundan bir örnek daha yapalım
    public static int f(int n) {
        if ( n > 0 ) {
            f(n - 1);
        }
        System.out.println("n = " + n);
        return n;
    }
    public static void main(String[] args) {
        int r1 = f(4);
        System.out.println("r1 = " + r1);
    }
}
