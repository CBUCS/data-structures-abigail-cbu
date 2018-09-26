package IList;

public class Deque<T> implements List<T> {

    private List<T> Deque;

    private Deque() {
        Deque = new Queue<T>();
    }

    public boolean add(T item) {
        return false;
    }

    public boolean insertAt(int index, T item) {
        return false;
    }

    public boolean remove(T item) {
        return false;
    }

    public boolean removeAtIndex(int index) {
        return false;
    }

    public boolean clear() {
        return false;
    }

    public int size() {
        return 0;
    }

    public boolean contains(T item) {
        return false;
    }

    public T get(int index) {
        return null;
    }

    public boolean isEmpty() {
        return false;
    }
}
