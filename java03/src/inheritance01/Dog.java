package inheritance01;

public class Dog extends Animal {
    private final String species;

//    // ortak memberları tekrar yazmıyorum: name ve eat()
//    // ama constructorları yeniden tanımlamam şart
//    // super class'taki constructor subclass'ta mutlaka olmak zorunda
//    public Dog(String name, int species) {
//        super(name);
//        // super(name) şu anlama gelir:
//        // this.name = name;
//        this.species = "terrier";
//    }

    public Dog(String name, String species) {
        super(name);
        // super(name) aslında şu ifadeye denk gelir:
        // new Animal(name) constructor metodunu çağırmaya
        this.species = species;
    }
}
