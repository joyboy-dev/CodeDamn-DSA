
import java.util.Arrays;

public class _14 {
    public static void main(String[] args) {
        countingPrimes(50);
    }

    public static void countingPrimes(int range) {

        boolean[] primes = new boolean[range + 1];
        Arrays.fill(primes, true);

        for (int p = 2; p <= range; p++) {
            if (primes[p]) {
                for (int i = p * 2; i <= range; i += p) {
                    primes[i] = false;
                }
            }
        }
        for (int i = 2; i <= range; i++) {
            if (primes[i]) {
                System.out.println(i + "");
            }
        }
    }
}
