public class ArrayTest01 {
    public static void main(String[] args) {
        // [grok](https://grok.com/chat/4892ed30-945c-452e-a4ba-4f0ca3f94f0c)
        int[] numbers;  // Declares an array of integers
        String[] names; // Declares an array of strings

        numbers = new int[5];  // Creates an array that can hold 5 integers

        int[] numbers2 = new int[5];

        // Assigning values a01:
        numbers[0] = 10;  // First element
        numbers[1] = 20;  // Second element
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // a02: tek seferde
        int[] numbers3 = {10, 20, 30, 40, 50};

        // accessing:
        System.out.println("numbers3[0] = " + numbers3[0]);

        // for loop:
        for (int i = 0; i < numbers3.length; i++) {
            System.out.println("numbers3 = " + numbers3[i]);
        }
    }
}
