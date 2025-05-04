package exmp02;

public class TestReturnTypes {
    public void f() {
        System.out.println("Merhaba hiçbir şey return etmez");
    }
    public int g() {
        return 10;
    }

    public static void main(String[] args) {
        // burada f ve g methodları birer instance method mu yoksa static class method mu?
        // instance methodları

        // instance methodlarını nasıl çağırırız?
        // f() -> bu şekilde çağırabilir miyim?
        // hayır
        // instance method içinden başka bir instance method çağırabilirim
        // ama dışarıdan veya bir static method içinden (main de bir static method) doğrudan instance method çağıramam
        // önce instance oluşturmam lazım

        // instance nasıl oluştururum? Bu class'tan?
        // instance = örnek = object
        TestReturnTypes a1 = new TestReturnTypes();
        // böylece bu class tipinden bir instance oluşturduk

        // şimdi artık yukarıdaki f() ve g() instance methodlarını çağırabiliriz
        // nasıl çağırırız?
        // this sadece instance methodları içinde kullanılır
        // şu an biz neredeyiz?
        // static main methodu içindeyiz. this kullanamayız
        // instance üzerinden instance methodlarını çağırabiliriz
        // bizim elimizde instance var mı?
        // instance/obje nasıl oluştururuz?
        // int f = ..
        // f objesi int tipinden olur
        // biz mevcut TestReturnTypes class tipinden bir instance oluşturmak istiyoruz
        TestReturnTypes k = new TestReturnTypes();
        // şimdi elimizde bir instance var
        // biz bu instance üzerinden instance methodları olan f ve g() methodlarını çağırmak istiyoruz
        // nasıl çağırırız?
        k.f();
        k.g();
        // bunlardan hangisi bir değer döner?
        // g()
        // peki g() fonksiyonundan dönen değeri bir değişken (variable) içine nasıl assign (atarız) ederiz?

        // örnek bir variable nasıl oluştururuz?
        // variable = değişken
        // yukarıdaki kodda neler variable?
        // a1 ve k birer variable

        // peki g() fonksiyonundan dönen değeri bir değişken (variable) içine nasıl assign (atarız) ederiz?
        int x = k.g();
        // şimdi x diye yeni bir variable oluşturduk
        // bu variable'a k.g() fonksiyonundan dönen değeri assign ettik.
        System.out.println("x = " + x);
        // x = 10

        // k.f() bir değer döner mi?
        // hayır dönmez
        // bu yüzden f methodunun declaration ifadesinde onun return ettiği type = void
        // bir methodun ilk tanımlandığı satıra declaration (beyan) denir.
        // public void f()
        // burada görüyoruz ki, f hiçbir şey return etmez
        // public int g()
        // bu da diyor ki, g int tipinden bir değer return eder






    }
}
