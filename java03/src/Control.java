import java.util.Scanner;

public class Control {
    public static void main(String[] args) {
//
//        ///////////////////////////////////////
//        // Control Structures
//        ///////////////////////////////////////
        System.out.println("\n->Control Structures");

        // If statements are c-like
        int j = 10;
        if (j == 10) {
            System.out.println("I get printed");
        } else if (j > 10) {
            System.out.println("I don't");
        } else {
            System.out.println("I also don't");
        }
//
        // While loop
        int fooWhile = 0;
        while (fooWhile < 10) {
            System.out.println(fooWhile);
            // Increment the counter
            // Iterated 100 times, fooWhile 0,1,2...99
            fooWhile++;
        }
        System.out.println("fooWhile Value: " + fooWhile);

        // Do While Loop
        int fooDoWhile = 0;
        do {
            System.out.println(fooDoWhile);
            // Increment the counter
            // Iterated 100 times, fooDoWhile 0->99
            fooDoWhile++;
        } while (fooDoWhile < 20);
        System.out.println("fooDoWhile Value: " + fooDoWhile);

        // For Loopint fooFor; // Declare outside loop
        int fooFor;
        for (fooFor = 0; fooFor < 10; fooFor++) {
            System.out.println(fooFor);
            // Iterated 10 times, fooFor 0->9
        }
        System.out.println("fooFor Value: " + fooFor);

        // Nested For Loop Exit with Label
        outer:
        for (int u = 0; u < 10; u++) {
            for (int t = 0; t < 10; t++) {
                if (u == 5 && t ==5) {
                    break outer;
                    // breaks out of outer loop instead of only the inner one
                }
            }
        }
//
        // For Each Loop
        // The for loop is also able to iterate over arrays as well as objects
        // that implement the Iterable interface.
        int[] fooList = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // for each loop structure => for (<object> : <iterable>)
        // reads as: for each element in the iterable
        // note: the object type must match the element type of the iterable.
        for (int bar : fooList) {
            System.out.println(bar);
            //Iterates 9 times and prints 1-9 on new lines
        }
//
//        // Switch Case
//        // A switch works with the byte, short, char, and int data types.
//        // It also works with enumerated types (discussed in Enum Types), the
//        // String class, and a few special classes that wrap primitive types:
//        // Character, Byte, Short, and Integer.
//        // Starting in Java 7 and above, we can also use the String type.
//        // Note: Do remember that, not adding "break" at end any particular case ends up in
//        // executing the very next case(given it satisfies the condition provided) as well.
        int month = 3;
        String monthString;
        switch (month) {
            case 1: monthString = "January";
                break;
            case 2: monthString = "February";
                break;
            case 3: monthString = "March";
                break;
            default: monthString = "Some other month";
                break;
        }
        System.out.println("Switch Case Result: " + monthString);

        // Conditional Shorthand
        // You can use the '?' operator for quick assignments or logic forks.
        // Reads as "If (statement) is true, use <first value>, otherwise, use
        // <second value>"
        Scanner foo = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = foo.nextInt();
        String bar = (num < 10) ? "A" : "B";
        System.out.println(num + "<10 " + bar); // Prints "bar : A", because the
        // statement is true.
        // Or simply
        System.out.println(num + "<10 " + (num < 10 ? "true" : "false"));

    }

}
