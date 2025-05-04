package test03;

import java.util.ArrayList;
import java.util.Arrays;

public class WordCheckerb {
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
        ArrayList<String> result = new ArrayList<>();
        for ( int i = 0; i < wordList.size(); i++ ) {
            String el = wordList.get(i);
            int index = el.indexOf(target);
            if (index == 0) {
                String r = el.substring(target.length());
                result.add(r);
            }
        }
        return result;
    }

    public WordCheckerb(ArrayList<String> wordList) {
        this.wordList = wordList;
    }

    public static void main(String[] args) {
        String[] w1 = {"catch", "bobcat", "catchacat", "cat", "at"};
        ArrayList<String> w2 = new ArrayList<>(Arrays.asList(w1));
        WordCheckerb wc = new WordCheckerb(w2);
        ArrayList<String> p2 = wc.createList("cat");
        System.out.println("p2 = " + p2);

        // 1. tur
        String target = "cat";
        String e0 = w2.get(0);
        int index0 = e0.indexOf(target);
        if (index0 == 0) {
            String r0 = e0.substring(target.length());
            System.out.println("r0 = " + r0);
        }

        // 2. tur
        String e1 = w2.get(1);
        int index1 = e1.indexOf(target);
        if (index1 == 0) {
            String r1 = e1.substring(target.length());
            System.out.println("r1 = " + r1);
        }

//        for (int i = 0; i < w2.size(); i++) {
//            int t =
//            String target = "cat";
//        }

//        for ( int i = 0; i < w2.size(); i++ ) {
//            String el = w2.get(i);
//            int index = el.indexOf(target);
//        }

        for ( int i = 0; i < w2.size(); i++ ) {
            String el = w2.get(i);
            int index = el.indexOf(target);
            if (index == 0) {
                String r = el.substring(target.length());
                System.out.println("r = " + r);
            }
        }


    }
}
