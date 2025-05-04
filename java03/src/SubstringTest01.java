public class SubstringTest01 {
    public static void main(String[] args) {
        // [grok](https://grok.com/chat/a45b9d4c-1c8a-4f22-b793-38211e2a06c4)
        String y = "Hello, world!";
        String x = "world";

        boolean isSubstring = y.contains(x);
        System.out.println(isSubstring);  // Output: true

        String x2 = "xyz";
        System.out.println(y.contains(x2));  // Output: false
    }
}
