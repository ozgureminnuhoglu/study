public class SubstringTest03 {
    public static void main(String[] args) {
        // [grok](https://grok.com/chat/34af5390-d002-48bc-9b83-ec68c6b53aa9)
        String str = "Hello World";

        String s5 = str.substring(3);
        System.out.println("s5 = " + s5);

        // Example 1: Using substring(int beginIndex)
        String s1 = str.substring(6);
        System.out.println(s1);  // Output: World
        // Starts from index 6 (W) to the end

        // Example 2: Using substring(int beginIndex, int endIndex)
        String s2 = str.substring(0, 5);
        System.out.println(s2);  // Output: Hello
        // Starts from index 0 (H) to index 4 (o)

        // Example 3: Extracting a single character
        String s3 = str.substring(4, 5);
        System.out.println(s3);  // Output: o
        // From index 4 to 5

        // Example 4: Getting everything except first character
        String s4 = str.substring(1);
        System.out.println(s4);  // Output: ello World
    }
}
