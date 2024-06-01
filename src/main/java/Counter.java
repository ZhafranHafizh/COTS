package src.main.java;

public class Counter {

    private int count;

    public Counter() {
        this.reset();
    }

    public void reset() {
        count = 0;
    }

    public void increment() {
        count++;
    }

    public void increaseBy(int i) {
        count += i;
    }

    public void decrement() {
        count--;
    }

    public void decreaseBy(int i) {
        count -= i;
    }

    public void multiplyBy(int i) {
        count = count * i;
    }

    public void triple() {
        int i = 3;
        multiplyBy(i);
    }

    public void powerBy(int i) {
        count = count ^ i;
    }

    public boolean isCountEven() {
        return count % 2 == 0;
    }

    public int getCount() {
        return count;
    }

    // Long Method
    public void complexCalculation(int x, int y) {
        int result = 0;
        for (int i = 0; i < x; i++) {
            result += i * y;
        }
        for (int i = 0; i < y; i++) {
            result -= i * x;
        }
        count = result;
    }

    // Duplicate Code
    public void increaseByTwo() {
        count += 2;
    }

    public void addTwo() {
        count += 2;
    }

    // Primitive Obsession
    public void setToMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        count = max;
    }

    // Large Class
    public void printCount() {
        System.out.println("Count: " + count);
    }

    public void doubleCount() {
        count *= 2;
    }
}
