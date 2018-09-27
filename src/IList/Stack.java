package IList;

public class Stack<T> implements List<T> {

    private List<T> Stack;

    public Stack() {
        Stack = new LinkedList<>();
    }

    public boolean add(T item) {
        return Stack.add(item);
    }

    public boolean insertAt(int index, T item) {
        return Stack.insertAt(index, item);
    }

    public boolean remove(T item) {
        return Stack.remove(item);
    }

    public boolean removeAtIndex(int index) {
        return Stack.removeAtIndex(index);
    }

    public boolean clear() {
        return Stack.clear();
    }

    public int size() {
        return Stack.size();
    }

    public boolean contains(T item) {
        return Stack.contains(item);
    }

    public T get(int index) {
        return Stack.get(index) ;
    }

    public boolean isEmpty() {
        return Stack.isEmpty();
    }
}
