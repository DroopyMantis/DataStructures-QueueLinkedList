public interface Queue {
    void enqueue(String x);
    public String dequeue();
    public String first();
    public int size();
    public boolean isEmpty();
}