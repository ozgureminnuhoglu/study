package exmp02;

public class TestReturnTypes02 {
    public int f1() {
        return 20;
    }
    public int f2() {
        return 30;
    }
    public void f3() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        // yukarıdaki f1 f2 f3 methodları instance method mu yoksa static method
        // instance
        // bu methodları nasıl çağırırsın?
        TestReturnTypes02 m = new TestReturnTypes02();
        m.f1();
        m.f2();
        m.f3();
        // peki bu methodların döndüğü değerleri birer variable içine koyalım
        int x = m.f1();
        int y = m.f2();
//        String z = m.f3();
        // void fonksiyonlar herhangi bir değer dönmez
        // dolayısıyla bunları çağırıp sonuçta dönen değeri herhangi bir değişkene atayamazsın
    }
}
