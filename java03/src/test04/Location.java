package test04;

public class Location {
    private int theRow;
    private int theCol;
    public Location(int r, int c){
        // constructor ne yapar?
        // objenin atributlarını initialize eder
        // constructor'a hangi argümanlar girdi olarak verilmiş?
        // r ve c
        // bunlara hangi atributlara assign etmeliyiz?
        this.theRow = r;
        this.theCol = c;
    }
    public int getRow() {
        // bu tarz get ile başlayan methodlara getter denir
        // bu getter'ların tek bir işlevi vardır
        // bir atributun değerini döndürmek
        // Location class'ındaki atributlar neler?
        // theRow ve theCol
        // r ve c ne?
        // r ve c: Location constructor methodunun argümanları
        // atribut kelimesinin eş anlamlı kelimeleri nelerdi?
        // atribut = instance variable, field, data member
        // getRow() bir method
        // theRow ise bir method değil. bir atribut, instance variable.
        // niye return kelimesi koyduk başa?
        // eğer return koymasaydık ne olurdu?
        // return mu koymam lazım her zaman?
        // ne zaman return kullanacağım?
        // return ne işe yarıyor?
        // bir methodun/fonksiyonun bir değer döndürmesini sağlar
        return theRow;
    }

    public void getRow2() {
        // bu fonksiyon herhangi bir değer döndürmez
        // bu yüzden fonksiyonunu return type tanımı "void" olmuştur
        // burada return kelimesini kullanmayız
        System.out.println("row: " + theRow);
        // şimdi bu getRow2() methodunu bir örnek üzerinden çalıştıralım
        // burada neden loc.theRow yazmadık doğrudan theRow yazdık?
        // burada bir instance methodu içindeyim
        // main() içindeyken bir instance methodu değil, bir static method içindeyim
        // instance methodu içindeyken, o instance objesine ait olan atributlara doğrudan erişebilirim
        // fakat static bir method içindeyken, bir instance içindeki atributlara erişmek için,
        // o instanceın kendisi üzerinden erişebilirim
        // soru: burada neden new Location() yapmıyoruz?
        // cevap: getRow2() bir instance method değil mi?

        // class ve instance arasındaki fark neydi?
        // class X {.. }
        // instance bir class'a ait bir obje demek
        // nasıl oluştururuz instance'ları?
        // X a = new X()
        // Constructor methodunu çağırarak bir instance oluştururum
        // bildiğin şeylere odaklan
        // hepsini bir arada çözmeye çalışma
        // ikinci olarak da şunu yap:
        // seninle bir çalışma yapıyoruz

        // çalışırken sen her şeyi anladığını zannediyorsun
        // sonra ben sana bir ödev veriyorum
        // o ödevi yapıyorsun
        // bunun yerine şöyle yap:
        // seninle çalışmamız biter bitmez tüm notların üzerinden tekrar geç
        // her şeyi net olarak anlayıp anlamıdığını kendine sor
        // özellikle de terimleri/kavramları doğru tanımlayabiliyor musun, onu test et
        // eğer kavramları doğru tanımlayamıyorsan, bir sonraki adıma ilerleme
        // orada dur
        // o kavramları ya araştır, ya da bana hemen sor
        // o kavramları tam olarak tanımlayamadan, problemleri çözmeye çalışıyorsun ya, o zaman kafan karışıyor
        // temellerin oturmuyor
        // anlayamadığın, eksik kalan, kafanda net olmayan tüm kavramları çıkart
        // kavramları oturtmazsan, problemleri çözemezsen
        // verdiğim önceki ödevleri de tekrar yap

    }

    public static void main(String[] args) {
        Location loc = new Location(3, 5);
        loc.getRow2(); // bu ifade herhangi bir değer döndürmez
        // değer döndürmediği için, bu method çağrısını bir variable objesine assign edemem
        int r = loc.getRow();
        // burada getRow() methodu bir değer döndürdü
        // bu dönen değeri "r" değişkenine atadık
        // getRow2() methodu değer döndürmediğinden, onu herhangi bir değişkene atayamayız
        // ama getRow() döndürdüğünden buradan dönen değeri bir değişkene atayabiliriz
        System.out.println("r = " + r);
        // row: 3    -- bu satırı getRow2() yazdırdı
        // r = 3

    }


    public int getCol() {
        // getCol neyi döndürmeli?
        return theCol;
    }


}
