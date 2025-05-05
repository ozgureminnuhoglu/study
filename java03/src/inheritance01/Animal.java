package inheritance01;

public class Animal {
    // [grok](https://grok.com/chat/d5910902-fde3-4861-a0ad-e25a8f98fc70)
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method in parent class
    public void eat() {
        System.out.println(name + " is eating.");
    }
}
