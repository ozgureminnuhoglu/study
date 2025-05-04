import java.util.ArrayList;

public class ArrayListTest01 {
    // [grok](https://grok.com/chat/a45b9d4c-1c8a-4f22-b793-38211e2a06c4)
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Bob");
        names.add("Filiz");
        System.out.println("names = " + names);
        names.add(1, "David");
        System.out.println("names = " + names);

        String el0 = names.get(0);
        System.out.println("el0 = " + el0);
        String el2 = names.get(2);
        System.out.println("el2 = " + el2);

        names.remove(1);
        System.out.println("names = " + names);

        System.out.println("names.size() = " + names.size());

        for (int i = 0; i < names.size(); i++) {
            String el = names.get(i);
            System.out.println("el = " + el);
        }

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(12);
        nums.add(30);

        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum = sum + nums.get(i);
        }
        System.out.println("sum = " + sum);
    }
}
