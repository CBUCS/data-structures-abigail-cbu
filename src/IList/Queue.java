package IList;

public class Queue<T> implements List<T> {

    private List<T> Queue;

    public Queue() {
        Queue = new LinkedList<T>();
    }

    /**
     * Adds Object to the end of the Queue
     *
     * @param item
     * @return true if object was added;
     * false if there is no LinkList to add to
     */
    public boolean add(T item) {
        return Queue.add(item);
    }

    public boolean insertAt(int index, T item) {
        return Queue.insertAt(index, item);
    }

    public boolean remove() {
        return Queue.removeAtIndex(0);
    }

    /**
     * First index is always removed
     * @param item
     * @return
     */
    public boolean remove(T item) {
        return Queue.remove(item);
    }

    public boolean removeAtIndex(int index) {
        return Queue.removeAtIndex(index);
    }

    public boolean clear() {
        return Queue.clear();
    }

    public int size() {
        return Queue.size();
    }

    public boolean contains(T item) {
        return Queue.contains(item);
    }

    /**
     * Gets object from specified index
     *
     * @param index
     * @return can return null if doesn't exist
     */
    public T get(int index) {
        return Queue.get(index);
    }

    public boolean isEmpty() {
        return Queue.isEmpty();
    }
}
