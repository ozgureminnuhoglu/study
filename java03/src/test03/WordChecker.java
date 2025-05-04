package test03;

import java.util.ArrayList;

public class WordChecker {
    private ArrayList<String> wordList;

    public boolean isWordChain() {
        for (int i = 1; i < wordList.size(); i++) {
            String prev = wordList.get(i-1);
            String next = wordList.get(i);
            boolean t = next.contains(prev);
            System.out.println("t = " + t);
            if (!t) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<String> createList(String target) {
        // ...
        return new ArrayList<>();
    }

    public WordChecker(ArrayList<String> wordList) {
        this.wordList = wordList;
    }

    public static void main(String[] args) {
        ArrayList<String> w1 = new ArrayList<>();
        w1.add("an");
        w1.add("band");
        w1.add("band");
        w1.add("abandon");

        String e0 = w1.get(0);
        String e1 = w1.get(1);
        boolean t1 = e1.contains(e0);
        System.out.println("t1 = " + t1);

        String e2 = w1.get(2);
        boolean t2 = e2.contains(e1);
        System.out.println("t2 = " + t2);

        for (int i = 1; i < w1.size(); i++) {
            String prev = w1.get(i-1);
            String next = w1.get(i);
            boolean t = next.contains(prev);
            System.out.println("t = " + t);
        }

        System.out.println("WordChecker:");
        WordChecker wc = new WordChecker(w1);
        boolean t3 = wc.isWordChain();
        System.out.println("t3 = " + t3);

        ArrayList<String> w2 = new ArrayList<>();
        w2.add("to");
        w2.add("too");
        w2.add("stool");
        w2.add("tools");

        WordChecker wc2 = new WordChecker(w2);
        boolean t4 = wc2.isWordChain();
        System.out.println("t4 = " + t4);
    }
}
