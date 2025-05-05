package inheritance01;

public class Main01 {
    public static void main(String[] args) {
        Dog d1 = new Dog("karabaş", "fino");
        d1.eat();
        // burada extend yazmadık
        // static methodların nerede tanımlandığının hiçbir önemi yok
        // main bir static methoddur. bunu herhangi bir yerde tanımlayabilirim
        // bunun içinde herhangi bir objeyi oluşturup, o objenin metotlarını çağırabilirim

        Cat c1 = new Cat("minnoş");
        c1.eat();

        // bir objenin type'ı solundaki class/type ile tanımlanır
        // fakat ne demiştik, her Dog bir Animaldır
        // her Cat bir Animaldır.
        // Dolayısıyla c1, d1 gibi bir objenin declare edilen type'ı Animal olabilir
        Animal d2 = new Dog("sarıbaş", "golden");
        d2.eat();

    }
}
