
import static org.junit.jupiter.api.Assertions.*;





class MultiplicationTest {

    int a = 5;
    int b = 2;
    int c = 0;

    @org.junit.jupiter.api.Test
    public void multiplication() throws Exception {
        long result = Multiplication.multiplication(a,b);
        assertEquals(10, result);
        result = Multiplication.multiplication(a,c);
        assertEquals(0, result);
    }

    @org.junit.jupiter.api.Test
    void multiplyUsingLoop() {
    }

    @org.junit.jupiter.api.Test
    void multiplyUsingRecursion() {
    }

    @org.junit.jupiter.api.Test
    void multiplyUsingShift() {
    }

    @org.junit.jupiter.api.Test
    void multiplyUsingLogs() {
    }

    @org.junit.jupiter.api.Test
    void multiplyUsingLoopWithStringInput() {
    }

    @org.junit.jupiter.api.Test
    void multiplyUsingLoopWithIntegerInput() {
    }
}