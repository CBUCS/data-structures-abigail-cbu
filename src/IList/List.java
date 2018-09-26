package IList;

public interface List<T> {

    boolean add(T item);

    boolean insertAt(int index, T item);

    boolean remove(T item);

    boolean removeAtIndex(int index);

    boolean clear();

    int size();

    boolean contains(T item);

    T get(int index);

    boolean isEmpty();

}
