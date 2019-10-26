package Count_Primes_204;

/**
 * Count the number of prime numbers less than a non-negative number, n.
 * <p>
 * Example:
 * <p>
 * Input: 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */
class Solution {
    public int countPrimes(int n) {
        if(n <=2) return 0;
        boolean[] notPrime = new boolean[n + 1];
        int count = 1;
        for (int i = 3; i < n; i+=2) {
            if (!notPrime[i]) {
                count++;
                for (int j = i; j <= n / i; j+=2) {
                    notPrime[i * j] = true;
                }
            }
        }
        return count;
    }
}