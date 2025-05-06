package mcq01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q03 {
    public static void mystery(List<Integer> nums) {
        for (int k = 0; k < nums.size(); k++) {
            if (nums.get(k).intValue() == 0) {
                nums.remove(k);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 4, 2, 5, 0, 3, 0};
        List<Integer> values = new ArrayList<>();
        for (int num : arr) {
            values.add(num);
        }
        System.out.println("values = " + values);
        List<Integer> nums = new ArrayList<>(values);
        mystery(values);
        System.out.println("values = " + values);
        // values = [0, 4, 2, 5, 3]

        // neden başta 0 var?
        // bu tip durumlarda step by step debug edeceğiz

        // birinci step: loop un birinci turu

        // nums = [0, 0, 4, 2, 5, 0, 3, 0]
        int k = 0;
        if (nums.get(k).intValue() == 0) {
            nums.remove(k);
        }
        System.out.println("k = " + k);
        System.out.println("nums = " + nums);
        // nums = [0, 4, 2, 5, 0, 3, 0]

        // ikinci tur
        // şimdi ikinci turda k = 1 alıyoruz
        // ancak şu an nums objesi 7 öğeden oluşuyor
        // ilk öğe silinmiş durumda
        // k = 1 indeksine gidince, eski nums objesindeki 2. objeye gittiğimizi zannederken, aslında 3. objeyi alıyoruz
        k = 1;
        if (nums.get(k).intValue() == 0) {
            nums.remove(k);
        }
        System.out.println("k = " + k);
        System.out.println("nums = " + nums);

        // 3. tur
        k = 2;
        if (nums.get(k).intValue() == 0) {
            nums.remove(k);
        }
        System.out.println("k = " + k);
        System.out.println("nums = " + nums);

        // 4. tur
        k = 3;
        if (nums.get(k).intValue() == 0) {
            nums.remove(k);
        }
        System.out.println("k = " + k);
        System.out.println("nums = " + nums);

        // 5. tur
        k = 4;
        if (nums.get(k).intValue() == 0) {
            nums.remove(k);
        }
        System.out.println("k = " + k);
        System.out.println("nums = " + nums);

        // 6. tur
        k = 5;
        if (nums.get(k).intValue() == 0) {
            nums.remove(k);
        }
        System.out.println("k = " + k);
        System.out.println("nums = " + nums);


    }
}
