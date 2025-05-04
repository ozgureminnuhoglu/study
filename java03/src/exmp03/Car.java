package exmp03;

public class Car {
    private String brand;
    private int price;
    public Car(String carBrand){
        this.brand = carBrand;
        this.price = 1000;
    }
    public void priceTag(int increase) {
        this.price = this.price + increase;
    }
    public Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
    public static void main(String[] args) {
        // Bir arabayı modellemek için Car diye bir class oluşturduk
        // arabalarla ilgili bilgileri burada tutacağız
        // bir arabanın hangi bilgileri vardır?
        // markası, fiyatı
        // marka bilgisi: Mercedes, Tesla gibi
        // bu bilgiyi nerede tutacağın? nasıl tutacağın?
        // `brand` bir method mu? değil
        // ne peki bu?
        // Constructor da değil
        // buna data member, attribute, instance variable deriz
//        private String brand;
//        private int price;

        // yeni bir Car objesi oluşturmak istiyorum.
        // nasıl oluşturacağım?
        // public Car
        // constructor, method veya data memberlar hiçbir zaman main() içine yazılmaz
        // bunlar her zaman class scope'unda yazılır

        // main() methodu nerede başlayıp nerede bitiyor
        // bu main() methodunun içinde olmaya, main fonksiyonunu scope'u diyoruz
        // Car class'ının scope'u nerede başlayıp nerede bitiyor?

//    public Car(String carBrand){
//            this.brand = carBrand;
//            this.price = 1000;
//        }
        // bu constructorı kullanarak bir obje oluşturalım
        Car c1 = new Car("Mercedes");
        System.out.println("c1.brand = " + c1.brand);
        // ancak bir sorun var, sen yukarıdaki constructor'da price bilgisini sabit olarak girdin
        // halbuki her arabanın fiyatı farklı olabilir
        c1.priceTag(9000);
        System.out.println("c1.price = " + c1.price);
        // bu zahmetli bir yol oldu
        // en baştan sen objeyi oluştururken, neden onun fiyatını da tanımlamıyorsun?
        // en başta objeyi oluştururken markayı da tanımlıyorsun zaten
        Car c2 = new Car("Mercedes", 10000);
        Car c3 = new Car("Tesla", 15000);
        System.out.println("c2.price = " + c2.price);
        System.out.println("c3.price = " + c3.price);
    }
}
