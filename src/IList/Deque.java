package IList;

//todo: redo...I don't think I did this right...

public class Deque<T> implements List<T> {

    private List<T> Deque;

    public Deque() {
        Deque = new Queue<T>();
    }

    public boolean add(T item) {
        return Deque.add(item);
    }

    public boolean insertAt(int index, T item) {
        return Deque.insertAt(index, item);
    }

    public boolean remove(T item) {
        return Deque.remove(item);
    }

    public boolean remove() {
        return Deque.removeAtIndex(0);
    }

    public boolean removeAtIndex(int index) {
        return Deque.removeAtIndex(index);
    }

    public boolean clear() {
        return Deque.clear();
    }

    public int size() {
        return Deque.size();
    }

    public boolean contains(T item) {
        return Deque.contains(item);
    }

    public T get(int index) {
        return Deque.get(index);
    }

    public boolean isEmpty() {
        return Deque.isEmpty();
    }
}
