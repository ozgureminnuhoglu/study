public class Student {
    private String name; // Instance variable

    // Constructor
    public Student(String n) {
        name = n; // Initialize the name field
    }

    public static void main(String[] args) {
        Student s = new Student("Alice"); // Constructor called here
        System.out.println("s.name = " + s.name);
        Student s2 = new Student("Bebelak"); // Constructor called here
        System.out.println("s2.name = " + s2.name);
    }
}
