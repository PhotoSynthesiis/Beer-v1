package classes.com.example.model;

public class Counter {
    private static int count = 0;

    public static synchronized int getCount() {
        count++;
        return count;
    }
}
