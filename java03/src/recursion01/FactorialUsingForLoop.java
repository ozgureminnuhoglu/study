package recursion01;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        // recursion = özyineleme
        // kendi kendini çağırmak
        // recursive call
        // tüm özyinelemeler = while/for loop ile yapılabilir

        // factorial fonksiyonunu for loop ile yapalım
        // önce sırayla tur tur gidelim demiştik

        // önce fact(1) durumunu
        // 1 döndüreceğiz

        // fact(2) alalım
        // 1 * 2
        int result = 1;
        for ( int n = 2; n >= 1; n--) {
            result = n * result;
        }

        // genel yapalım
        int x = 5;
        int r2 = 1;
        for ( int n = x; n >= 1; n--) {
            r2 = n * r2;
        }
        System.out.println("r2 = " + r2);

        // şimdi bu for loopun yerine method kullanalım
        int r3 = fact(6);
        System.out.println("r3 = " + r3);

        // neden static method olarak tanımladım?
        // eğer instance method yapsaydım önce bir obje oluşturacaktım
        // sonra o obje üzerinden methodu çağıracaktım
        // ama yukarıda `fact(6)` bir obje üzerinden çağırmadım
        // bunu instance method olarak yapabilir miydim?
        // evet yapabilirdik
        FactorialUsingForLoop a = new FactorialUsingForLoop();
        int r4 = a.fact2(7);
        System.out.println("r4 = " + r4);
    }

    public static int fact(int x){
        int r2 = 1;
        for ( int n = x; n >= 1; n--) {
            r2 = n * r2;
        }
        return r2;
    }

    public int fact2(int x){
        int r2 = 1;
        for ( int n = x; n >= 1; n--) {
            r2 = n * r2;
        }
        return r2;
    }
}
