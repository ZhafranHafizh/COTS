package src.test.java;

import static org.junit.Assert.*;
import src.main.java.*;
import org.junit.Test;

public class CounterTest {

    @Test
    public void testReset() {
        Counter testCounter = new Counter();
        
        for(int i = 0; i < 10; i++) {
            testCounter.increment();
        }
        
        testCounter.reset();
        
        assertEquals(0, testCounter.getCount());
    }

    @Test
    public void testIncrement() {
        Counter testCounter = new Counter();
        
        for(int i = 1; i < 10; i++) {
            testCounter.increment();
            assertEquals(i, testCounter.getCount());
        }
    }

    @Test
    public void testDecrement() {
        Counter testCounter = new Counter();
        
        for(int i = 1; i < 10; i++) {
            testCounter.decrement();
            assertEquals(i * -1, testCounter.getCount());
        }
    }

    @Test
    public void testIncreaseBy() {
        Counter testCounter = new Counter();
        testCounter.increaseBy(5);
        assertEquals(5, testCounter.getCount());
        
        testCounter.increaseBy(10);
        assertEquals(15, testCounter.getCount());
    }

    @Test
    public void testDecreaseBy() {
        Counter testCounter = new Counter();
        testCounter.decreaseBy(5);
        assertEquals(-5, testCounter.getCount());
        
        testCounter.decreaseBy(10);
        assertEquals(-15, testCounter.getCount());
    }

    @Test
    public void testMultiplyBy() {
        Counter testCounter = new Counter();
        testCounter.increaseBy(5);
        testCounter.multiplyBy(3);
        assertEquals(15, testCounter.getCount());
        
        testCounter.multiplyBy(0);
        assertEquals(0, testCounter.getCount());
    }

    @Test
    public void testTriple() {
        Counter testCounter = new Counter();
        testCounter.increaseBy(2);
        testCounter.triple();
        assertEquals(6, testCounter.getCount());
        
        testCounter.triple();
        assertEquals(18, testCounter.getCount());
    }

    @Test
    public void testPowerBy() {
        Counter testCounter = new Counter();
        testCounter.increaseBy(2);
        testCounter.powerBy(3); // 2 ^ 3 = 1 (binary XOR)
        assertEquals(1, testCounter.getCount());
        
        testCounter.powerBy(1); // 1 ^ 1 = 0 (binary XOR)
        assertEquals(0, testCounter.getCount());
    }

    @Test
    public void testIsCountEven() {
        Counter testCounter = new Counter();
        assertTrue(testCounter.isCountEven());
        
        testCounter.increment();
        assertFalse(testCounter.isCountEven());
        
        testCounter.increment();
        assertTrue(testCounter.isCountEven());
    }

    @Test
    public void testComplexCalculation() {
        Counter testCounter = new Counter();
        testCounter.complexCalculation(2, 3);
        assertEquals(-3, testCounter.getCount());
        
        testCounter.complexCalculation(5, 2);
        assertEquals(-5, testCounter.getCount());
    }

    @Test
    public void testIncreaseByTwoAndAddTwo() {
        Counter testCounter = new Counter();
        testCounter.increaseByTwo();
        assertEquals(2, testCounter.getCount());
        
        testCounter.addTwo();
        assertEquals(4, testCounter.getCount());
    }

    @Test
    public void testSetToMax() {
        Counter testCounter = new Counter();
        testCounter.setToMax(3, 7, 5);
        assertEquals(7, testCounter.getCount());
        
        testCounter.setToMax(10, 3, 5);
        assertEquals(10, testCounter.getCount());
    }

    @Test
    public void testPrintCount() {
        Counter testCounter = new Counter();
        testCounter.increment();
        testCounter.printCount();  // This will print to the console, not really testable
    }

    @Test
    public void testDoubleCount() {
        Counter testCounter = new Counter();
        testCounter.increaseBy(5);
        testCounter.doubleCount();
        assertEquals(10, testCounter.getCount());
        
        testCounter.doubleCount();
        assertEquals(20, testCounter.getCount());
    }
}
