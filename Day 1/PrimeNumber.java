public class PrimeNumber {
    public static boolean isPrime(int n) {
        // int count = 0;
        if (n < 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void PrimeNumbers(int a, int l) {
        for (int i = a; i <= l; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        PrimeNumbers(1, 100);
    }
}
