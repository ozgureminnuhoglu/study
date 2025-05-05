package exmp02;

public class hamburger {
    private String brand;
    private int price;

    public void priceTag(int increase){
        this.price =this.price +increase;
    }
    public hamburger(String hamburgerBrand){
        this.brand = hamburgerBrand;
        this.price =10;
    }

    public static void main(String[] agrs) {
        hamburger h1 = new hamburger("mcdonalds");
        h1.priceTag(5);
        System.out.println("hamburger brand: "+h1.brand);
        System.out.println("hamburger's price: "+ h1.price);
    }
}
