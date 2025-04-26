public class Student03 {
    private String name;

    public Student03(String n) {  // method overloading: 1 arg
        name = n;
    }

    public Student03(String n, String prefix) {  // method overloading: 2 arg
        name = prefix + " " + n;
    }

    public Student03(String n, int count) {  // method overloading: 2 arg (String, int)
        name = "" + count + " " + n;
    }

    public void show() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student03 s = new Student03("Alice");
        s.show();
        Student03 s2 = new Student03("Bebelak");
        s2.show();
        Student03 s3 = new Student03("Tombiş", "Tatlı");
        s3.show();
        Student03 s4 = new Student03("Tombiş", 5);
        s4.show();
    }
}
