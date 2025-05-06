package recursion01;

public class RecursiveCall02 {
    // recursive call yaparken, tail-call kavramı var
    // bu şu anlama geliyor
    // eğer özyineleme fonksiyonunu en son return satırında çağırıyorsak, buna tail-call denir.
    // eğer tail-call değilse recursion, o zaman senin stack trace'i takip etmen gerekir
    public static int f(int n) {
        if ( n > 0 ) {
            f(n - 1);
        }
        return n;
    }
    public static void main(String[] args) {
        int r1 = f(4);
        System.out.println("r1 = " + r1);
    }
}
