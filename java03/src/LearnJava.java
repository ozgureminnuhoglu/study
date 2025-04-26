// Import ArrayList class inside of the java.util package

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LearnJava {

    // In order to run a java program, it must have a main method as an entry
    // point.
    public static void main(String[] args) {

        ///////////////////////////////////////
        // Input/Output
        ///////////////////////////////////////

        /*
         * Output
         */

        // Use System.out.println() to print lines.
        System.out.println("Hello World!");
        System.out.println("Integer: " + 10 +
                " Double: " + 3.14 +
                " Boolean: " + true);

//        // To print without a newline, use System.out.print().
        System.out.print("Hello ");
        System.out.print("World  ");
//
//        // Use System.out.printf() for easy formatted printing.
        System.out.printf("pi = %.5f", Math.PI); // => pi = 3.14159
//
//

        // String Building
        // #1 - with plus operator
        // That's the basic way to do it (optimized under the hood)
        String plusConcatenated = "Strings can " + "be concatenated " + "via + operator.";
        System.out.println(plusConcatenated);
        // Output: Strings can be concatenated via + operator.

//        // #2 - with StringBuilder
//        // This way doesn't create any intermediate strings. It just stores the string pieces, and ties them together
//        // when toString() is called.
//        // Hint: This class is not thread safe. A thread-safe alternative (with some impact on performance) is StringBuffer.
        StringBuilder exampleFirst = new StringBuilder();
        exampleFirst.append("You ");
        exampleFirst.append("can use ");
        exampleFirst.append("the StringBuilder class.");
        System.out.println(exampleFirst); // only now is the string built
//        // Output: You can use the StringBuilder class.
//
        // StringBuilder is efficient when the fully constructed String is not required until the end of some processing.
        StringBuilder stringBuilder = new StringBuilder();
        String inefficientString = "";
        for (int i = 0; i <= 20; i = i + 2) {
            stringBuilder.append(i).append(" ");
            inefficientString += i + " ";
//            System.out.println(stringBuilder);
        }
        System.out.println(inefficientString);
        System.out.println(stringBuilder);
//        // inefficientString requires a lot more work to produce, as it generates a String on every loop iteration.
//        // Simple concatenation with + is compiled to a StringBuilder and toString()
//        // Avoid string concatenation in loops.
//
//        // #3 - with String formatter
//        // Another alternative way to create strings. Fast and readable.
//        String.format("%s may prefer %s.", "Or you", "String.format()");
//        // Output: Or you may prefer String.format().
//

    }
}
