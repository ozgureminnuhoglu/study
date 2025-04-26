public class StaticVsInstance {
    public int x = 5;    // instance data member
    public static int y = 10;  // static data member

    public int f1() {    // instance method
        return 20;
    }

    public static int f2() {   // static method
        return 30;
    }

    public static void main(String[] args) {
        StaticVsInstance s1 = new StaticVsInstance();
        System.out.println("x: " + s1.x);
        System.out.println("StaticVsInstance.y = " + StaticVsInstance.y);
        System.out.println("s1.f1() = " + s1.f1());
        System.out.println("StaticVsInstance.f2() = " + StaticVsInstance.f2());
    }


}
