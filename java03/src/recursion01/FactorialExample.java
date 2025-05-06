package recursion01;

public class FactorialExample {
    public static int factorial(int n) {
        // Base case: if n is 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n * factorial of (n-1)
        return n * factorial(n - 1);
        // factorial methodu içinde kendi kendini çağırıyoruz = özyineleme = recursion diyoruz
        // niye bunu yapıyoruz?
        // bu sayede for/while loop kullanmadan döngü yapmış oluyoruz
    }

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("Factorial of 5 is: " + result); // Output: 120

        // factorial(5)
        // n <- 5
        // n * factorial(n - 1);
        // 5 * factorial(4)

        // factorial(4)
        // n <- 4
        // n * factorial(n - 1);
        // 4 * factorial(3)

        // factorial(3)
        // n <- 3
        // n * factorial(n - 1);
        // 3 * factorial(2)

        // factorial(2)
        // n <- 2
        // n * factorial(n - 1);
        // 2 * factorial(1)

        // factorial(1)
        // n <- 1
        // 1

        // factorial(2)
        // 2 * factorial(1)
        // 2 * 1

        // factorial(3)
        // 3 * factorial(2)
        // 3 * 2 = 6

        // factorial(4)
        // 4 * factorial(3)
        // 4 * 6 = 24

        // factorial(5)
        // 5 * factorial(4)
        // 5 * 24 = 120
    }
}
