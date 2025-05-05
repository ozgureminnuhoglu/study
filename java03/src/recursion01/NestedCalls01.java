package recursion01;

public class NestedCalls01 {
    public int f(int a) {
        return g(a) * 2;
    }
    public int g(int a) {
        return a + 1;
    }

    public static void main(String[] args) {
        NestedCalls01 n = new NestedCalls01();
        int r1 = n.f(3);
        System.out.println("r1 = " + r1);
        // yukarıda f fonksiyonunun içinden g() fonksiyonunu çağırdık
        // bu tarz içiçe çağırmalar yapabiliyoruz
        // soru şu:
        // f fonksiyonunun içinden kendisini çağırsaydık ne olurdu?
        // bu tür kendi kendini çağırmaya: recursive call diyoruz.
    }
}
