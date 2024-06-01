public class Driver {

    public static void main(String[] args) {
        
        Counter counter = new Counter();
        
        System.out.println("Count: " + counter.getCount());
        
        counter.increment();
        System.out.println("Count after incrementing by 1: " + counter.getCount());
        
        counter.increment(5);
        System.out.println("Count after incrementing by 5: " + counter.getCount());
        
        counter.decrement();
        System.out.println("Count after decrementing by 1: " + counter.getCount());
        
        counter.decrement(3);
        System.out.println("Count after decrementing by 3: " + counter.getCount());
    }
}
