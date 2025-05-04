public class Array2DTest01 {
    public static void main(String[] args) {
        // [grok](https://grok.com/chat/a5f14507-b773-42c5-9684-2104b1f94ef8)
        int[][] numbers = {
                {1, 2, 3},  // Row 0: array
                {4, 5, 6},  // Row 1: array
                {7, 8, 9},   // Row 2: array
                {10, 11, 12}   // Row 4: array
        };
        // Aslında Row 0: {1, 2, 3}
        // Bu kendisi aslında tek boyutlu bir array
        // yani 2 boyutlu array aslında n tane tek boyutlu arrayden oluşur
        System.out.println("numbers[0][1] = " + numbers[0][1]);

        System.out.println("numbers.length = " + numbers.length);
        for (int i = 0; i < numbers.length; i++) {  // outer loop
            for (int j = 0; j < numbers[i].length; j++) {  // inner loop
                System.out.println("numbers = " + numbers[i][j]);
            }
            System.out.println();
        }
    }
}
