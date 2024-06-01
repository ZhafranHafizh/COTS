import src.main.java.Counter;

public class Driver {

    public static void main(String[] args) {
        
        Counter counter = new Counter();
        
        System.out.println("Count: " + counter.getCount());
        
        counter.increment();
        System.out.println("After increment: Count: " + counter.getCount());
        
        counter.decrement();
        System.out.println("After decrement: Count: " + counter.getCount());
        
        // Calling complexCalculation to add complexity
        counter.complexCalculation(3, 4);
        System.out.println("After complex calculation: Count: " + counter.getCount());
    }
}
