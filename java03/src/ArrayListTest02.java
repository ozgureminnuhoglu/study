import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest02 {
    public static void main(String[] args) {
        // [grok](https://grok.com/chat/a45b9d4c-1c8a-4f22-b793-38211e2a06c4)
        String[] fruits = {"Apple", "Banana", "Orange"};
        ArrayList<String> fruitList = new ArrayList<>(Arrays.asList(fruits));
        System.out.println("fruitList = " + fruitList);
    }
}
