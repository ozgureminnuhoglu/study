public class Student02 {
    private String name; // Instance variable

    // Constructor
    public Student02(String n) {
        name = n; // Initialize the name field
    }

    public void show() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student02 s = new Student02("Alice"); // Constructor called here
        s.show();
        Student02 s2 = new Student02("Bebelak"); // Constructor called here
        s2.show();
    }
}
