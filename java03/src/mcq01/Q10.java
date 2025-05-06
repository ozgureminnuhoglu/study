package mcq01;

public class Q10 {
    static int[] arr;

    public static int f(int low, int high, int num) {
        int mid = (low + high) / 2;
        if (low > high) {
            return low;
        } else if (arr[mid] < num) {
            return f(mid + 1, high, num);
        } else if (arr[mid] > num) {
            return f(low, mid - 1, num);
        } else // arr[mid] == num
        {
            return mid;
        }
    }

    public static void main(String[] args) {
        // adım adım debug etmeliyiz
        arr = new int[]{1, 3, 5, 7};
        int num = 4;
        int r1 = f(0, arr.length - 1, num); // f(0, 3, 4)
        System.out.println("r1 = " + r1);

        // şimdi f methodunu adım adım inceleyeceğiz
        int low = 0;
        int high = arr.length - 1;  // 3
        num = 4;
        // debug ederken tüm değişkenlere rastgele bir değer verebilirsin
        // aksi taktirde debug edemezsin

        int mid = (low + high) / 2; // 1
        boolean c1 = low > high; // false
        boolean c2 = arr[mid] < num; // arr[1] -> 3 -> 3 < 4 -> true
        f(mid + 1, high, num); // f(2, 3, 4)

        // 2. tur (f içindeki f içindeyiz)
        low = 2;
        high = arr.length - 1;  // 3
        num = 4;
        // high ve num aynı kaldı recursive call da
        // fakat low değişti
        // ilk başta 0 dı şimdi 2 oldu
        // niye?
        // çünkü mid + 1 değerini assign ettik

        mid = (low + high) / 2; // 2
        c1 = low > high; // false
        c2 = arr[mid] < num; // arr[2] -> 5 -> 5 < 4 -> true
        f(mid + 1, high, num); // f(3, 3, 4)

        // 3. tur ( f içindeki f içindeki f içindeyiz)
        low = 3;
        high = arr.length - 1;  // 3
        num = 4;

        mid = (low + high) / 2; // 3
        c1 = low > high; // false
        c2 = arr[mid] < num; // arr[3] -> 7 -> 7 < 4 -> false
        boolean c3 = arr[mid] > num; // arr[3] -> 7 -> 7 > 4 -> true
        f(low, mid - 1, num); // f(3, 2, 4)

        // 4. tur
        low = 3;
        high = 2;
        num = 4;
        mid = (low + high) / 2; // 2
        c1 = low > high; // true
        int result = low; // 3

    }
}
