my questions:
1. where should i put attributes?
Attributlar her zaman class scope içinde tanımlanır.
`class` ifadesinden sonra. Herhangi bir method içinde değil.

2. where are the variables place?

Değişkenler, class içine de konulabilir, herhangi bir method içine de konulabilir.

Eğer class içine konulmuşsa, bunlara attribute deriz. Başka deyişle instance variable deriz.

Method içine konulmuşsa, bunlara local variable deriz.

3. what is the difference between constructor and methods?

Her constructor bir methoddur.

Ancak her method bir constructor değildir.

Constructor methodları diğer methodlardan farklı şekilde çağrılır.

Örnek: `X()` bir constructor method olsun. `f()` ise instance method olsun.

`f` methodunu kendi başına çağıramazsın, eğer bir instance method içinde değilsen.

Önce bir instance/obje oluşturman gerekir. Onun üzerinden f'i çağırabilirsin.

X constructor methodunu ise, sıfırdan çağırabilirsin. Fakat `new` kelimesiyle birlikte.

Örnek:

```java
X a1 = new X(); // burada X() constructor'ını çağırdım
a1.f(); // burada da f() methtodunu çağırdım.
```

Dikkat: f() methodunu a1 nesnesi üzerinden çağırıyorum. Sıfırdan çağıramam.

Ancak bir instance method body'si (instance method içindeki satırlar) içindeyken, o class'a ait
olan diğer instance methodları doğrudan çağırabilirsin.

```java
class X {
    public int f() {return null};
    public int g() {
        return 10;
    }
}
```

Burada iki tane instance methodumuz var: f ve g.

g bir instance method olduğundan, g zaten bir instance üzerinden çalıştırılır. Yukarıdaki f gibi.

Fakat bir instance method içindeyken, başka bir instance methodu çağırmak istediğinde, yeni obje oluşturmana gerek yok.

Çünkü zaten o method bir instance üzerinden çağrılıyor ya, o instance üzerinden öbür methodu da çağırmış olursun.

Örnek:

```java
public static void main(String[] args) {
// static bir method içindeyken, herhangi bir instance yoktur henüz
// dolayısıyla f() veya g() bir instance methodu doğrudan çağıramam burada.
// önce bir instance oluşturmalıyım
  X a1 = new X();
  a1.g();
        }
```

Yukarıda `a1.g()` ifadesiyle, g instance methodunu çağırdım. Şimdi g methodunun içinden diyelim ki, f methodunu çağırıyorum.

```java
class X {
    public int f() {return null};
    public int g() {
        f();
        return 10;
    }
}
```

Yukarıda g() içinde f() methodunu doğrudan çağırdım. g'yi zaten `a1.g()` şeklinde çağırmıştık. Dolayısıyla, ben g'nin satırları içindeyken, aslında `a1` objesinin tüm memberlarına (instance variable, instance method) erişebilirim.

g içinde f'yi çağırdığımda, aslında a1 objesinin içinden f'yi çağırmış gibi oluyorum.

Her objede instance variable ların değerleri farklı olur. Dolayısıyla hangi obje üzerinden methodları çağırdığım önemli bir şey.

5. what is the difference between parameters and arguments?

Aynı şey.

Bir fonksiyona gönderdiğimiz tüm değişkenlere, parametre veya argüman deriz.
