public class LearnJava04 {
    public static void main(String[] args) {
//        // Arrays
//        // The array size must be decided upon instantiation
//        // The following formats work for declaring an array
//        // <datatype>[] <var name> = new <datatype>[<array size>];
//        // <datatype> <var name>[] = new <datatype>[<array size>];
        int[] intArray = new int[10];
        String[] stringArray = new String[1];
        boolean boolArray[] = new boolean[100];

        // Another way to declare & initialize an array
        int[] y = {9000, 1000, 1337};
        String names[] = {"Bob", "John", "Fred", "Juan Pedro"};
        boolean bools[] = {true, false, false};
        System.out.println("y0 : "+ y[0] );
        System.out.println("y1 : "+ y[1] );
        System.out.println("y2 : "+ y[2] );
        System.out.println("names0 : "+ names[0]);
        System.out.println("names1 : "+ names[1]);
        System.out.println("names2 : "+ names[2]);
        System.out.println("bools0 : "+ bools[0]);
        System.out.println("bools1 : "+ bools[1]);
        System.out.println("bools2 : "+ bools[2]);
        // Indexing an array - Accessing an element
        System.out.println("intArray @ 0: " + intArray[0]);

        // Arrays are zero-indexed and mutable.
        intArray[1] = 1;
        System.out.println("intArray @ 1: " + intArray[1]); // => 1

//        // Other data types worth checking out
//        // ArrayLists - Like arrays except more functionality is offered, and
//        //              the size is mutable.
//        // LinkedLists - Implementation of doubly-linked list. All of the
//        //               operations perform as could be expected for a
//        //               doubly-linked list.
//        // Maps - A mapping of key Objects to value Objects. Map is
//        //        an interface and therefore cannot be instantiated.
//        //        The type of keys and values contained in a Map must
//        //        be specified upon instantiation of the implementing
//        //        class. Each key may map to only one corresponding value,
//        //        and each key may appear only once (no duplicates).
//        // HashMaps - This class uses a hashtable to implement the Map
//        //            interface. This allows the execution time of basic
//        //            operations, such as get and insert element, to remain
//        //            constant-amortized even for large sets.
//        // TreeMap - A Map that is sorted by its keys. Each modification
//        //           maintains the sorting defined by either a Comparator
//        //           supplied at instantiation, or comparisons of each Object
//        //           if they implement the Comparable interface.
//        //           Failure of keys to implement Comparable combined with failure to
//        //           supply a Comparator will throw ClassCastExceptions.
//        //           Insertion and removal operations take O(log(n)) time
//        //           so avoid using this data structure unless you are taking
//        //           advantage of the sorting.

    }
}
