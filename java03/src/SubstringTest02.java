public class SubstringTest02 {
    public static void main(String[] args) {
        // [grok](https://grok.com/chat/a45b9d4c-1c8a-4f22-b793-38211e2a06c4)
        String y = "Hello, world!";
        String x = "world";

        int index = y.indexOf(x);
        boolean isSubstring = (index != -1);
        System.out.println(isSubstring);  // Output: true
        System.out.println("Found at index: " + index);  // Output: Found at index: 7

        String x2 = "xyz";
        index = y.indexOf(x2);
        System.out.println(index != -1);  // Output: false

    }
}
