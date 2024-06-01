package src.test.java;

import org.junit.Before;
import org.junit.Test;
import src.main.java.Counter;

import static org.junit.Assert.*;

public class CounterTest {

    private Counter counter;

    @Before
    public void setUp() {
        counter = new Counter();
    }

    @Test
    public void testReset() {
        counter.increment();
        counter.reset();
        assertEquals(0, counter.getCount());
    }

    @Test
    public void testIncrement() {
        counter.increment();
        assertEquals(1, counter.getCount());
    }

    @Test
    public void testIncreaseBy() {
        counter.increaseBy(5);
        assertEquals(5, counter.getCount());
    }

    @Test
    public void testDecrement() {
        counter.increment();
        counter.decrement();
        assertEquals(0, counter.getCount());
    }

    @Test
    public void testDecreaseBy() {
        counter.increaseBy(5);
        counter.decreaseBy(2);
        assertEquals(3, counter.getCount());
    }

    @Test
    public void testMultiplyBy() {
        counter.increaseBy(3);
        counter.multiplyBy(2);
        assertEquals(6, counter.getCount());
    }

    @Test
    public void testTriple() {
        counter.increaseBy(2);
        counter.triple();
        assertEquals(6, counter.getCount());
    }

    @Test
    public void testPowerBy() {
        counter.increaseBy(2);
        counter.powerBy(3);
        assertEquals(1, counter.getCount()); // 2 ^ 3 = 1 (bitwise XOR)
    }

    @Test
    public void testIsCountEven() {
        assertTrue(counter.isCountEven());
        counter.increment();
        assertFalse(counter.isCountEven());
    }

    // @Test
    // public void testComplexCalculation() {
    //     counter.complexCalculation(2, 3);
    //     assertEquals(-1, counter.getCount()); // Calculation: result = (0*3 + 1*3) - (0*2 + 1*2 + 2*2) = 3 - 6 = -3
    // }

    @Test
    public void testIncreaseByTwo() {
        counter.increaseByTwo();
        assertEquals(2, counter.getCount());
    }

    @Test
    public void testAddTwo() {
        counter.addTwo();
        assertEquals(2, counter.getCount());
    }

    @Test
    public void testSetToMax() {
        counter.setToMax(1, 2, 3);
        assertEquals(3, counter.getCount());
    }

    @Test
    public void testPrintCount() {
        counter.printCount();
    }

    @Test
    public void testDoubleCount() {
        counter.increaseBy(3);
        counter.doubleCount();
        assertEquals(4, counter.getCount());
    }
}
