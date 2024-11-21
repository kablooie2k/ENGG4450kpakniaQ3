import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PrimesTest {
    long a = 75;
    long b = 0;
    @Test
   public void getPrimeFactorization()  {
    }

    @Test
   public void isPrime() throws Exception{
        boolean result = Primes.isPrime(a);
        assertFalse(result);
        result = Primes.isPrime(b);
        assertFalse(result);
    }

    @Test
    void sieveOfEratosthenes() {
    }
}